package com.day3.afternoon;

import java.util.LinkedList;

public class LinkedListProgram {

	public static void main(String[] args) {
		LinkedList<Integer> arr=new LinkedList<Integer>();
        for(int i=0;i<5;i++)
          arr.add(i);
        
        System.out.println(arr);
        for(int i=0;i<5;i++)
        {
        	System.out.print(arr.get(i)+" ");
        }
	}

}
