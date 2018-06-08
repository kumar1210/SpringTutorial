/**
 * 
 */
package com.local.di.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.local.di.service.EmailService;
import com.local.di.service.FacebookService;
import com.local.di.service.MessageService;

/**
 * @author gaurav's
 * 
 * <p> a configuration class, which will scan the components in the given path
 * 	   as well as it will initiate all the beans required.
 *
 */
@Configuration
@ComponentScan(value ={"com.local.di.*"})
public class DIConfiguration {
	
	@Bean("emailService")
	public MessageService getEmailMessageService(){
		return new EmailService();
	}

	@Bean("fbService")
	public MessageService getFBMessageService() {
		return new FacebookService();
	}
}
