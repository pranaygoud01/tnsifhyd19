package com.day1;
import java.util.Scanner;
public class IsPrime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Number");
		 int num=sc.nextInt();
		boolean IsPrime=true;
		 if(num<=1) {
			 IsPrime=false;
		 }
		 else
		 {
			 for(int i=2;i<=Math.sqrt(num);i++)
			 {                   if (num % i == 0) {
				 IsPrime=false;
				 break;
			 }
			 }
		 }

		 if(IsPrime)
		 {
			 System.out.print(num+"is Prime Number");
			 
		 }
		 else {
			 System.out.println(num+" is not a Prime");
		 }sc.close();
	}

}
