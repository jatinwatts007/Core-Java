package casestudy;
import java.util.*;
class employe{
	int rollno;
	String name;
	String abc;
	boolean x; 
	employe(int i, String s){
		rollno=i;
		name=s;
	}
	employe(String a, boolean b){
		abc=a;
		x=b;
	}
	void display1(){
		System.out.println(rollno+" "+name);
	}
	void display2(){
		System.out.println(abc+" "+x);
	}

}
public class temp {

	public static void main(String[] args) {
		employe e1 = new employe(10,"mukesh");
		employe e2 = new employe("hello",true);
		e1.display1();
		e2.display2();
	}

}
