package CoreJava;

public class ThrowsDemo {
	public static int Divide(int a, int b) throws Exception{
		int c;
		c=a/b;
		return c;
	}
	public static void main(String[]args) {
		try {
		ThrowsDemo t= new ThrowsDemo();
		int ans = Divide(10,0);
		System.out.println("Result are:"+ans);
	}catch(Exception e) {
		System.out.println("Exception Error"+e);
	}
	}
}
