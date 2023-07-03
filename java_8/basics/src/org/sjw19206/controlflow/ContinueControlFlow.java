package org.sjw19206.controlflow;

public class ContinueControlFlow {

	public void continueControlFlow(int iNum) {

		for (int i = 1; i <= iNum; i++) {
			for (int j = 1; j <= 10; j++) {

				if (i == j) {
					continue;
				}

				System.out.println(i + " and " + j);
			}
		}
	}

	public static void main(String[] args) {
		ContinueControlFlow objCn = new ContinueControlFlow();
		objCn.continueControlFlow(20);
	}

}
