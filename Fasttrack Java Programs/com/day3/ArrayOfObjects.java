package com.day3;
class Student{
	public int a;
	public String b;

	Student(int d,String str){
		this.a=d;
		this.b=str;
}
	void display() {
		System.out.println("Value:"+a);
		System.out.println("Name:"+b);
	}
}
public class ArrayOfObjects {
 
	public static void main(String[] args) {
		 Student[] arr=new Student[2];
		 arr[0] =new Student(2,"Pranay");
		 arr[1]=new Student(3,"Irfan");
		 arr[0].display();
		 arr[1].display();
	}

}
