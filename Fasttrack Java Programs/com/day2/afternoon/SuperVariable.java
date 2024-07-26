package com.day2.afternoon;
class E
{
	 int num=10;
	
}
class F extends E
{
   int num=20;
   void print()
   {
	   System.out.println(super.num);
   }
  
  
  
}

public class SuperVariable {

	public static void main(String[] args) {
		F obj=new F();
		obj.print();
		

	}

}
