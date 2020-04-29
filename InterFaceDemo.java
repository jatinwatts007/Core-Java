package CoreJava;

interface Money{
	void operation();
}
class Debit implements Money{
	public void operation() {
		System.out.println("Debiting the money from the account");
	}
}
class credit implements Money{
	public void operation() {
		System.out.println("Crediting the money to the account");
		}
	}
public class interfaceDemo {
	public static void main(String[]args) {
		Money d = new credit();
		d.operation();
	}
}
