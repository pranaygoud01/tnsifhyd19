package com.day2.afternoon;
 abstract class Dept{
	abstract void events();
	
}
class students extends Dept{
	void events(){
		System.out.println("students Participated in events");
		
		
	}
}

public class AbstractMethod {
    
	public static void main(String[] args) {
	students obj=new students();
	obj.events();
	}

}
