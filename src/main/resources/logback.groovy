import static ch.qos.logback.classic.Level.DEBUG
import static ch.qos.logback.classic.Level.INFO

appender("Console-Appender", ConsoleAppender) {
    encoder(PatternLayoutEncoder) {
//        pattern = "%date [%thread] [%-5level] %logger{36} - %msg%n"
        pattern = "[%-5level] %logger{36} - %msg%n"
    }
}
logger("org.learn", DEBUG, ["Console-Appender"], false)
logger("org.springframework", TRACE, ["Console-Appender"], false)
//logger("org.springframework.boot", INFO, ["Console-Appender"], false)
//logger("org.thymeleaf", INFO, ["Console-Appender"], false)
root(INFO, ["Console-Appender"])
