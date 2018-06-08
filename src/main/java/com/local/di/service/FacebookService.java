/**
 * 
 */
package com.local.di.service;

/**
 * @author gaurav's
 * 
 * <p> Another implementation of the messaging service
 * 		having different features to send message.
 *
 */
public class FacebookService implements MessageService {

	/* (non-Javadoc)
	 * @see com.local.di.service.MessageService#sendMessage(java.lang.String, java.lang.String)
	 */
	@Override
	public void sendMessage(String message, String recieverId) {

		System.out.println("This message "+ message +" will be sent to "+recieverId +
				" as well as in messenger");
	}

}
