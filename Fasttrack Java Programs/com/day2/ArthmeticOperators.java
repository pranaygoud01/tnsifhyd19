package com.day2;
import java.util.Scanner;

public class ArthmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Scanner sc=new Scanner(System.in);
          System.out.print("Enter any two numbers:");
          int a=sc.nextInt();
          int b=sc.nextInt();
          System.out.println("Arthemitic Operators");
          System.out.println("Addition of two numbers is"+(a+b));
          System.out.println("sub of two numbers is"+(a-b));
          System.out.println("mul of two numbers is"+(a*b));
          System.out.println("div of two numbers is"+(a/b));
          System.out.println("mod of two numbers is"+(a%b));
          sc.close();
	}

}
