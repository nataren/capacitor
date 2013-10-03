import java.io.File
import dispatch._, Defaults._

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
            opt[String] ('h', "hostname") required() valueName("<hostname>") action { (x, c) =>
                c.copy(hostname = x)
            } text("hostname is a string")
            opt[String] ('u', "user") required() valueName("<username>") action { (x, c) =>
                c.copy(user = x)
            } text("user is a string")
            opt[String] ('p', "password") required() valueName("<password>") action { (x, c) =>
                c.copy(password = x)
            } text("password is a string")
            opt[Int] ("numberOfPages") required() valueName("<number of pages>") action { (x, c) =>
                c.copy(numberOfPages = x)
            } text("numberOfPages is an integer")
            opt[Int] ("numberOfFilesPerPage") required() valueName("<number of files per page") action { (x, c) =>
                c.copy(numberOfFilesPerPage = x)
            } text("numberOfFilesPerPage is an integer")
            opt[Int] ("numberOfRevisionsPerFile") required() valueName("<number of revisions per file") action { (x, c) =>
                c.copy(numberOfRevisionsPerFile = x)
            }
        }
        
        // Parse
        parser.parse(args, Config()) map { config =>
            println(config.hostname)
            println(config.user)
            println(config.numberOfPages)
            println(config.numberOfFilesPerPage)
            println(config.numberOfRevisionsPerFile)
        }
        
        // Establish connection
        
        // Create root page
        
        // Create the other pages
        (1 .. config.numberOfPages).par.map()
        
        // Create the files
        
        // Create the files' revisions
        
    }
}