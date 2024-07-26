package com.day2;
class E{
	void display(int a)
	{
		System.out.println(a);
	}
	}
class F extends E{
	void display(double b)
	{
		System.out.println(b);
	}
}

public class InstanceOverload {

	public static void main(String[] args) {
		E obj=new F();
		obj.display(81);

	}

}
