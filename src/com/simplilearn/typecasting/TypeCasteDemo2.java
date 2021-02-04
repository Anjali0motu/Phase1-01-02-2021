package com.simplilearn.typecasting;

public class TypeCasteDemo2 {

	public static void main(String[] args) {
		// Type casting :process of converting data from one data type to another
		
		//Narrowing:converting  data from higher range to lower value
	
		//double -> float->long->int->short->byte
		
		double decimalCount = 111.77d;
		
		float floatCount = (float)decimalCount;
		
		long bigCount =(long) decimalCount;
		
		int intCount =(int)decimalCount;
		
		byte byteCount =(byte)decimalCount;
		
		short shortCount = (short)decimalCount;
		
		System.out.println("floatCount = "+floatCount);
		System.out.println("bigCount = "+bigCount);
		System.out.println("intCount = "+intCount);
		System.out.println("byteCount = "+byteCount);
		System.out.println("shortCount = "+shortCount);


	}

}
