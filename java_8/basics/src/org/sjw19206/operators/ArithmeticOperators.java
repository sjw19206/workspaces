package org.sjw19206.operators;

public class ArithmeticOperators {

	public double addNumbers(double dNum1, double dNum2) {

		return dNum1 + dNum2;
	}

	public double substractNumbers(double dNum1, double dNum2) {

		return dNum1 - dNum2;
	}

	public double multiplyNumbers(double dNum1, double dNum2) {

		return dNum1 * dNum2;
	}

	public double divideNumbers(double dNum1, double dNum2) {

		return dNum1 / dNum2;
	}

	public double moduloBtwNumbers(double dNum1, double dNum2) {

		return dNum1 % dNum2;
	}

	public static void main(String[] args) {

		double dNum1 = 77.56d;
		double dNum2 = 5.67d;

		ArithmeticOperators objAp = new ArithmeticOperators();

		System.out.println("Result is " + objAp.addNumbers(dNum1, dNum2));

		System.out.println("Result is " + objAp.substractNumbers(dNum1, dNum2));

		System.out.println("Result is " + objAp.multiplyNumbers(dNum1, dNum2));

		System.out.println("Result is " + objAp.divideNumbers(dNum1, dNum2));

		System.out.println("Result is " + objAp.moduloBtwNumbers(dNum1, dNum2));
	}

}
