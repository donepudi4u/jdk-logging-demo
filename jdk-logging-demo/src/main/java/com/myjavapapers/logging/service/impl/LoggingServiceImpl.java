package com.myjavapapers.logging.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingServiceImpl {
	private static final Logger logger = LoggerFactory.getLogger(LoggingServiceImpl.class);
	
	public void printLoggingServiceImpl1(){
		logger.debug("printLoggingServiceClass1");
	}
	public void printLoggingServiceClass2(){
		logger.debug("printLoggingServiceImplClass2");
	}
	public void printLoggingServiceClass3(){
		logger.debug("printLoggingServiceImplClass3");
	}
	public void printLoggingServiceClass4(){
		logger.debug("printLoggingServiceImplClass4");
	}
	public void printLoggingServiceClass5(){
		logger.debug("printLoggingServiceImplClass5");
	}

}
