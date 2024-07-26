package com.day1;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String:");
		String str=sc.next();
		String Reversed="";
		for(int i=str.length()-1;i>=0;i--) {
			Reversed+=str.charAt(i);
		}
		
		System.out.print("Reversed String is "+Reversed); sc.close();
		}

}
