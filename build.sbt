lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "macro-test"
  ).
  dependsOn(macros)

lazy val macros = (project in file("macros")).
  settings(
    inThisBuild(List(
      organization := "com.example.macros",
      scalaVersion := "2.12.6",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "macro-test-macros",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.6"
  )
