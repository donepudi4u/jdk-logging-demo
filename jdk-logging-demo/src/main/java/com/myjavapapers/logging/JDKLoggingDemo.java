package com.myjavapapers.logging;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.myjavapapers.logging.dao.LoggingDao;

public class JDKLoggingDemo {
	
	private static final Logger logger = LoggerFactory.getLogger(JDKLoggingDemo.class);
	
	public static void main(String[] args) {
		logger.info("JDKLoggingDemo Start");
		logger.info("JDKLoggingDemo Completed");
		LoggingDao  dao = new LoggingDao();
		printAllMentohds(dao);
		
		
	}

	private static void printAllMentohds(LoggingDao dao) {
		
		Class<? extends LoggingDao> daoClass = dao.getClass();
		Method[] methods = daoClass.getDeclaredMethods();
		
		for (Method method : methods) {
			try {
				method.invoke(dao);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				e.printStackTrace();
			}
		}

		
	}

}
