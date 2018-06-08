package com.local.di.service;

/***
 * 
 * @author gaurav's
 * 
 * <b> one of the implementation of the messaging service
 *
 */
public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message, String recieverId) {
		
		System.out.println("This message "+ message +" will be sent to "+recieverId);
	}

	
}
