package org.sjw19206.keywords.usageofthis;

public class StudentWithThis {

	private int iStudentId;
	private String strStudentName;

	public StudentWithThis(int iStudentId, String strStudentName) {
		this.iStudentId = iStudentId;
		this.strStudentName = strStudentName;
	}

	public void displayDetails() {
		System.out.println("Student Id :: " + iStudentId);
		System.out.println("Student Name :: " + strStudentName);
	}
}
