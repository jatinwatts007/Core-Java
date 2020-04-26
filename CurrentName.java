package CoreJava;
import java.util.*;
public class CurrentName extends Thread {
	public void run() {
		System.out.println("running: "+CurrentName.currentThread().getName());
	}
	public static void main(String[]args) {
		CurrentName t1 = new CurrentName();
		CurrentName t2 = new CurrentName();
		t1.setName("JJ");
		t1.start();
		t2.setName("KK");
		t2.start();
	}
}
