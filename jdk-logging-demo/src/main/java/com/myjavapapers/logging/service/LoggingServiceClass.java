package com.myjavapapers.logging.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingServiceClass {

	private static final Logger logger = LoggerFactory.getLogger(LoggingServiceClass.class);
	
	public void printLoggingServiceClass1(){
		logger.debug("printLoggingServiceClass1");
	}
	public void printLoggingServiceClass2(){
		logger.debug("printLoggingServiceClass2");
	}
	public void printLoggingServiceClass3(){
		logger.debug("printLoggingServiceClass3");
	}
	public void printLoggingServiceClass4(){
		logger.debug("printLoggingServiceClass4");
	}
	public void printLoggingServiceClass5(){
		logger.debug("printLoggingServiceClass5");
	}
	
}
