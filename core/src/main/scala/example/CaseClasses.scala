package example

object CaseClasses {
  case class Wrapper1[A](a: A)
  case class Wrapper2[A](a: A)

  /*
  Ruby code to generate 25 random case classes like below

  types = {
    str: 'String',
    int: 'Int',
    long: 'Long',
    short: 'Short',
    byte: 'Byte',
    double: 'Double',
    bool: 'Boolean',
  }.flat_map { |k, t| [[k, t], [:"seq#{k.capitalize}", "Seq[#{t}]"], [:"opt#{k.capitalize}", "Option[#{t}]"]] }

  res = (1..25).to_a.map do |i|
    "case class Test#{i}(#{types.sample(rand(types.length)).map { |k, t| "#{k}: #{t}" }.join(', ')})"
  end.join("\n")

  puts res
  */

  case class Test1(optByte: Option[Byte], int: Int, optDouble: Option[Double], seqLong: Seq[Long], seqInt: Seq[Int], long: Long)
  case class Test2(optDouble: Option[Double], seqInt: Seq[Int], optStr: Option[String], byte: Byte, optBool: Option[Boolean], seqBool: Seq[Boolean], bool: Boolean, seqLong: Seq[Long], seqStr: Seq[String], double: Double, optLong: Option[Long], seqDouble: Seq[Double], int: Int, seqByte: Seq[Byte], optInt: Option[Int], optShort: Option[Short])
  case class Test3(seqShort: Seq[Short], double: Double, seqByte: Seq[Byte], str: String, bool: Boolean, optBool: Option[Boolean], optInt: Option[Int], byte: Byte, long: Long, seqDouble: Seq[Double], int: Int)
  case class Test4(long: Long, seqBool: Seq[Boolean], byte: Byte, optInt: Option[Int], optBool: Option[Boolean], seqInt: Seq[Int], str: String, optStr: Option[String], bool: Boolean, seqDouble: Seq[Double])
  case class Test5(optLong: Option[Long], optInt: Option[Int], optShort: Option[Short], seqLong: Seq[Long], bool: Boolean, seqInt: Seq[Int], optBool: Option[Boolean], optDouble: Option[Double])
  case class Test6(byte: Byte, seqLong: Seq[Long], seqInt: Seq[Int], optDouble: Option[Double], seqByte: Seq[Byte], optInt: Option[Int], seqStr: Seq[String], optBool: Option[Boolean], seqDouble: Seq[Double], optShort: Option[Short])
  case class Test7(seqShort: Seq[Short], seqLong: Seq[Long], optShort: Option[Short], byte: Byte, optInt: Option[Int], optLong: Option[Long], str: String, seqBool: Seq[Boolean], long: Long, double: Double, bool: Boolean, seqStr: Seq[String], optStr: Option[String], seqDouble: Seq[Double], optDouble: Option[Double], optBool: Option[Boolean])
  case class Test8(optByte: Option[Byte], long: Long, seqLong: Seq[Long], str: String, optLong: Option[Long], byte: Byte, optShort: Option[Short])
  case class Test9(long: Long, optInt: Option[Int], seqShort: Seq[Short], int: Int, optDouble: Option[Double], short: Short, bool: Boolean, byte: Byte, seqByte: Seq[Byte], seqInt: Seq[Int], optByte: Option[Byte], seqLong: Seq[Long])
  case class Test10(optShort: Option[Short], seqShort: Seq[Short])
  case class Test11(optByte: Option[Byte], int: Int, seqShort: Seq[Short], optLong: Option[Long], double: Double, seqBool: Seq[Boolean])
  case class Test12(optLong: Option[Long], optByte: Option[Byte], seqLong: Seq[Long], int: Int, bool: Boolean, byte: Byte, short: Short, seqShort: Seq[Short], optStr: Option[String], seqByte: Seq[Byte], str: String, double: Double, seqBool: Seq[Boolean], optDouble: Option[Double])
  case class Test13(optInt: Option[Int], optByte: Option[Byte], seqLong: Seq[Long], str: String, int: Int, optDouble: Option[Double], bool: Boolean, seqDouble: Seq[Double], seqStr: Seq[String], optStr: Option[String], seqBool: Seq[Boolean], long: Long, seqByte: Seq[Byte], double: Double, optLong: Option[Long], optShort: Option[Short], short: Short, seqShort: Seq[Short], byte: Byte, optBool: Option[Boolean])
  case class Test14(seqInt: Seq[Int], optLong: Option[Long], long: Long, optInt: Option[Int], seqLong: Seq[Long], double: Double, str: String, int: Int, bool: Boolean, short: Short, byte: Byte, optDouble: Option[Double], optStr: Option[String], optShort: Option[Short], optBool: Option[Boolean], seqStr: Seq[String], seqBool: Seq[Boolean])
  case class Test15(seqLong: Seq[Long], optLong: Option[Long], seqStr: Seq[String], optBool: Option[Boolean], optDouble: Option[Double], optShort: Option[Short])
  case class Test16(optInt: Option[Int], optShort: Option[Short], seqByte: Seq[Byte], seqBool: Seq[Boolean], seqDouble: Seq[Double], optStr: Option[String], seqShort: Seq[Short], seqStr: Seq[String], optByte: Option[Byte], optBool: Option[Boolean], seqLong: Seq[Long], long: Long, seqInt: Seq[Int], short: Short, bool: Boolean, optLong: Option[Long], optDouble: Option[Double], str: String, double: Double)
  case class Test17(seqBool: Seq[Boolean], optShort: Option[Short], int: Int, optBool: Option[Boolean], seqStr: Seq[String], bool: Boolean, seqInt: Seq[Int], optInt: Option[Int], str: String, optDouble: Option[Double], double: Double)
  case class Test18(short: Short, optLong: Option[Long], seqDouble: Seq[Double], optInt: Option[Int], seqBool: Seq[Boolean])
  case class Test19(double: Double, optBool: Option[Boolean], short: Short, str: String, seqByte: Seq[Byte], seqStr: Seq[String], optDouble: Option[Double], optStr: Option[String], optInt: Option[Int], int: Int, seqInt: Seq[Int], optShort: Option[Short], seqLong: Seq[Long], seqDouble: Seq[Double], bool: Boolean, byte: Byte, optLong: Option[Long], optByte: Option[Byte], seqBool: Seq[Boolean])
  case class Test20(seqByte: Seq[Byte], seqShort: Seq[Short], optShort: Option[Short], byte: Byte, seqDouble: Seq[Double], seqBool: Seq[Boolean], seqInt: Seq[Int], optDouble: Option[Double], optLong: Option[Long], int: Int, seqLong: Seq[Long], double: Double, optStr: Option[String])
  case class Test21(optByte: Option[Byte], seqLong: Seq[Long], seqByte: Seq[Byte], optLong: Option[Long], seqDouble: Seq[Double], seqBool: Seq[Boolean], seqShort: Seq[Short], short: Short, long: Long, int: Int, optBool: Option[Boolean], byte: Byte, bool: Boolean, optShort: Option[Short])
  case class Test22(seqDouble: Seq[Double], optLong: Option[Long], optStr: Option[String], double: Double, seqLong: Seq[Long], optByte: Option[Byte], byte: Byte)
  case class Test23(optBool: Option[Boolean], int: Int, seqShort: Seq[Short], optDouble: Option[Double], seqDouble: Seq[Double], byte: Byte, optShort: Option[Short], seqLong: Seq[Long], optByte: Option[Byte])
  case class Test24(byte: Byte, seqDouble: Seq[Double], seqInt: Seq[Int], long: Long, optBool: Option[Boolean], seqLong: Seq[Long], short: Short, seqShort: Seq[Short], optInt: Option[Int], seqBool: Seq[Boolean], str: String, optDouble: Option[Double], double: Double, optByte: Option[Byte], seqStr: Seq[String])
  case class Test25(double: Double, seqShort: Seq[Short], optStr: Option[String], optByte: Option[Byte], optShort: Option[Short], seqStr: Seq[String], bool: Boolean, optLong: Option[Long])
}
