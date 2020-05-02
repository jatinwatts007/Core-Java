package CoreJava;
import java.util.*;
public class Student1{
	int rollno;
	String name;
	Student1(int rollno,String name){
		this.rollno = rollno;
		this.name = name;
	}
}
class NameComparartor implements Comparator <Student1>{
	public int compare(Student1 s1, Student s2) {
		return s1.name.compareTo(s2.name);
	}
}
class RollNoComparator implements Comparator <Student1>{
	public int compare(Student1 s1, Student s2) {
		if(s1.rollno==s2.rollno)
			return 0;
		else if(s1.rollno>s2.rollno)
			return 1;
		else return -1;
	}
}
public class ComparatorExample {
	public static void main(String[]args) {
		ArrayList<Student1> a12 = new ArrayList<Student>();
		a12.add(new Student1(101,"Vijay"));
		a12.add(new Student1(102,"Jatin"));
		a12.add(new Student1(103,"Joker"));
		System.out.println("sorting by rollno");
		Collections.checkedSortedMap(a12,  new RollNoComparator());
		for(Student1 st: a12) {
			System.out.println(st.rollno+" "+st.name );
		}
		System.out.println("sorting by name");
		Collections.sort(a12,new NameComparartor());
		for(Student1 st: a12) {
			System.out.println(st.rollno+" "+st.name );
		}
	}
}
