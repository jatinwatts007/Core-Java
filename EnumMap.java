package CoreJava;
import java.util.*;
public enum Months1 {January,Febuary,March};
public class EnumMapExpample {
	public static void main(String[]args) {
	EnumMap<Months1, String> map = new EnumMap<Months1, String>(Months1.class);
	map.put(Months1.January, "1");
	map.put(Months1.Febuary, "2");
	map.put(Months1.March, "3");
	for(Map.Entry m:map.entrySet()) {
		System.out.println(m.getValue()+" has a total of "+m.getKey()+" States");
	}
}
	}
