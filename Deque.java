package CoreJava;
import java.util.*;
public class Dequeue {
	public static void main(String[]args) {
	Deque<Integer> dq = new ArrayDeque<Integer>();
	dq.add(210);
	dq.add(211);
	dq.add(212);
	dq.add(213);
	System.out.println("deque"+dq);
	dq.removeFirst();
	dq.addLast(105);
	System.out.println("after adding and removing data:"+dq);
}
}
