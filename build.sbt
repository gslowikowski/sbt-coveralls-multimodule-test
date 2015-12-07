organization := "com.github.gslowikowski"
name := "sbt-coveralls-multimodule-test"
version := "1.0.0"

scalaVersion in ThisBuild := "2.11.7"

crossScalaVersions := Seq("2.11.7", "2.10.6")

javacOptions ++= Seq("-source", "1.6", "-target", "1.6")

scalacOptions ++= Seq("-unchecked", "-deprecation")

val specsVersion = "2.3.12"
val specsBuild = Seq(
    "org.specs2" %% "specs2-core" % specsVersion,
    "org.specs2" %% "specs2-junit" % specsVersion,
    "org.specs2" %% "specs2-mock" % specsVersion,
    "org.specs2" %% "specs2-matcher-extra" % specsVersion
)

lazy val root = project.in(file("."))
  .aggregate(module01, module02, module03)

lazy val module01 = project
  .in(file("module01"))
  .settings(libraryDependencies ++= specsBuild.map(_ % "test"))

lazy val module02 = project
  .in(file("module02"))
  .dependsOn(module01)
  .settings(libraryDependencies ++= specsBuild.map(_ % "test"))

lazy val module03 = project
  .in(file("module03"))
  .dependsOn(module02)
  .settings(libraryDependencies ++= specsBuild.map(_ % "test"))

coverageMinimum := 70

coverageFailOnMinimum := false

coverageHighlighting := {
    if(scalaBinaryVersion.value == "2.11") true
    else false
}

publishArtifact in Test := false

parallelExecution in Test := false

CoverallsKeys.coverallsToken := Some("jorpWtHho2Eoyt6Od9ETN3hyEeN9nZOhF")
