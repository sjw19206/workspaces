package org.sjw19206.controlflow;

public class WhileControlFlow {

	public void whileControlFlow(int iNum) {

		while (iNum <= 50) {
			System.out.println("Number - " + iNum);
			iNum += 5;
		}
	}

	public static void main(String[] args) {
		WhileControlFlow objWc = new WhileControlFlow();
		objWc.whileControlFlow(34);
	}

}
