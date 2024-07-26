package com.day1;
import java.util.Scanner;
public class SumofNaturalNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number:");
	  
		int num=sc.nextInt();
		int sum=0;
		for(int i=0;i<num;i++) {
			sum+=i;
		}
		System.out.println("Sum of Natural Number:"+sum); sc.close();
	}

}
