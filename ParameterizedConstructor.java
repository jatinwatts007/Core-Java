package casestudy;

class student{
	int i;
	String s;
	student(int a, String d){
		i=a;
		s=d;
		
	}
	void printData() {
		System.out.println(i+" "+s);
	}
};
public class parameterizedConstructor {
	public static void main(String [] args) {
		student s1 = new student(1,"jatin");
		student s2 = new student (2,"mayank");
		s1.printData();
		s2.printData();
		
		
	}

}
