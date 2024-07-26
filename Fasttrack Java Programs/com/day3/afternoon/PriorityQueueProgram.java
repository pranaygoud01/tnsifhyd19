package com.day3.afternoon;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueProgram {

	public static void main(String[] args) {
	Queue<Integer> pq=new PriorityQueue<>();
		 pq.add(2);
		 pq.add(3);
		 pq.add(9);
		 Iterator<Integer> itr=pq.iterator();
		 while(itr.hasNext()) {
			 System.out.print(itr.next()+" ");
		 }
		 
		 System.out.println("\n"+pq.peek());
		 System.out.println(pq);
		 System.out.println(pq.poll());
		 System.out.println(pq.poll());
		 System.out.println(pq.peek());

	}

}
