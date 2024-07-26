package com.day2.afternoon;
class Animal{
	void display()
	{
		System.out.println("Makkamishi");
	}
}
class Dog extends Animal{
	void display()
	{
		System.out.println("From Child");
	}
	void print() {
		System.out.println("Harris Jayaraj");
		super.display();
		display();
	}
}
public class SuperMethod {

	public static void main(String[] args) {
		Dog obj=new Dog();
		obj.print();

	}

}
