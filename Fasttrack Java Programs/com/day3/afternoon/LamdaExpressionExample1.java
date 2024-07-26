package com.day3.afternoon;
interface Goa{
	void Travel();
}
public class LamdaExpressionExample1 {

	public static void main(String[] args) {
	   Goa g1=()->{
		   System.out.println("Hello World");
	   };
	   g1.Travel();

	}

}
