package org.sjw19206.keywords.usageofthis;

public class StudentWithoutThisDiffParm {
	private int iStudentId;
	private String strStudentName;

	public StudentWithoutThisDiffParm(int iStdId, String strStdName) {
		iStudentId = iStdId;
		strStudentName = strStdName;
	}

	public void displayDetails() {
		System.out.println("Student Id :: " + iStudentId);
		System.out.println("Student Name :: " + strStudentName);
	}
}
