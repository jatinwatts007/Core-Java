package CoreJava;

public class ThrowDemo {
	public static void main(String [] args) {
		try {
			int a=50,b=0;
			if(b==0) 
				throw new Exception("Divide by zero causes an exception");
				int c=a/b;
				System.out.println("Result is :"+c);
		}
		catch(Exception e) {
			System.out.println("Exception is"+e);
		}
	}
}
