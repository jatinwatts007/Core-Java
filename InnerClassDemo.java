package CoreJava;

public class innerClassDemo {
	private String welcome = "welcome to edureka";
		class Inner{
		void hello() {
			System.out.println(welcome+",happy learning");
			}
		}
		public static void main(String[] args) {
			innerClassDemo obj= new innerClassDemo();
			innerClassDemo.Inner in = obj.new Inner();
			in.hello();
			}
}
