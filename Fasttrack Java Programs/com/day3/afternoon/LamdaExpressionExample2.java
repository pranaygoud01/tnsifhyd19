package com.day3.afternoon;
interface Hyderabad{
	int Hyd(int a);
}
public class LamdaExpressionExample2 {

	public static void main(String[] args) {
		Hyderabad obj=(int a)->{
			return a;
		};
		System.out.println(obj.Hyd(2));
 
	}

}
