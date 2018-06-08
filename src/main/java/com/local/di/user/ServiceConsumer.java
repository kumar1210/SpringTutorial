/**
 * 
 */
package com.local.di.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
@Component("Consumer")
public class ServiceConsumer {

	@Autowired
	@Qualifier("fbService")
	private MessageService service;
	
	/***
	 * this method will be used by all client to process the message
	 * and send it to the provided id.
	 * @param msg
	 * @param recid
	 */
	public void processMessage(String msg, String recid) {
		
		System.out.println("Processing message through the service : "+ service.getClass().getSimpleName());
		service.sendMessage(msg, recid);
		
	}
}
