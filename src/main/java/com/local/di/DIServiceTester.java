/**
 * 
 */
package com.local.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.local.di.configure.DIConfiguration;
import com.local.di.user.ServiceConsumer;

/**
 * @author gaurav's
 *
 * <p> a client tester class which will load the application 
 * 		with the configuration class and get the beans with the names provided.
 */
public class DIServiceTester {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DIServiceTester.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		ServiceConsumer consumer = (ServiceConsumer) context.getBean("consumer");
		consumer.processMessage("Hi Gaurav", "gaurav@gmail.com");
		LOGGER.info("Value annotation example "+ consumer.getJavaHome());
		context.close();
	}

}
