package com.simplilearn.typecasting;

import java.util.Scanner;

public class NumerDataConverter {

	public static void main(String[] args) {
		// step 1: collect user input (console)
		Scanner input = new Scanner(System.in);
		
		System.out.println("-------------");
		System.out.println("Welcome to Numeric Convertor");
		System.out.println("Enter a integer number Value");
		System.out.println("-------------");
		int userIn = input.nextInt();
		
		// steps 2: convert values into different
		long bigValues = userIn;
		float floatValue = userIn;
		double doubleValue = userIn;
		byte byteValue =(byte)userIn;
		short shortValue = (short)userIn;
		
		// steps 3: print converted values
		
		//System.out.println("BigCount:: "+ bigValues);
		System.out.println("FloatCount::" + floatValue);
		System.out.println("DoubleCount::" + doubleValue);
		System.out.println("byteValue::" + byteValue);
		System.out.println("shortValue::" + shortValue);



	}

}
