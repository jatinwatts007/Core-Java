package CoreJava;

public class DaemonThread extends Thread {
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName()+"is daemon Thread");
		}
		else {
			System.out.println(Thread.currentThread().getName()+"is user Thread");
		}
	}
	public static void main(String[]args) {
		DaemonThread t1 = new DaemonThread();
		DaemonThread t2 = new DaemonThread();
		t1.setDaemon(true);
		t1.start();
		t2.setPriority(5);
		t2.start();
	}
}
