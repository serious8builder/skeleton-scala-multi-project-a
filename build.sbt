ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "starter-project-demo",
    idePackagePrefix := Some("org.example")
  )


lazy val util = project
  .settings(
    idePackagePrefix := Some("org.example")
  )

lazy val core = project
  .settings(
    idePackagePrefix := Some("org.example")
  )
  .dependsOn(util % "compile->compile")