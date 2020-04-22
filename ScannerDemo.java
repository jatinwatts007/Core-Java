package CoreJava;
import java.util.Scanner;
public class scannerDemo {
	public static void main(String [] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Firstname:");
	String first = sc.next();
	System.out.println("Enter Lastname:");
	String last = sc.next();
	System.out.println("firstname:"+first+"lastname:"+last);
	}
}
