package com.day2.afternoon;
class A{
	final void display() {
		 System.out.println("Pranay");
		
	 }
	
}
/*class B extends A{
	 void display()
	 {
		 System.out.println("Hi");
	 }
}*/

//Can't overridden the display method of A because it is declared by Final Keyword
public class FinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
A obj=new A();
  obj.display();
  }

}
