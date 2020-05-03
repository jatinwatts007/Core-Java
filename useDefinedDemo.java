package CoreJava;
public class InvalidPasswordException extends Exception{
	InvalidPasswordException(String s){
		super(s);
	}
}
public class userDefinedDemo {
	static void check (String password) throws InvalidPasswordException{
		if(password!="abcd")
			throw new InvalidPasswordException("invalid password");
		else 
			System.out.println("welcome to account no 1234");
	}
	
	public static void main(String[]args) {
		try {
			check("efgh");
		}
		catch (Exception m) {
			System.out.println("Exception occured: "+m);
		}
		System.out.println("rest of the code..");
	}
}
