package CoreJava;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterandReadDemo  {
	public  static void main  (String[]args) throws IOException {
		try {
			FileWriter fw = new FileWriter("Arrival.txt");
			fw.write("Welcome to edureka. Happy Learning");
			fw.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		FileReader fr= new FileReader("Arrival.txt");
		int i;
		while((i=fr.read())!=-1) {
			System.out.println((char)i);
		}
			fr.close();
	}
}
