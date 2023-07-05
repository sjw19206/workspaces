package org.sjw19206.keywords.usageofthis;

public class StudentThisTest {

	public static void main(String[] args) {
		StudentWithThis objStudentWithThis = new StudentWithThis(12, "Java");
		objStudentWithThis.displayDetails();

		StudentWithoutThis objStudentWithoutThis = new StudentWithoutThis(32, "Python");
		objStudentWithoutThis.displayDetails();

		StudentWithoutThisDiffParm objStudentWithoutThisDiffParm = new StudentWithoutThisDiffParm(45, "Rust");
		objStudentWithoutThisDiffParm.displayDetails();
	}

}
