package casestudy;
class manager{
	int salary= 1100000;
}
class employee extends manager{
	int days =5;
	String nam="jatin";
}
public class inheriDemo {
	public static void main() {
		employee e1 = new employee();
		System.out.println("Days of working"+e1.days+"Name"+e1.nam+"salary"+e1.salary);
	}
}
