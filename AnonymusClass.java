package CoreJava;

abstract class anonymousclassdemo{
	public abstract void display();
}
public class anonymousclass {
	public static void main (String[]args) {
		anonymousclassdemo i = new anonymousclassdemo() {
			public void display () {
				System.out.println("Anonymous Class");
			}
		};
		i.display();
	}
}
