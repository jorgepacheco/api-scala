name := "api"
version := "1.0"

Configuration.settings

libraryDependencies ++= Dependencies.production
libraryDependencies ++= Dependencies.test

addCommandAlias("t", "test")
addCommandAlias("to", "testOnly")
addCommandAlias("tq", "testQuick")
addCommandAlias("tsf", "testShowFailed")

addCommandAlias("c", "compile")
addCommandAlias("tc", "test:compile")

addCommandAlias("f", "scalafmt")      // Format all files according to ScalaFmt
addCommandAlias("ft", "scalafmtTest") // Test if all files are formatted according to ScalaFmt

addCommandAlias("prep", ";c;tc;ft") // All the needed tasks before running the test
