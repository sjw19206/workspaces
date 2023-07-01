package org.sjw19206.operators;

public class LogicalOperators {

	/*
	 * Logical AND (&&) - does not check second condition, if FIRST one is FALSE
	 * 
	 * Bitwise AND (&) - checks both conditions
	 * 
	 * Logical OR (||) - does not check second condition, if FIRST one is TRUE
	 * 
	 * Bitwise OR (|) - checks both conditions
	 */

	public static void main(String[] args) {

		int a = 10, b = 12, c = 20;

		System.out.println(a + " " + b + " " + c);

		/*
		 * second condition won't be checked and value of 'a' remains same
		 */
		System.out.println(a > b && ++a == c);

		System.out.println(a + " " + b + " " + c);

		/*
		 * both the conditions will be checked and value of 'a' getting changed
		 */
		System.out.println(a > b & ++a == c);

		System.out.println(a + " " + b + " " + c);

		System.out.println(++a >= b || ++a == c);

		System.out.println(a + " " + b + " " + c);

		System.out.println(++a >= b | ++a == c);

		System.out.println(a + " " + b + " " + c);

	}

}
