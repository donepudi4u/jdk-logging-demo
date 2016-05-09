package com.myjavapapers.logging.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingDao {
	
	private static final Logger logger = LoggerFactory.getLogger(LoggingDao.class);
	
	public void printLogginfDao1(){
		logger.info("printLogginfDao1");
	}
	public void printLogginfDao2(){
		logger.debug("printLogginfDao2");
	}
	public void printLogginfDao3(){
		logger.debug("printLogginfDao3");
	}
	public void printLogginfDao4(){
		logger.info("printLogginfDao4");
	}
	public void printLogginfDao5(){
		logger.debug("printLogginfDao5");
	}
	public void printLogginfDao6(){
		logger.debug("printLogginfDao6");
	}
	public void printLogginfDao7(){
		logger.info("printLogginfDao7");
	}

}
