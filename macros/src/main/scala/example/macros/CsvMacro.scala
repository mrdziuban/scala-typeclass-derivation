package example.macros

import scala.language.experimental.{macros => m}
import scala.reflect.macros.whitebox.Context

trait Csv[A] { def apply(a: A): List[String] }

object Csv {
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

  implicit def deriveCsv[A]: Csv[A] = macro csvImpl[A]
}
