import java.io.File

case class Config(
    hostname: String = "",
    user: String = "",
    password: String = "",
    numberOfPages: Int = 0,
    numberOfFilesPerPage: Int = 0,
    numberOfRevisionsPerFile: Int = 0)

object Capacitor {
    def main(args: Array[String]) : Unit = {
        println("Capacitor 0.0.0.1 (C) MindTouch Inc.")
        
        // Build the command line parser
        val parser = new scopt.OptionParser[Config]("capacitor") {
            head("3.x")
            opt[String] ('h', "hostname")
                required()
                valueName("<hostname>")
                action { (x, c) =>
                    c.copy(hostname = x)
            } text ("hostname is a string")
            opt[String] ('u', "user")
                required()
                valueName("<username>")
                action { (x, c) =>
                    c.copy(user = x)
            } text ("user is a string")
        }
        
        // Parse
        parser.parse(args, Config()) map { config =>
            println(config.hostname)
            println(config.user)
        }
    }
}