package CoreJava;
interface Welcomes{
	default void say() {
		sayhello();
	}
	
	private void sayhello() {
		System.out.println("hello...private method called");
	}
}
public class privateInterfaceDemo implements Welcomes {
	public static void main(String [] args) {
		Welcomes s = new privateInterfaceDemo();
		s.say();
	}
}
