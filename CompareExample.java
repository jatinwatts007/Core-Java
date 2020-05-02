package CoreJava;
import java.util.*;
class Student implements Comparable<Student>{
	int rollno;
	String name;
	Student(int rollno, String name){
		this.rollno = rollno;
		this.name = name;
	}
	public int compareTo(Student st) {
		if(rollno==st.rollno) 
			return 0;
			else if(rollno>st.rollno) 
				return 1;
				else 
					return -1;

	}
}
public class CompareExample {
	public static void main(String[]args) {
		ArrayList <Student> a1 = new ArrayList<Student>();
		a1.add (new Student (101,"Jatin"));
		a1.add (new Student (104,"JJJ"));
		a1.add (new Student (102,"James"));
		a1.add (new Student (100,"joker"));
		for(Student stud1:a1) {
			System.out.println(stud1.rollno+" "+stud1.name);
		}
		Collections.sort(a1);
		System.out.println("ater sorting");
		for(Student stud1:a1) {
			System.out.println(stud1.rollno+" "+stud1.name);
		}
		
	}
}
