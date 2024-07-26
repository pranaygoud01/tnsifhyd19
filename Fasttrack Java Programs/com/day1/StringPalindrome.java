package com.day1;
import java.util.Scanner;
public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your String:");
		String str=sc.nextLine();
		String Reversed="";
		for(int i=str.length()-1;i>=0;i--) {
			Reversed+=str.charAt(i);
		}

		if(str.equals(Reversed))
		{
			System.out.println("String is Palindrome");
		}
		else {
			System.out.println("String is not Palindrome");
		} sc.close();
	}

}
