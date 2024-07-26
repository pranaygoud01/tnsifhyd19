package com.day3.afternoon;
 class MultiThreadDemo extends Thread
 {
	public void run() {
		 System.out.println(" "+Thread.currentThread().getId());
	}
	
 }
public class MultiThreadingExample {

 
	public static void main(String[] args) {
	 
	  for(int i=0;i<5;i++) {
		  MultiThreadDemo obj=new MultiThreadDemo();
		  obj.start();
	  }
	
	  
	  }

}
