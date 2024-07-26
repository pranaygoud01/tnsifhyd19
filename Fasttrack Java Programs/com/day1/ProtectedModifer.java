package com.day1;
class C{
	protected void mini()
	{
		System.out.println("Hi How are you?");
	}
}
public class ProtectedModifer {

	public static void main(String[] args) {
		C obj=new C();
		obj.mini();

	}

}

//The protected access modifier is accessible within package and 
//outside the package but through inheritance only.