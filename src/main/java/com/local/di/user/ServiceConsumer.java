/**
 * 
 */
package com.local.di.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.local.di.service.MessageService;

/**
 * @author gaurav's
 * 
 * <p> a component class which will be exposed to the client 
 * 	   and will load the class with the component annotations
 * 	   and do all the dependency injection automatically with the autowired annotations.
 * 	<p> Exposed method will be used by the user to for processing
 * 		their messages.
 *
 */
@Component("consumer")
public class ServiceConsumer {
	
	Logger LOGGER = LoggerFactory.getLogger(ServiceConsumer.class);

	@Autowired
	@Qualifier("fbService")
	private MessageService service;
	
	/***
	 *  variable is trying to read system variables, 
	 *  and if it doesn't exist , default value will be java 1.8 
	 */
	@Value("${os.name:java 1.8}")
	private String javaHome;

	/**
	 * @return the javaHome
	 */
	public String getJavaHome() {
		return javaHome;
	}

	/**
	 * @param javaHome the javaHome to set
	 */
	public void setJavaHome(String javaHome) {
		this.javaHome = javaHome;
	}
	
	
	/****
	 * When the @Value annotation is found on a method, Spring context 
	 * will invoke it when all the spring configurations and beans are getting loaded.
	 * @param str
	 */
	@Value("Test")
	public void valueMethod(String str) {
		LOGGER.info("Value method execution starts with value "+str);
	}
	
	/***
	 * this method will be used by all client to process the message
	 * and send it to the provided id.
	 * @param msg
	 * @param recid
	 */
	public void processMessage(String msg, String recid) {
		
		LOGGER.info("Processing message through the service : "+ service.getClass().getSimpleName());
		service.sendMessage(msg, recid);
		
	}
}
