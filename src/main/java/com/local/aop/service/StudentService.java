/**
 * 
 */
package com.local.aop.service;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.local.aop.bean.Student;

/**
 * @author gaurav's
 *
 */
@Component
public class StudentService {

	@Autowired
	@Qualifier("getStudent")
	private Student student;

	/**
	 * @return the student
	 */
	public Student getStudent() {
		return student;
	}

	/**
	 * @param student the student to set
	 */
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
	public String getStudentName() {
		LoggerFactory.getLogger(getClass()).info("Taking the service of the student service");
		return student.getName();
	}
}
