/**
 * 
 */
package com.local.di;

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

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		ServiceConsumer consumer = (ServiceConsumer) context.getBean("Consumer");
		consumer.processMessage("Hi Gaurav", "gaurav@gmail.com");
		context.close();
		
	}

}
