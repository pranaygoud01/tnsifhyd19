package com.day2.afternoon;
abstract class Base
{
Base()
{
System.out.println("Base Constructor Called");
}
abstract void fun();
}
class Derived extends Base
{
Derived()
{
System.out.println("Derived Constructor Called");
}
void fun()
{
System.out.println("Derived fun() called");
}
}




public class AbstractConstructor {

	public static void main(String[] args) {
		
	
		Derived d = new Derived();
		d.fun();


	}

}
