/**
 * 
 */
package com.local.aop.bean;

import org.slf4j.LoggerFactory;

/**
 * @author gaurav's
 * 
 * <p> A normal bean class 
 *
 */
public class Student {

	private String name;
	
	public Student(String name) {
		this.name = name;
	}
	

	/**
	 * @return the name
	 */
	public String getName() {
		LoggerFactory.getLogger(getClass()).info("invoking getName()");
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	
}
