package com.day2;
class C{
	 void display()
	{
		System.out.println("From Base");
	}
}
class D extends C{
	 void display() {
		System.out.println("From Child");
	}
}
public class InstanceOverride {
	public static void main(String[] args) {
			C obj=new D();
			obj.display();
	
}

}
