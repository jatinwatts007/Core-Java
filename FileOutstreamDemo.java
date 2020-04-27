package CoreJava;
import java.io.FileOutputStream;
public class FileOutstreamdemo {
	public static void main(String[]args) {
		try {
			FileOutputStream fo = new FileOutputStream("Employee.text");
			fo.write(10);
			fo.close();
			System.out.println("Information is wriiten into the file");
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
