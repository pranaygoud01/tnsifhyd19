package com.day2;
class Bewakoff{
	private  int a;
	Bewakoff(int b){
		this.a=b;
	}
     public int geta() {
    	 return a;
     }
}
public class Constructors {
	public static void main(String[] args) {
		Bewakoff obj = new Bewakoff(10);
		  System.out.println(obj.geta());
	}
}
