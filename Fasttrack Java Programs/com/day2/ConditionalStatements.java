package com.day2;
import java.util.Scanner;
public class ConditionalStatements {

	public static void main(String[] args) {
		int a=10,b=8;
		Scanner sc=new Scanner(System.in);
		if(a>b) {
			System.out.println(a+" is Greater than "+b);
		}
		else if(b>a) {
			System.out.println(b+" is Greater than "+a);
		}
		else if(b==a) {
			System.out.println(a+" & "+b+"are equal");
		}
		
	     System.out.print("Enter your Choice:");
	     int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("your choice is 1");
			break;
		case 2:
			System.out.println("your choice is 2");
			break;
			default:
				System.out.println("your are choosen from out of syllabus");
		}
      sc.close();
	}

}
