/**
 * 
 */
package com.local.di.service;

/**
 * @author gaurav's
 * <p>
 * basic structure of messaging service. <br>
 * <code>All messaging services should implement this interface
 *
 */
public interface MessageService {

	public void sendMessage(String message, String recieverId);
}
