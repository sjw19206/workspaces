package org.sjw19206.keywords.usageofstatic;

public class UsageOfStatic {

	static {
		System.out.println("static block !!! ");
	}

	private static int iCountObjects = 0;

	private static void incrementCount() {
		iCountObjects++;
	}

	public UsageOfStatic() {
		incrementCount();
	}

	public static void displayCountValue() {
		System.out.println("Value is - " + iCountObjects);
	}

	public static void main(String[] args) {

		UsageOfStatic.displayCountValue();

		UsageOfStatic objUs_1 = new UsageOfStatic();
		UsageOfStatic objUs_2 = new UsageOfStatic();

		UsageOfStatic.displayCountValue();
		
		System.out.println(UsageOfStatic.iCountObjects);
	}

}
