/**
 * 
 */
package com.local.aop.bean;

import com.local.aop.annotation.Loggable;

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
		return name;
	}

	/**
	 * @param name the name to set
	 * 
	 * here the marker interface for notifying aop
	 *  
	 */
	@Loggable
	public void setName(String name) {
		this.name = name;
	}
	
	
}
