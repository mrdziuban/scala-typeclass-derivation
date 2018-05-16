package example.macros

import scala.reflect.macros.whitebox.Context

object ExampleMacro {
  trait Csv[A] { def apply(a: A): List[String] }

  def csvImpl[A: c.WeakTypeTag](c: Context): c.Tree = {
    import c.universe._

    val tpe = c.weakTypeOf[A]

    if (!tpe.typeSymbol.isClass) c.abort(c.enclosingPosition, "Type must be a case class")

    val accumulated = tpe.decls.collect {
      case m: MethodSymbol if m.isCaseAccessor => q"implicitly[Csv[${m.returnType}]].apply(value.${m.name})"
    }.foldLeft(q"List[String]()")((a, b) => q"$a ++ $b")

    q"new Csv[$tpe] { def apply(value: $tpe): List[String] = $accumulated }"
  }
}
