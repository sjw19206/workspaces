package org.sjw19206.inheritance.single;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Student extends Person {

	public static final Logger logger = LogManager.getLogger(Student.class);

	protected int iStudentId;

	public Student(int iUId, String strName, int iAge, int iStudentId) {
		super(iUId, strName, iAge);

		logger.info("Constructor Student() is invoked :: ");

		this.iStudentId = iStudentId;
	}

	@Override
	public void displayDetails() {
		super.displayDetails();
		
		logger.info("Student Id :: " + this.iStudentId);
	}
}
