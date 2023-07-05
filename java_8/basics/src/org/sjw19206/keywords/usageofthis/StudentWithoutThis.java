package org.sjw19206.keywords.usageofthis;

public class StudentWithoutThis {

	private int iStudentId;
	private String strStudentName;

	public StudentWithoutThis(int iStudentId, String strStudentName) {
		iStudentId = iStudentId;
		strStudentName = strStudentName;
	}

	public void displayDetails() {
		System.out.println("Student Id :: " + iStudentId);
		System.out.println("Student Name :: " + strStudentName);
	}
}
