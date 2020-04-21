package CoreJava;
interface Welcome{
	default void say() {
		System.out.println("Hello,Welcome to edureka");
	}
	void hello(String msg);
}
public class defaultClassInterfaceDemo implements Welcome{
public void hello(String msg) {
	System.out.println(msg);
}
public static void main(String[] args) {
	defaultClassInterfaceDemo out = new defaultClassInterfaceDemo();
	out.say();
	out.hello("happy learning");
	
}
}
