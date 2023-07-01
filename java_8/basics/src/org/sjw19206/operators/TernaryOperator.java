package org.sjw19206.operators;

public class TernaryOperator {

	public int findMinimum(int iNum1, int iNum2) {

		return iNum1 > iNum2 ? iNum2 : iNum1;
	}

	public static void main(String[] args) {

		TernaryOperator objTe = new TernaryOperator();
		System.out.println("Result is " + objTe.findMinimum(34, 23));
	}

}
