package com.simplilearn.typecasting;

public class TypeCastDemo {

	public static void main(String[] args) {
		// Type casting:process of converting data from one data type to another
/**
 * Widening:Converting data from lower range to higher range value
 * byte->short->int->long->float->double
 */
		int byteCount=100;//-128 to 127->1 byte = 8bit
		
		int integerCount = byteCount;//widening or implicit or automatically->-32786 to 32767
		
		long bigCount = byteCount;//byte ->long
		
		float floatCount = bigCount;//long ->float
		
		double decimalCount = bigCount;//long ->double
		
		System.out.println("Byte Count::" + byteCount);
		System.out.println("IntegerCount::" + integerCount);
		System.out.println("BigCount:: "+ bigCount);
		System.out.println("FloatCount::" + floatCount);
		System.out.println("DoubleCount::" + decimalCount);

		
		

		
		
		
		
		
		
	}

}
