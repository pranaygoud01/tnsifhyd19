package com.day3.afternoon;
import java.util.*;
public class DequeProgram {

	public static void main(String[] args) {
		ArrayDeque<Integer> de_que = new ArrayDeque<Integer>(10);
 //we can add and remove the elements from the both sides of the queue is called deque.
	 
    de_que.add(10);
    de_que.add(20);
    de_que.add(30);
    de_que.add(40);
    de_que.add(50);

    System.out.println(de_que);

    // clear() method
    
    de_que.clear();

    de_que.addFirst(564);
    de_que.addFirst(291);
    de_que.addFirst(264);

    // addLast() method to insert the
    // elements at the tail
    de_que.addLast(24);
    de_que.addLast(14);

    System.out.println(de_que);
}
}



