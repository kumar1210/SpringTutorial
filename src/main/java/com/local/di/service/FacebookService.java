/**
 * 
 */
package com.local.di.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gaurav's
 * 
 * <p> Another implementation of the messaging service
 * 		having different features to send message.
 *
 */
public class FacebookService implements MessageService {

	
	Logger LOGGER = LoggerFactory.getLogger(FacebookService.class);
	
	/* (non-Javadoc)
	 * @see com.local.di.service.MessageService#sendMessage(java.lang.String, java.lang.String)
	 */
	@Override
	public void sendMessage(String message, String recieverId) {

		LOGGER.info("This message "+ message +" will be sent to "+recieverId +
				" as well as in messenger");
	}

}
