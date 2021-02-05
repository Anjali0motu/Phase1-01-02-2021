package com.simplilearn.typecasting;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		//step1: Collect user input console
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("------------");
		System.out.println("Welcome to Calculator");
		System.out.println("------------");
		
		/*
		 * System.out.println("Enter number value"); int number1 = input.nextInt();
		 * 
		 * System.out.println("Enter number value"); int number2 = input.nextInt();
		 */
		
		System.out.println("Enter number value");
		int number3 = input.nextInt();
		
		System.out.println("Enter number value");
		int number4 = input.nextInt();
		
		//double res = add(number1, number2);
		
		byte res1 = add(number3, number4);
		short res2 = sub(number3, number4);
		double res3 = mul(number3, number4);
		float res4 = div(number3, number4);

		
		
		//System.out.println("Addition" +res);
		
		System.out.println("Addition::" +res1);
		System.out.println("Sub::" +res2);
		System.out.println("Multiplication::" +res3);
		System.out.println("Division::" +res4);

		
	}
	/*
	 * public static double add(int number1, int number2) { return number1+number2;
	 * 
	 * }
	 */
	
	public static byte add(int number3, int number4)
	{
		return (byte)(number3+number4);
		
	}
	
	public static short sub(int number3, int number4)
	{
		return (short)(number3-number4);
		
	}
	
	public static double mul(int number3, int number4)
	{
		return (double)(number3*number4);
		
	}
	
	public static float div (int number3, int number4)
	{
		return (number3 / number4);
		
	}
	
	

}
