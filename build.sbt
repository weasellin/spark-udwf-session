import sbt.Resolver

name := "CustomUDWF"

version := "0.1"

scalaVersion := "2.11.12"
val sparkVersion = "2.4.0"

libraryDependencies ++= Seq (
  "org.apache.spark" %% "spark-core" % sparkVersion % "provided",
  "org.apache.spark" %% "spark-sql" % sparkVersion % "provided",

  // test dependencies
  "com.holdenkarau" %% "spark-testing-base" % "2.4.0_0.11.0" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)


resolvers ++= Seq(
  "SnowPlow Repo" at "http://maven.snplow.com/releases/",
  "Maven Repository" at "https://mvnrepository.com",
  Resolver.sonatypeRepo("public"), "Confluent Maven Repo" at "http://packages.confluent.io/maven/"
)

parallelExecution in Test := false
