import scalariform.formatter.preferences._

name := """flight-delay-streaming-scala"""

version := "1.1"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.12",
  "org.slf4j" % "slf4j-simple" % "1.7.12",
  "com.typesafe.akka" % "akka-stream_2.11" % "2.4.2",
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.2",
  "org.reactivemongo" %% "reactivemongo" % "0.11.10"
)


