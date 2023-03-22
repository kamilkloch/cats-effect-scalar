import com.typesafe.scalalogging.LoggerTakingImplicit

object MdocConsoleLoggerWorkaround {
  implicit class LoggingOps[A](log: LoggerTakingImplicit[A]) {
    def infoConsole(msg: String)(implicit ev: A): Unit = {
      val oldOut = System.out
      val newOut = Console.out 
      try {
        System.setOut(newOut)
        log.info(msg)
      } finally System.setOut(oldOut)
    }
  }
}