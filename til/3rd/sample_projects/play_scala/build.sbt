name := "play_scala"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

libraryDependencies += guice