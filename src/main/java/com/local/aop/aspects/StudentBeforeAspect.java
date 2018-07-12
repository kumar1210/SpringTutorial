/**
 * 
 */
package com.local.aop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

/**
 * @author gaurav's
 * 
 * to initialize the aspect, it should be annotated with configuration/
 * component/service to get initialized.
 *
 */
@Aspect
@Configuration
public class StudentBeforeAspect {
	
	Logger LOG = LoggerFactory.getLogger(StudentBeforeAspect.class);
	
	/***
	 *  it runs before the method which is given at joint cut.
	 * @param point
	 */
	@Before(value = "execution(public String getName())")
	public void executeBeforeGetName(JoinPoint point) {
		LOG.info("AOP Exact before getName() is called "+ point.toString());	
	}
	
	/****
	 * it runs after the method which is givent at joint cut passes.
	 * this method will be executed after successful or exception throw 
	 * from the function.
	 * @param point
	 */
	@After(value = "execution(* get*())") 
	public void executeForAll (JoinPoint point) {
		LOG.info("AOP After method is called for all method {}",point);	
	}
	
	
	/***
	 * it runs before every method which is annotated with
	 * the mentioned interface
	 */
	@Before("@annotation(com.local.aop.annotation.Loggable)")
	public void executeAnnotation() {
		LOG.info("Custom Annotation AOP");
	}

}
