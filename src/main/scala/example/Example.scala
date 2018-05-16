package example

import example.macros.ExampleMacro

object Example {
  def go[A] = ExampleMacro.go[A]
  /*
  [error] src/main/scala/example/Example.scala:6:30: A is not a class
  [error]   def go[A] = ExampleMacro.go[A]
  [error]                              ^
  */
}
