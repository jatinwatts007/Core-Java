package CoreJava;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileToTextDemo {
	public static void main(String[]args) {
		File file = new File("student.txt");
	try {
		PrintWriter out = new PrintWriter(file);
		out.println("Jatin Watts");
		out.println(10);
		out.close();
	}
	catch(IOException e) {
		System.out.println("Exception"+e);
	}
	
	try {
		Scanner input = new Scanner(file);
		String name = input.nextLine();
		int marks=input.nextInt();
		System.out.printf("Name: %s and Marks: %d",name,marks);
	}catch(FileNotFoundException e){
		System.out.println("Exception is:"+e);
	}
	}
}
