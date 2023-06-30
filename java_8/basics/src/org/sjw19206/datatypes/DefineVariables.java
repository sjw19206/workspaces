package org.sjw19206.datatypes;

public class DefineVariables {

	boolean bVar; // 1 bit

	char cVar;

	byte btVar; // 1 byte
	short sVar; // 2 bytes
	int iVar; // 4 bytes
	long lVar; // 8 bytes

	float fVar; // 4 bytes
	double dVar; // 8 bytes

	public DefineVariables() {

		bVar = true; // 1 bit

		cVar = 'A';

		btVar = 105;
		sVar = 200;
		iVar = 1230; // 4 bytes
		lVar = 15000l;

		fVar = 234.678f;
		dVar = 34.56d;
	}

	public void displayBytes() {

		System.out.println("byte Var   :: " + Byte.BYTES);
		System.out.println("short Var  :: " + Short.BYTES);
		System.out.println("int Var    :: " + Integer.BYTES);
		System.out.println("long Var   :: " + Long.BYTES);
	}

	public static void main(String[] args) {

		DefineVariables objDV = new DefineVariables();
		objDV.displayBytes();

	}

}
