package com.simplilearn.typecasting;

public class StringtoNumericConversion {

	public static void main(String[] args) {
		// String to Numeric conversion ->the string should be a convertible value
	  //wrapper class->String to numeric conversion(Conversion of one object 
		
		String  price = "124";//convertible value
		String price2 = "123abc";
		
		int priceInt = Integer.parseInt(price);//converting from string to integer
		byte priceByte = Byte.parseByte(price);
		double priceDouble = Byte.parseByte(price);	
		
		System.out.println("Integer price ::" +priceInt);
		System.out.println("Byte price ::" +priceByte);
		System.out.println("Double price ::" +priceDouble);


	}

}
