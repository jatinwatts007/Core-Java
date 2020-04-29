package CoreJava;

public class MultipleCatchDemo {
	public static void main(String[]args) {
		try {
			int a=10,b=0;
			int d[]= {1,3,4,5};
			System.out.println(d[10]);
		}
		catch(ArithmeticException e){
			System.out.println("Arthmetic Exception has occured");
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array out of bounds Exception has occured");
		}
		catch(Exception e){
			System.out.println("Exception has occured");
		}
	}
}
