package CoreJava;

public class NestedTryDemo {
	public static void main (String[]args) {
		try {
			try {
				int a=9,b=0;
				System.out.println("Division is: "+(a/b));
			}
			catch(ArithmeticException e){
				System.out.println("Arthmetic error");
			}
			try {
				int arr[] = {1,2,3};
				System.out.println(arr[5]);
			}
			catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Array out of index error");
			}
		}catch(Exception e) {
			System.out.println("Exception Error");
		}
	}
}
