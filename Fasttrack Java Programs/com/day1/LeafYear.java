package com.day1;
import java.util.Scanner;
public class LeafYear {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Year:");
		 int year=sc.nextInt();
		 boolean isLeaf=(year%4==0&&year%100!=0)||(year%400==0);
		 if(isLeaf)
		 {
			 System.out.println(year+" is Leaf Year");
		 }
		 else {
			 System.out.println(year+" is not a Leaf Year");
		 }
		 sc.close();
	}

}
