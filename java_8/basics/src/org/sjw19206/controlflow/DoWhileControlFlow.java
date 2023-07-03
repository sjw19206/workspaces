package org.sjw19206.controlflow;

public class DoWhileControlFlow {

	public void doWhileControlFlow(int iNum) {

		do {
			System.out.println("Number received - " + iNum);
			iNum += 10;
		} while (iNum <= 50);
	}

	public static void main(String[] args) {
		DoWhileControlFlow objDc = new DoWhileControlFlow();
		objDc.doWhileControlFlow(29);
	}

}
