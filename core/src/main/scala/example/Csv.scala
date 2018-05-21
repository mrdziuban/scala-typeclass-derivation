package example

trait Csv[A] { def apply(a: A): List[String] }
