package CoreJava;
import java.util.*;
public class PriorityThread extends Thread {
	public void run() {
		System.out.println("running thread name is "+Thread.currentThread().getName());
		System.out.println("running thread priorty is :"+Thread.currentThread().getPriority());
	}
	public static void main(String[]args) {
		PriorityThread t1 = new PriorityThread();
		PriorityThread t2 = new PriorityThread();
		PriorityThread t3 = new PriorityThread();
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
		t3.start();
	}
}
