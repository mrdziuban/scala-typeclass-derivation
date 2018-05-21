package example.macroDerivation

import example.CaseClasses._
import example.macros.Csv

object Example {
  implicit val csvStr: Csv[String] = new Csv[String] { def apply(a: String): List[String] = List(a) }
  implicit val csvInt: Csv[Int] = new Csv[Int] { def apply(a: Int): List[String] = List(a.toString) }
  implicit val csvLong: Csv[Long] = new Csv[Long] { def apply(a: Long): List[String] = List(a.toString) }
  implicit val csvShort: Csv[Short] = new Csv[Short] { def apply(a: Short): List[String] = List(a.toString) }
  implicit val csvByte: Csv[Byte] = new Csv[Byte] { def apply(a: Byte): List[String] = List(a.toString) }
  implicit val csvDouble: Csv[Double] = new Csv[Double] { def apply(a: Double): List[String] = List(a.toString) }
  implicit val csvBool: Csv[Boolean] = new Csv[Boolean] { def apply(a: Boolean): List[String] = List(a.toString) }

  implicit def csvSeq[A](implicit ca: Csv[A]): Csv[Seq[A]] = new Csv[Seq[A]] {
    def apply(a: Seq[A]): List[String] = a.flatMap(ca(_)).toList
  }

  implicit def csvOpt[A](implicit ca: Csv[A]): Csv[Option[A]] = new Csv[Option[A]] {
    def apply(a: Option[A]): List[String] = a.map(ca(_)).getOrElse(List("null"))
  }

  implicitly[Csv[Test1]]
  implicitly[Csv[Wrapper1[Test1]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test1]]]]
  implicitly[Csv[Test2]]
  implicitly[Csv[Wrapper1[Test2]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test2]]]]
  implicitly[Csv[Test3]]
  implicitly[Csv[Wrapper1[Test3]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test3]]]]
  implicitly[Csv[Test4]]
  implicitly[Csv[Wrapper1[Test4]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test4]]]]
  implicitly[Csv[Test5]]
  implicitly[Csv[Wrapper1[Test5]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test5]]]]
  implicitly[Csv[Test6]]
  implicitly[Csv[Wrapper1[Test6]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test6]]]]
  implicitly[Csv[Test7]]
  implicitly[Csv[Wrapper1[Test7]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test7]]]]
  implicitly[Csv[Test8]]
  implicitly[Csv[Wrapper1[Test8]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test8]]]]
  implicitly[Csv[Test9]]
  implicitly[Csv[Wrapper1[Test9]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test9]]]]
  implicitly[Csv[Test10]]
  implicitly[Csv[Wrapper1[Test10]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test10]]]]
  implicitly[Csv[Test11]]
  implicitly[Csv[Wrapper1[Test11]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test11]]]]
  implicitly[Csv[Test12]]
  implicitly[Csv[Wrapper1[Test12]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test12]]]]
  implicitly[Csv[Test13]]
  implicitly[Csv[Wrapper1[Test13]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test13]]]]
  implicitly[Csv[Test14]]
  implicitly[Csv[Wrapper1[Test14]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test14]]]]
  implicitly[Csv[Test15]]
  implicitly[Csv[Wrapper1[Test15]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test15]]]]
  implicitly[Csv[Test16]]
  implicitly[Csv[Wrapper1[Test16]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test16]]]]
  implicitly[Csv[Test17]]
  implicitly[Csv[Wrapper1[Test17]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test17]]]]
  implicitly[Csv[Test18]]
  implicitly[Csv[Wrapper1[Test18]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test18]]]]
  implicitly[Csv[Test19]]
  implicitly[Csv[Wrapper1[Test19]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test19]]]]
  implicitly[Csv[Test20]]
  implicitly[Csv[Wrapper1[Test20]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test20]]]]
  implicitly[Csv[Test21]]
  implicitly[Csv[Wrapper1[Test21]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test21]]]]
  implicitly[Csv[Test22]]
  implicitly[Csv[Wrapper1[Test22]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test22]]]]
  implicitly[Csv[Test23]]
  implicitly[Csv[Wrapper1[Test23]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test23]]]]
  implicitly[Csv[Test24]]
  implicitly[Csv[Wrapper1[Test24]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test24]]]]
  implicitly[Csv[Test25]]
  implicitly[Csv[Wrapper1[Test25]]]
  implicitly[Csv[Wrapper1[Wrapper2[Test25]]]]
}
