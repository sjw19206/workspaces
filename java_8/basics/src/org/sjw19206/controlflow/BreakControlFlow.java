package org.sjw19206.controlflow;

public class BreakControlFlow {

	public void breakControlFlow(int iNum) {

		for (int i = 1; i <= iNum; i++) {

			for (int j = 1; j <= 10; j++) {
				System.out.println(i + " and " + j);
				if (i == j) {
					break;
				}
			}
		}
	}

	public static void main(String[] args) {
		BreakControlFlow objBc = new BreakControlFlow();
		objBc.breakControlFlow(15);
	}

}
