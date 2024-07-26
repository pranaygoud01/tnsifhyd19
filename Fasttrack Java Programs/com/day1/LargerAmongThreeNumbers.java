package com.day1;
import java.util.Scanner;
public class LargerAmongThreeNumbers {

	public static void main(String[] args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.print("Enter Three Numbers:");
		  int num1=sc.nextInt();
		  int num2=sc.nextInt();
		  int num3=sc.nextInt();
         if(num1>num2&&num1>num3)
         {
        	 System.out.println(num1+" is Larger Number");
        	 
         }
         else if(num2>num1&&num2>num3)
             {
            	 System.out.println(num2+" is Larger Number");
            	 
             }
        	 else 
        		 {
                	 System.out.println(num3+" is Larger Number");
                	 
                 } sc.close();
        	
	}

}
