package org.sjw19206.datatypes;

public class DefineVariables {

	boolean bVar; // 1 bit

	byte btVar; // 1 byte
	short sVar; // 2 bytes
	int iVar; // 4 bytes
	long lVar; // 8 bytes

	float fVar; // 4 bytes
	double dVar; // 8 bytes

	public DefineVariables() {

		bVar = true; // 1 bit
		iVar = 10; // 4 bytes
	}

	public void displayBytes() {

		System.out.println("bVar  :: " + bVar);		
		System.out.println("btVar :: " + Byte.BYTES);
		System.out.println("iVar  :: " + Integer.BYTES);
	}

	public static void main(String[] args) {

		DefineVariables objDV = new DefineVariables();
		objDV.displayBytes();

	}

}
