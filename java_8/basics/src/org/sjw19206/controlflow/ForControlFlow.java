package org.sjw19206.controlflow;

public class ForControlFlow {

	public void forControlFlow(int iNum) {

		for (int i = 1; i <= iNum; i++) {
			System.out.println("Number - " + i);
		}

		int j = 10;

		for (; j <= iNum * 3; j++) {
			System.out.println("Number - " + j);
		}
	}

	public void forEachControlFlow() {

		int[] iNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int iNumber : iNumbers) {
			System.out.println("Number - " + iNumber);
		}
	}

	public static void main(String[] args) {

		ForControlFlow objFc = new ForControlFlow();

		objFc.forControlFlow(10);

		objFc.forEachControlFlow();
	}

}
