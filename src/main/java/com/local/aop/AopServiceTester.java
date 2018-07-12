/**
 * 
 */
package com.local.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.local.aop.service.StudentConfigurer;
import com.local.aop.service.StudentService;

/**
 * @author gaurav's
 *
 */
public class AopServiceTester {
	
	private static Logger LOG = LoggerFactory.getLogger(AopServiceTester.class);

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfigurer.class);
		LOG.info("Getting the student service bean");
		StudentService serviceObj = (StudentService)context.getBean("studentService");
		LOG.info("The name of student is "+serviceObj.getStudentName());
		LOG.info("Testing aspect - {}", serviceObj.getStudent().getName());
		LOG.info("Custom annotation testing ");
		serviceObj.getStudent().setName("Vidhu");
		
		context.close();
	}

}
