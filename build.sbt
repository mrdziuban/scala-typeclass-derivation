scalaVersion := "2.12.6"
version := "1.0.0"

lazy val core = project.in(file("core")).settings(name := "core")

lazy val macroDerivation = project.in(file("macro-derivation"))
  .settings(name := "macro-derivation", scalacOptions ++= Seq("-Xlog-implicits", "-Ymacro-debug-lite"))
  .dependsOn(core, macros)
  .aggregate(core, macros)

lazy val macros = project.in(file("macros"))
  .settings(
    name := "macros",
    libraryDependencies += "org.scala-lang" % "scala-reflect" % "2.12.6"
    // scalacOptions ++= Seq("-Xlog-implicits", "-Ymacro-debug-lite")
  )
  .dependsOn(core)
  .aggregate(core)

lazy val magnolia = project.in(file("magnolia"))
  .settings(
    name := "magnolia",
    libraryDependencies += "com.propensive" %% "magnolia" % "0.7.1"//,
    // scalacOptions ++= Seq("-Xlog-implicits", "-Ymacro-debug-lite")
  )
  .dependsOn(core)
  .aggregate(core)

lazy val shapeless = project.in(file("shapeless"))
  .settings(
    name := "shapeless",
    libraryDependencies += "com.chuusai" %% "shapeless" % "2.3.3"
  )
  .dependsOn(core)
  .aggregate(core)
