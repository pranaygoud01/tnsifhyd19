package com.day1;
import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any Number:");
		int num=sc.nextInt();
		
		int sum=0;
		while(num!=0) {
			
			sum+=num%10;
			num=num/10;
			
			
		}
		
		System.out.println("Sum of Digits is "+sum); sc.close();
	}

}
