package com.day3.afternoon;

import java.util.Iterator;
import java.util.Stack;

public class StackProgram {

	public static void main(String[] args) {
		Stack<String> stc=new Stack<>();
		stc.push("Pranay");
		stc.push("Prabhas");
		stc.push("Sharath");
		Iterator<String> itr=stc.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        stc.pop();
        itr= stc.iterator();

       
        System.out.println(stc);
	}

}
