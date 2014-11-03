name := "LogAnalytix"

version := "0.1"

libraryDependencies += "com.datastax.spark" %% "spark-cassandra-connector" % "1.0.3" withSources() withJavadoc()

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.0.2"

libraryDependencies += "org.apache.spark" %% "spark-mllib" % "1.0.2"

libraryDependencies  ++= Seq(
            "org.scalanlp" %% "breeze" % "0.9",
            "org.scalanlp" %% "breeze-natives" % "0.9"
)

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

resolvers ++= Seq(
            "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
            "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
