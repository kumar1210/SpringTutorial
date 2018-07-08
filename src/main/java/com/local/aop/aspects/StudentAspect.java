/**
 * 
 */
package com.local.aop.aspects;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author gaurav's
 *
 */
@Aspect
@Component
public class StudentAspect {
	
	Logger LOG = LoggerFactory.getLogger(StudentAspect.class);
	
	@Before(value = "execution(public String getName())")
	public void executeBeforeGetName() {
		LOG.info("AOP Exact before getName() is called ");	
	}
	
	@After(value = "execution(* get*())") 
	public void executeForAll () {
		LOG.info("AOP After method is called for all method get*()");	
	}

}
