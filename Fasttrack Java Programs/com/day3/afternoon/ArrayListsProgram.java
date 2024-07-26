package com.day3.afternoon;

import java.util.ArrayList;

public class ArrayListsProgram {

	public static void main(String[] args) {
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<5;i++)
          arr.add(i);
        
        System.out.println(arr);
        for(int i=0;i<5;i++)
        {
        	System.out.print(arr.get(i)+" ");
        }
	}

}
