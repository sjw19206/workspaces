package org.sjw19206.inheritance.single.test;

import org.sjw19206.inheritance.single.Person;
import org.sjw19206.inheritance.single.Student;

public class SingleInheritanceTest {

	public static void main(String[] args) {

		Person objPerson = new Person(23456755, "Joe Thomas", 34);
		objPerson.displayDetails();

		Student objStudent = new Student(87698745, "James Roy", 12, 87656477);
		objStudent.displayDetails();

	}

}
