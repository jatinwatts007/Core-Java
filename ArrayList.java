package CoreJava;
import java.util.*;
public class ArrayList {
	public static void main(String[]args) {
		ArrayList al = new ArrayList();
		al.add("hello");
		al.add(45);
		al.add(88);
		al.add("edureka");
		System.out.println(al);
		al.remove("java");
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
