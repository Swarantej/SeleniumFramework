package Log4J;

import org.apache.logging.log4j.*;



public class Log4JTest1 {
	 static Logger log = LogManager.getLogger(Log4JTest1.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		log.debug("I'm Debugging");
		log.debug("Hello");
		log.info("I'm Info");
		log.error("I'm error");
		log.fatal("I'm Fatal");

	}

}
