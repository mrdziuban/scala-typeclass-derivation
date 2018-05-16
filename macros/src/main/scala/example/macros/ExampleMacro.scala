package example.macros

import scala.language.experimental.macros
import scala.reflect.macros.blackbox.Context

object ExampleMacro {
  def go[A]: Unit = macro goImpl[A]

  def goImpl[A: c.WeakTypeTag](c: Context): c.Tree = {
    import c.universe._
    val tpe = c.weakTypeOf[A]
    if (!tpe.typeSymbol.isClass) c.abort(c.enclosingPosition, s"$tpe is not a class") else q"()"
  }
}
