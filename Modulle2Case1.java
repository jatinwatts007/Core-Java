package casestudy;
import java.util.*;
public class Mod2Case1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean x = true;
		while(x) {
			System.out.println("Michael enter the number");
			double a = sc.nextDouble();
			System.out.println("Bruce enter the number");
			double b = sc.nextDouble();
			if(a<b) {
				System.out.println("Michael will forget the girl");
				x = false;
			}
			else if(a>b) {
				System.out.println("Bruce will forget the girl");
				x = false;
			}
			else {
			}
		}
	}
	
}
