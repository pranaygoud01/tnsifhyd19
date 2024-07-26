package com.day3.afternoon;
/*
 * @FunctionalInterface annotation is used to ensure 
 * that the functional interface can’t have more than one
 *  abstract method
 */
@FunctionalInterface
interface Chennai{
	int cost(int a);
	//void money();
}
public class FunctionInterfaceAnnotationExp {

	public static void main(String[] args) {
         Chennai ch=(int a)->a*a;
         System.out.println(ch.cost(6));
		
	}

}
