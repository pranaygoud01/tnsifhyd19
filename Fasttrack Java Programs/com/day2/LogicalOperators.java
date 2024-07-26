package com.day2;

public class LogicalOperators {

	public static void main(String[] args) {
	    int a=10,b=12,c=8;
	    if(a<b&&b>c)
	    {
	    	System.out.println("&& Operator is Working.....");
	    }
	    if(b>a||b<c) {
	    	System.out.println("|| Operator is Working.....");
	    }
	    if(b!=a) {
	    	System.out.print("!= Operator is Working.....");
	    }

	}

}
