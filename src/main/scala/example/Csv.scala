package example

import example.macros.CsvMacro
import example.macros.CsvMacro.Csv
import scala.language.experimental.{macros => m}

trait LPCsv {
  implicit def deriveCsv[A]: Csv[A] = macro CsvMacro.csvImpl[A]
}

object csv extends LPCsv {
  implicit val csvStr: Csv[String] = new Csv[String] { def apply(a: String): List[String] = List(a) }

  implicit def csvSeq[A](implicit ca: Csv[A]): Csv[Seq[A]] = new Csv[Seq[A]] {
    def apply(a: Seq[A]): List[String] = a.flatMap(ca(_)).toList
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
