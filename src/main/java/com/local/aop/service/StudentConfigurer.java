/**
 * 
 */
package com.local.aop.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.local.aop.bean.Student;

/**
 * @author gaurav's
 * 
 * a configurer which is enabling the aspect 
 * programming on the current application
 *
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.local.aop.*")
public class StudentConfigurer {

	
	@Bean
	public Student getStudent() {
		return new Student("Gaurav");
	}
}
