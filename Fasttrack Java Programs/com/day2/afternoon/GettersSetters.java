package com.day2.afternoon;

public class GettersSetters {

	private int a,b;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public static void main(String[] args) {
		GettersSetters obj=new GettersSetters();
		obj.setA(10);
		System.out.println(obj.getA());
		obj.setB(100);
		System.out.println(obj.getB());
	}

}
