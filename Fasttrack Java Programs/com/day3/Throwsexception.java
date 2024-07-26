package com.day3;
class InvalidAge extends Exception{
	InvalidAge(String str){
		super(str);
	}
}

public class Throwsexception 
{  
  static void validity(int n) throws InvalidAge{
	  if(n<18) {
		  throw new InvalidAge("This Person is not allowed to vote");
	  }
	  else{
          System.out.println("Welcome to vote");
	  }
  }
 public static void main(String[] args) {
	try {
		validity(17);
	}
	catch(InvalidAge e) {
		System.out.println(e);
	}
}
}  
