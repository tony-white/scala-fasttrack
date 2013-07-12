
organization := "com.typesafe.training"

name := "scalatrain"

version := "2.0.0"

scalaVersion := "2.10.2"

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_",
  "-target:jvm-1.6",
  "-encoding", "UTF-8"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "2.0.M6-SNAP26" % "test"/*,
  "org.scalamock" %% "scalamock-scalatest-support" % "3.0.1" % "test"*/
)

parallelExecution in Test := false

retrieveManaged := true

transitiveClassifiers := Seq("sources")

initialCommands in console := "import com.typesafe.training.scalatrain._"

initialCommands in (Test, console) <<= (initialCommands in console)(_ + ",TestData._")

scalariformSettings
