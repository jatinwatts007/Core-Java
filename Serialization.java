package CoreJava;
import java.io.Serializable;
import java.io.*;
public class StudentDemo implements Serializable{
	int id;
	String name;
	public void StudentInfo(int id, String name)  {
		this.id = id;
		this.name= name;
	}
}
public class Serialization {
	public static void main(String[]args) throws Exception {
		StudentDemo s1 = new StudentDemo();
		s1.StudentInfo(10,"Jatin");
		FileOutputStream fout= new FileOutputStream("Student.txt");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		out.writeObject(s1);
		out.flush();
		System.out.println("end");
	}
}
