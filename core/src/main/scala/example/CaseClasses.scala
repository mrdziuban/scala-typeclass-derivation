package example

object CaseClasses {
  case class Wrapper1[A](a: A)
  case class Wrapper2[A](a: A)

  /*
  Scala code to generate 25 random case classes like below

  val types = Map(
    "str" -> "String",
    "int" -> "Int",
    "long" -> "Long",
    "short" -> "Short",
    "byte" -> "Byte",
    "double" -> "Double",
    "bool" -> "Boolean"
  ).flatMap { case (k, t) => Map(k -> t, s"seq$k" -> s"Seq[$t]", s"opt$k" -> s"Option[$t]") }.toList

  println(1.to(25).map { i =>
    val randTypes = scala.util.Random.shuffle(types).take(scala.util.Random.nextInt(types.length + 1))
    s"case class Test$i(${randTypes.map { case (k, t) => s"$k: $t" }.mkString(", ")})"
  }.mkString("\n"))
  */

  case class Test1(double: Double, optlong: Option[Long], optstr: Option[String], short: Short, str: String, seqshort: Seq[Short], optbyte: Option[Byte], byte: Byte, long: Long, seqstr: Seq[String], seqbool: Seq[Boolean], int: Int, seqdouble: Seq[Double], bool: Boolean, optdouble: Option[Double], optbool: Option[Boolean], optint: Option[Int], optshort: Option[Short], seqbyte: Seq[Byte], seqint: Seq[Int], seqlong: Seq[Long])
  case class Test2(optshort: Option[Short], seqstr: Seq[String], seqbool: Seq[Boolean], seqbyte: Seq[Byte], byte: Byte, int: Int, seqlong: Seq[Long], seqshort: Seq[Short], long: Long)
  case class Test3(optbyte: Option[Byte], optbool: Option[Boolean], bool: Boolean, double: Double, str: String, byte: Byte, seqshort: Seq[Short], short: Short, seqstr: Seq[String], seqdouble: Seq[Double], optstr: Option[String], optlong: Option[Long], long: Long, optint: Option[Int], seqint: Seq[Int], optshort: Option[Short], optdouble: Option[Double])
  case class Test4(seqlong: Seq[Long], long: Long, seqshort: Seq[Short], seqint: Seq[Int], optlong: Option[Long], optshort: Option[Short], optbool: Option[Boolean], int: Int, optstr: Option[String], seqbool: Seq[Boolean], short: Short, double: Double, optint: Option[Int], bool: Boolean, str: String, optbyte: Option[Byte], seqbyte: Seq[Byte], byte: Byte)
  case class Test5(optstr: Option[String], optbool: Option[Boolean], long: Long, optlong: Option[Long], seqdouble: Seq[Double], seqint: Seq[Int], short: Short, int: Int)
  case class Test6()
  case class Test7(double: Double, seqshort: Seq[Short], seqdouble: Seq[Double], optstr: Option[String], seqint: Seq[Int], short: Short, seqbyte: Seq[Byte], seqbool: Seq[Boolean], byte: Byte, optlong: Option[Long], optint: Option[Int], bool: Boolean, long: Long)
  case class Test8(seqbyte: Seq[Byte], optshort: Option[Short], seqlong: Seq[Long], optint: Option[Int], optstr: Option[String], byte: Byte, optbyte: Option[Byte])
  case class Test9(seqshort: Seq[Short])
  case class Test10(bool: Boolean, optshort: Option[Short])
  case class Test11()
  case class Test12(seqshort: Seq[Short], optbyte: Option[Byte], str: String, seqdouble: Seq[Double], optshort: Option[Short], long: Long, optdouble: Option[Double], seqint: Seq[Int], seqstr: Seq[String], int: Int, optlong: Option[Long], seqbool: Seq[Boolean])
  case class Test13(seqbool: Seq[Boolean], seqint: Seq[Int], optdouble: Option[Double])
  case class Test14(byte: Byte)
  case class Test15(optbool: Option[Boolean], seqint: Seq[Int], seqlong: Seq[Long], seqstr: Seq[String], bool: Boolean, int: Int, optlong: Option[Long])
  case class Test16(seqstr: Seq[String], bool: Boolean, short: Short, optbyte: Option[Byte], optlong: Option[Long], optshort: Option[Short], seqbool: Seq[Boolean], seqshort: Seq[Short], byte: Byte, long: Long, str: String, seqint: Seq[Int], seqlong: Seq[Long], optbool: Option[Boolean], optdouble: Option[Double], optint: Option[Int], seqbyte: Seq[Byte], seqdouble: Seq[Double], double: Double)
  case class Test17(short: Short, str: String, seqbool: Seq[Boolean], optdouble: Option[Double])
  case class Test18(seqshort: Seq[Short], optshort: Option[Short], optbyte: Option[Byte], optstr: Option[String], optlong: Option[Long], seqbool: Seq[Boolean], int: Int, seqdouble: Seq[Double], optbool: Option[Boolean], str: String, optint: Option[Int], long: Long, bool: Boolean, seqint: Seq[Int], seqstr: Seq[String], seqbyte: Seq[Byte], optdouble: Option[Double], double: Double, short: Short, seqlong: Seq[Long], byte: Byte)
  case class Test19(optbool: Option[Boolean], short: Short, seqshort: Seq[Short], seqstr: Seq[String], seqbool: Seq[Boolean], optstr: Option[String], seqint: Seq[Int])
  case class Test20(seqshort: Seq[Short], seqbool: Seq[Boolean], optbool: Option[Boolean], double: Double, optshort: Option[Short])
  case class Test21(seqlong: Seq[Long], bool: Boolean, optint: Option[Int], seqbool: Seq[Boolean], optbool: Option[Boolean], seqshort: Seq[Short], byte: Byte, optlong: Option[Long], str: String, short: Short, seqbyte: Seq[Byte], optdouble: Option[Double], int: Int, seqdouble: Seq[Double], optshort: Option[Short], seqstr: Seq[String])
  case class Test22(optbool: Option[Boolean], optshort: Option[Short], short: Short)
  case class Test23(optbool: Option[Boolean], optbyte: Option[Byte], long: Long)
  case class Test24(optshort: Option[Short], long: Long, bool: Boolean, seqbyte: Seq[Byte], seqdouble: Seq[Double], seqint: Seq[Int], seqlong: Seq[Long], optdouble: Option[Double], seqbool: Seq[Boolean], double: Double, byte: Byte, optstr: Option[String], seqstr: Seq[String], short: Short)
  case class Test25(seqdouble: Seq[Double], optshort: Option[Short], seqbyte: Seq[Byte], str: String)
}
