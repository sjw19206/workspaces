package org.sjw19206.inheritance.single;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class Person {

	public static final Logger logger = LogManager.getLogger(Person.class);

	protected int iUId;
	protected String strName;
	protected int iAge;

	public Person(int iUId, String strName, int iAge) {

		logger.info("Constructor Person() is invoked :: ");

		this.iUId = iUId;
		this.strName = strName;
		this.iAge = iAge;
	}
	
	public void displayDetails() {
		logger.info("Unique Id :: " + this.iUId);
		logger.info("Name :: " + this.strName);
		logger.info("Age :: " + this.iAge);
	}

}
