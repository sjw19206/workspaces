package org.sjw19206.keywords.usageofthis;

public class UsageOfThis {

	public int iUserId;
	public String strUsername;

	public UsageOfThis() {
		System.out.println("Constructor without parameters !!!");
	}

	/*
	 * Use this when local variable (argument) and instance are same.
	 */

	public UsageOfThis(int iUserId, String strUserName) {
		this.iUserId = iUserId;
		this.strUsername = strUserName;
	}

	public void getUserDetails() {
		System.out.println("User Id :: " + this.iUserId);
		System.out.println("User Name :: " + this.strUsername);
	}

	public static void main(String[] args) {

		UsageOfThis objUs_1 = new UsageOfThis();
		UsageOfThis objUs_2 = new UsageOfThis(25, "Sharon");

		objUs_1.getUserDetails();
		objUs_2.getUserDetails();
	}

}
