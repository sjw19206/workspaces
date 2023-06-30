package org.sjw19206.operators;

public class UnaryOperators {

	public static void main(String[] args) {

		int a = 25;
		int b = -15;

		boolean bVal_1 = true;
		boolean bVal_2 = false;

		System.out.println(a++); // use then change
		System.out.println(a);
		System.out.println(++a); // change then use
		System.out.println(a);

		System.out.println(b--); // use then change
		System.out.println(b);
		System.out.println(--b); // change then use
		System.out.println(b);

		System.out.println(bVal_1 + " and " + !bVal_1);
		System.out.println(bVal_2 + " and " + !bVal_2);
		
		/*
		 * bitwise complement ::
		 * 1. bitwise complement then convert to decimal
		 * 2. 2's complement of step 1 (decimal value)
		 */
		System.out.println(~a);
		System.out.println(~b);

	}

}
