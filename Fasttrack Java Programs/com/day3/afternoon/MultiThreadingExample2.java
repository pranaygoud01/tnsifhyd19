package com.day3.afternoon;
class MultiThreadingDemo2 implements Runnable
{
	public void run() {
		System.out.println(Thread.currentThread().getId());
	}
}
public class MultiThreadingExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=0;i<5;i++) {
        	Thread m=new Thread(new MultiThreadingDemo2());
        	m.start();
        }
	}

}
