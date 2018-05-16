package example.macros

import scala.reflect.macros.whitebox.Context

object ExampleMacro {
  trait Csv[A] { def apply(a: A): List[String] }

  def csvImpl[A: c.WeakTypeTag](c: Context): c.Expr[Csv[A]] = {
    import c.universe._

    val tpe = c.weakTypeOf[A]

    if (!(tpe.typeSymbol.isClass && tpe.typeSymbol.asClass.isCaseClass))
      c.abort(c.enclosingPosition, "Type must be a case class")

    val methods = tpe.decls.collect { case m: MethodSymbol if m.isCaseAccessor => m }

    println(s"""
    |Deriving Csv[$tpe]
    |${methods.map { m =>
          val ret = m.returnType.asSeenFrom(tpe, tpe.typeSymbol)
          s"  Found method ${m.name}: $ret\n    Resolving with `implicitly[Csv[$ret]]`"
        }.mkString("\n")}
    |""".stripMargin)

    val accumulated = methods
      .map(m => q"implicitly[Csv[${m.returnType.asSeenFrom(tpe, tpe.typeSymbol)}]]")
      .reduceLeft((acc, x) => q"$acc ++ $x")

    c.Expr[Csv[A]](q"new Csv[$tpe] { def apply(value: $tpe): List[String] = $accumulated }")
  }
}
