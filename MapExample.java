package CoreJava;
import java.util.*;
public class mapExample {
	public static void main(String[]args) {
		Map<Integer,String> map = new Hash/LinkedHash/TreeMap<Integer,String>();
		map.put(1,"Jatin");
		map.put(2,"Mayank");
		map.put(3,"watts007");
		map.put(4,"Jokere007");
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getValue()+" has a total of "+m.getKey()+" States");
		}
	}
}
