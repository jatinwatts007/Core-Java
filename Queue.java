package CoreJava;
import java.util.*;
public class Queue {
	public static void main(String[]args) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(210);
		queue.add(211);
		queue.add(212);
		queue.add(243);
		System.out.println("head:"+queue.peek());
		System.out.println("Iterating the Queue elements:");
		Iterator itr = queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		queue.remove();
		queue.poll();
		System.out.println("after removing two elements");
		Iterator<Integer> irt2 = queue.iterator();
		while(irt2.hasNext()) {
			System.out.println(irt2.next());
		}
	}
}
