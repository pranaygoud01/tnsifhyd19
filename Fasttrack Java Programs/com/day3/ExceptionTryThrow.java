package com.day3;
import java.lang.*;
public class ExceptionTryThrow {

	public static void main(String[] args) {
		try {
			int a=10;
			if(a>=10)
			{
				throw new ArithmeticException("valid")	;
			}
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		}
}
