package casestudy;
class overload{
	int i,j;
	String name;
	overload(int item,int price){
		i=item;
		j=price;
		name="jatin";
	}
	overload(int item1,int price1,String s){
		i=item1;
		j=price1;
		name=s;
	}
	void display() {
		System.out.println(i+" "+j+" "+name);
	}
}
public class constructorOverloading {
	public static void main() {
		overload o1 = new overload(1,2);
		overload o2 = new overload(1,3,"mayank");
		o1.display();
		o2.display();
		
	}
}
