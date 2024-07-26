package com.day1;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
       System.out.print("Enter Number");
       int count=sc.nextInt();
       int num1=0,num2=1;
       System.out.println("Fibonacci Series:");
       for(int i=1;i<=count;++i) {
    	   System.out.print(num1+" ");
    	   int sum=num1+num2;
    	   num1=num2;
    	   num2=sum;
       }
       sc.close();
	}

}
