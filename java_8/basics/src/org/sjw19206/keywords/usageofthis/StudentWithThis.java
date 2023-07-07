package org.sjw19206.keywords.usageofthis;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class StudentWithThis {

	public static final Logger logger = LogManager.getLogger(StudentWithThis.class);

	private int iStudentId;
	private String strStudentName;

	public StudentWithThis(int iStudentId, String strStudentName) {
		this.iStudentId = iStudentId;
		this.strStudentName = strStudentName;
	}

	public void displayDetails() {
		logger.info("Student Id :: " + iStudentId);
		logger.info("Student Name :: " + strStudentName);
	}
}
