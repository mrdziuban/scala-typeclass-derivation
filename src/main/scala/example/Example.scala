package example

import example.macros.ExampleMacro

object Example {
  def go[A] = ExampleMacro.go[A]
}
