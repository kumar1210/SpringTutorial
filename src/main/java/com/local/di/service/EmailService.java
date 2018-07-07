package com.local.di.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/***
 * 
 * @author gaurav's
 * 
 * <b> one of the implementation of the messaging service
 *
 */
public class EmailService implements MessageService {
	
	Logger LOGGER = LoggerFactory.getLogger(EmailService.class);

	@Override
	public void sendMessage(String message, String recieverId) {
		
		LOGGER.info("This message "+ message +" will be sent to "+recieverId);
	}

	
}
