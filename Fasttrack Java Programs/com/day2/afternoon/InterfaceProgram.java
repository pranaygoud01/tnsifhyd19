package com.day2.afternoon;
class Brand2{
	void Model2()
	{
		System.out.println("Hello");
	}
}
interface Brand1{
	 String Model();
}
class Car1 extends Brand2 implements Brand1{
	public String Model() {
		return "Audi";
	}
	
}
public class InterfaceProgram {

	public static void main(String[] args) {
	Car1 ob=new Car1();
	System.out.println(ob.Model());
  ob.Model2();
	}

}
