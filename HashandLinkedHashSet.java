package CoreJava;
import java.util.*;
public class HashandLinkedHashset {
	public static void main(String[]args) {
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(14);
		set2.add(15);
		set2.add(16);
		set2.add(17);
		Iterator<Integer> itr = set.iterator();
		Iterator<Integer> itr2 = set2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
