package Log4JPackage2;

import org.apache.logging.log4j.*;



public class Log4JTest2 {
	 static Logger log = LogManager.getLogger(Log4JTest2.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		log.debug("I'm Debugging from Package 2 , Test casee 2");
		log.debug("Hello from Package 2 , Test casee 2");
		log.info("I'm Info from Package 2 , Test casee 2");
		log.error("I'm error from Package 2 , Test casee 2");
		log.fatal("I'm Fatal from Package 2 , Test casee 2");

	}

}
