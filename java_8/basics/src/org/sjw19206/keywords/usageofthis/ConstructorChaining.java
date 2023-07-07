package org.sjw19206.keywords.usageofthis;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class ConstructorChaining {

	public static final Logger logger = LogManager.getLogger(ConstructorChaining.class);

	private int iStudentId;
	private String strStudentName;

	public ConstructorChaining() {
		logger.info("Default Constructor !!!");
	}

	public ConstructorChaining(int iStudentId, String strStudentName) {
		this();
		this.iStudentId = iStudentId;
		this.strStudentName = strStudentName;
	}

	public void displayDetails() {
		logger.info("Id :: " + iStudentId);
		logger.info("Name :: " + strStudentName);
	}
}
