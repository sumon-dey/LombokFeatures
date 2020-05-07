package com.testautomation.lombok;

/* You put the variant of @Log on your class (whichever one applies to the logging system you use);
 *  you then have a static final log field, initialized as is the commonly prescribed way for the logging
 *   framework you use, which you can then use to write log statements.

There are several choices available:
@CommonsLog
    Creates private static final org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(LogExample.class); 
@Flogger
    Creates private static final com.google.common.flogger.FluentLogger log = com.google.common.flogger.FluentLogger.forEnclosingClass(); 
@JBossLog
    Creates private static final org.jboss.logging.Logger log = org.jboss.logging.Logger.getLogger(LogExample.class); 
@Log
    Creates private static final java.util.logging.Logger log = java.util.logging.Logger.getLogger(LogExample.class.getName()); 
@Log4j
    Creates private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(LogExample.class); 
@Log4j2
    Creates private static final org.apache.logging.log4j.Logger log = org.apache.logging.log4j.LogManager.getLogger(LogExample.class); 
@Slf4j
    Creates private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LogExample.class); 
@XSlf4j
    Creates private static final org.slf4j.ext.XLogger log = org.slf4j.ext.XLoggerFactory.getXLogger(LogExample.class); 
@CustomLog
    Creates private static final com.foo.your.Logger log = com.foo.your.LoggerFactory.createYourLogger(LogExample.class);
    
This option requires that you add a configuration to your lombok.config file to specify what @CustomLog should do.
For example:lombok.log.custom.declaration = com.foo.your.Logger com.foo.your.LoggerFactory.createYourLog(TYPE)(TOPIC) 
which would produce the above statement. First comes a type which is the type of your logger, then a space, then the type of your logger factory, then a dot, 
then the name of the logger factory method, and then 1 or 2 parameter definitions; at most one definition with TOPIC and at most one without TOPIC. 
Each parameter definition is specified as a parenthesised comma-separated list of parameter kinds. The options are: TYPE (passes this @Log decorated type, as a class), 
NAME (passes this @Log decorated type's fully qualified name), TOPIC (passes the explicitly chosen topic string set on the @CustomLog annotation), and NULL (passes null).
 The logger type is optional; if it is omitted, the logger factory type is used. (So, if your logger class has a static method that creates loggers, you can shorten your logger definition). */

import lombok.extern.apachecommons.CommonsLog;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;

@Log4j2
// @Slf4j @Log @CommonsLog @Log4j @Log4j2 @XSlf4j
public class LombokLogger {

	public static void main(String[] args) {
		log.info("Info");
		log.trace("Trace");
		log.warn("Warn");
		log.debug("Debug");
		log.error("Error");
		log.fatal("Fatal");
	}

}

@Log
class LogExample {

	public static void main(String... args) {
		log.severe("Something's wrong here");
	}
}

@Slf4j
class LogExampleOther {

	public static void main(String... args) {
		log.error("Something else is wrong here");
	}
}

@CommonsLog(topic = "CounterLog")
class LogExampleCategory {

	public static void main(String... args) {
		log.error("Calling the 'CounterLog' with a message");
	}
}
