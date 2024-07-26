package com.day2.afternoon;
class Brand{
	int a=10;
	int display(int value)
	{
		return value;
	}
}
class Car extends Brand{
	int b=display(10);
}
public class SimpleInheritance {

	public static void main(String[] args) {
		Car c1=new Car();
	System.out.println(c1.b);

	}

}
