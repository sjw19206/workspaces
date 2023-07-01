package org.sjw19206.operators;

public class ShiftOperators {

	public int leftShift(int iNum1, int iNum2) {

		return iNum1 << iNum2;
	}

	public int rightShift(int iNum1, int iNum2) {

		return iNum1 >> iNum2;
	}

	public int rightShiftE(int iNum1, int iNum2) {

		return iNum1 >>> iNum2;
	}

	public static void main(String[] args) {

		ShiftOperators objSo = new ShiftOperators();

		System.out.println("Result is " + objSo.leftShift(15, 2));

		System.out.println("Result is " + objSo.rightShift(15, 2));

		System.out.println("Result is " + objSo.rightShiftE(15, 2));
		
		System.out.println("Result is " + objSo.rightShift(-15, 2));
		
		/*
		 * the MSB or parity bit is getting changed to 0 for -ve numbers
		 */
		System.out.println("Result is " + objSo.rightShiftE(-15, 2));
	}

}
