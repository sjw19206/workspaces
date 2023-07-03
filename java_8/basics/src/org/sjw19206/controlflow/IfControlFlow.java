package org.sjw19206.controlflow;

public class IfControlFlow {

	public boolean ifControlFlow(int iNum1, int iNum2) {

		boolean bFirstValueHigher = false;

		if (iNum1 > iNum2) {
			bFirstValueHigher = true;
		}

		return bFirstValueHigher;
	}

	public void ifElseControlFlow(int iNum1, int iNum2) {

		if (iNum1 > iNum2) {
			System.out.println(iNum1 + " is higher than " + iNum2);
		} else {
			System.out.println(iNum2 + " is higher than " + iNum1);
		}

	}

	public void ifElseIfLadderControlFlow(int iMarks) {

		if (iMarks > 89) {
			System.out.println("Grade - A*");
		} else if (iMarks > 79) {
			System.out.println("Grade - A");
		} else if (iMarks > 69) {
			System.out.println("Grade - B");
		} else if (iMarks > 59) {
			System.out.println("Grade - C");
		} else if (iMarks > 49) {
			System.out.println("Grade - D");
		} else {
			System.out.println("Fail !!! ");
		}
	}

	public static void main(String[] args) {

	}

}
