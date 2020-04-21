package CoreJava;

public class ExceptionDemo {
	public static void  main(String[]args) {
		int a=9,b=0;
		try {
			System.out.println(a/b);
		}
		catch(Exception e) {
			System.out.println("We can not divide any number by zero.Divide by zero Exception has occured");
		}
	}

}
