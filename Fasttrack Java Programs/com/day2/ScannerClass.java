package com.day2;
import java.util.Scanner;
public class ScannerClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any number:");
		int a=sc.nextInt();
		System.out.println("Entered Numbered is :"+a);
        sc.close();
	}

}
