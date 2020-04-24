package CoreJava;

import java.util.TreeSet;
import java.util.Iterator;

public class Treeset {
	public static void main(String[]args) {
		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(13);
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
}
}
