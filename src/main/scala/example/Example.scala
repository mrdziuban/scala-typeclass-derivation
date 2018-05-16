package example

import example.macros.ExampleMacro
import example.macros.ExampleMacro.Csv
import scala.language.experimental.{macros => m}

trait LPCsv {
  implicit def deriveCsv[A]: Csv[A] = macro ExampleMacro.csvImpl[A]
}

object Example extends LPCsv {
  implicit val csvStr: Csv[String] = new Csv[String] { def apply(a: String): List[String] = List(a) }
  implicit val csvInt: Csv[Int] = new Csv[Int] { def apply(a: Int): List[String] = List(a.toString) }
  implicit val csvBool: Csv[Boolean] = new Csv[Boolean] { def apply(a: Boolean): List[String] = List(a.toString) }

  implicit def csvSeq[A](implicit sa: Csv[A]): Csv[Seq[A]] = new Csv[Seq[A]] {
    def apply(a: Seq[A]): List[String] = a.flatMap(sa(_)).toList
  }

  case class Foo(s: String)
  case class Wrapper[A](a: A)

  // Deriving this results in a diverging implicit error
  case class Test(wrapper: Seq[Wrapper[Foo]])

  implicitly[Csv[Test]]
}


