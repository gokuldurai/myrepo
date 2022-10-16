package javaProgram;

import java.util.PriorityQueue;

public class PriorityQueueSample {
	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("hi");
		queue.add("hello");
		queue.add("hihello");
		queue.add("bye");
		queue.add("goodbye");
		System.out.println(queue);
		System.out.println(queue.peek());//will fetch and not remove
		System.out.println(queue);
		System.out.println(queue.poll());//fetch and remove
		System.out.println(queue);
	}

}
