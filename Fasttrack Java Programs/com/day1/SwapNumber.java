package com.day1;
import java.util.Scanner;
public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Numbers in Order:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println(num1+" "+num2);
		 sc.close();
	}

}
