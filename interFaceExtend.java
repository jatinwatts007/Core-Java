package CoreJava;

interface walkable{
	void walk();
}
interface runnable extends walkable{
	void run();
}

 class interfaceExtend implements runnable {
	 public void walk() {
		 System.out.println("interface walk");
	 }
	 public void run() {
		 System.out.println("interface run");
	 }
 public static void main(String[]args) {
	 interfaceExtend obj = new interfaceExtend();
	 obj.walk();
	 obj.run();
 }
 }
