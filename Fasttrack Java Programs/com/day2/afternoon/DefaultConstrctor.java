package com.day2.afternoon;

public class DefaultConstrctor {
	private int a;
	DefaultConstrctor()
	{
		this.a=10;
	}
	public void display()
	{
		System.out.println(a+" is value of a");
	}

	public static void main(String[] args) {
		 DefaultConstrctor obj=new  DefaultConstrctor();
		 obj.display();
	}

}
