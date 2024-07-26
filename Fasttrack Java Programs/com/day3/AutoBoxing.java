package com.day3;
//WrapperClass
//Converting Primitive Datatype to Object
public class AutoBoxing {

	public static void main(String[] args) {
		int a=20;
		Integer aObj=Integer.valueOf(a);
		System.out.println(aObj);
		if(aObj instanceof Integer)
		{
			System.out.println("True");
		}
	}

}
