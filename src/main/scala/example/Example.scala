package example

import example.macros.ExampleMacro
import example.macros.ExampleMacro.Csv
import scala.language.experimental.{macros => m}

trait LPCsv {
  implicit def deriveCsv[A]: Csv[A] = macro ExampleMacro.csvImpl[A]
}

object Example extends LPCsv {
  implicit val csvStr: Csv[String] = new Csv[String] { def apply(a: String): List[String] = List(a) }

  implicit def csvSeq[A](implicit sa: Csv[A]): Csv[Seq[A]] = new Csv[Seq[A]] {
    def apply(a: Seq[A]): List[String] = a.flatMap(sa(_)).toList
  }

  case class Foo(s: String)
  case class TypeParam[A](a: A)

  case class Wrapper(tp: TypeParam[Foo])
  case class TypeParamWrapper[A](tp: TypeParam[A])

  // Deriving this compiles
  // implicitly[Csv[Seq[TypeParamWrapper[Foo]]]]

  // Deriving this results in a diverging implicit error
  implicitly[Csv[Seq[Wrapper]]]
}
