package com.day3;



public class ExceptionHandlings {

	public static void main(String[] args) {
		try {
			int a=100/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally{
			System.out.println("Hi");
		}
	}

}
//ArithemeticException
//NullPointerException
//ArrayIndexOutOfBoundsException
//NumberFormatException