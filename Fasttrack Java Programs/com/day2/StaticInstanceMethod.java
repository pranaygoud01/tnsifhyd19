package com.day2;

public class StaticInstanceMethod {
	void print() {
		System.out.println("From instance method"); 
	}
   static void display()
   {
	  System.out.println("From static Method");
   }
   public static void main(String[] args) {
	   StaticInstanceMethod stc=new StaticInstanceMethod();
	   stc.print();
	   display();
   }
}
