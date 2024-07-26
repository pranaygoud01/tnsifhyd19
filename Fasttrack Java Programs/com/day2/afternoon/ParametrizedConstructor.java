package com.day2.afternoon;

public class ParametrizedConstructor {
	private int a;
	 ParametrizedConstructor(int b)
	 {
		 this.a=b;
	 }

	  int display() {
		  return a;
	  }
	public static void main(String[] args) {
		 ParametrizedConstructor obj= new ParametrizedConstructor(20);
		 System.out.println(obj.display());
		 
		 

	}

}
