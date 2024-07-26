package com.day1;
import java.util.Scanner;
public class MinMaxArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of Elements in Array");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter the Numbers of Array:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		int min=arr[0];
		for(int i=1;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum is "+min+",Maximum is"+max);
		 sc.close();
	}

}
