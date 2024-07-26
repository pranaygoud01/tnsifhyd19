package com.day1;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Number:");
	  
		int num=sc.nextInt();
		int originalnum,remainder,n=0,result=0;
		while(num!=0) {
			num=num%10;
			++n;
		}
		originalnum=num;
		while(num!=0)
		{
			remainder=originalnum%10;
			result+=Math.pow(remainder, n);
			num=num/10;
			
		}
		if(result==num) {
			System.out.println("Yes");
		}
		else {
			System.out.println("no");
		}sc.close();
	}

}
