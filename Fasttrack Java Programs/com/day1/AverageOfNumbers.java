package com.day1;
import java.util.Scanner;
public class AverageOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any two number:");
		double num1=sc.nextInt();
		double num2=sc.nextInt();
		double avg=(num1+num2)/2;
		System.out.println("Average of two Number:"+avg);
		sc.close();

	}

}
