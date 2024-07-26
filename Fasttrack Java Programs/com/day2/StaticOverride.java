package com.day2;
class A{
	static void display()
	{
		System.out.println("From Base");
	}
}
class B extends A{
	static void display() {
		System.out.println("From Child");
	}
}
public class StaticOverride {

	public static void main(String[] args) {
          A.display();

	}

}
