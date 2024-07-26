package com.day1;
import java.util.Scanner;
public class ConcatenateStrings {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter two Strings:");
	    String str1=sc.nextLine();
	    String str2=sc.nextLine();
	    String add=str1+str2 ;
	    System.out.println("Concatenated String:"+add);
	    sc.close();
	}

}
