package example.macros

import example.Csv
import scala.reflect.macros.whitebox.Context

object CsvMacro {
  def csvImpl[A: c.WeakTypeTag](c: Context): c.Expr[Csv[A]] = {
    import c.universe._

    val tpe = c.weakTypeOf[A]

    // println(s"Deriving Csv[$tpe]")

    val accumulated = tpe.decls
      .collect { case m: MethodSymbol if m.isCaseAccessor =>
        q"implicitly[Csv[${m.returnType.asSeenFrom(tpe, tpe.typeSymbol)}]].apply(x.${m.name})" }
      .foldLeft(q"List[String]()")((acc, x) => q"$acc ++ $x")

    c.Expr[Csv[A]](q"new Csv[$tpe] { def apply(x: $tpe): List[String] = $accumulated }")
  }
}
