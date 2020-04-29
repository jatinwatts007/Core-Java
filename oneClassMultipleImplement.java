package CoreJava;
interface walk{
	void Walk();
}
interface run{
	void Run();
}
class animal implements walk,run{
	public void Walk() {
		System.out.println("walk interface is executed");
	}
	public void Run() {
		System.out.println("run interface is executed");
	}
};
class human extends animal{
	
}
public class oneClassMultipleImplement {
	public static void main(String[]args) {
		walk h1 = new human();
		run h2 = new human();
		h1.Walk();
		h2.Run();
	}
}
