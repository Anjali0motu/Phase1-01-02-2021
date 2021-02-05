package com.simplilearn.typecasting;

import java.util.Scanner;

public class StringtoNumberConversionInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("------------");
		System.out.println("Welcome to numeric Convertor");
		System.out.println("Enter a string number value");
		System.out.println("--------------");
		
		String price = input.next();//taking input from the user
		
		int priceInt = Integer.parseInt(price);//After taking input from the user converting into integer
		byte priceByte = Byte.parseByte(price);//After taking input from the user converting into byte
		double priceDouble = Double.parseDouble(price);//After taking input from the user converting into double
		
		System.out.println("Integer price ::" +priceInt);
		System.out.println("Byte price ::" +priceByte);
		System.out.println("Double price ::" +priceDouble);
	}
}
