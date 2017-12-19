package lesson171219;

public class FieldsDemo {

	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.state);
		
		a.state = 10;
		
		System.out.println(a.state);
		
		System.out.println(a.toString());
		
		System.out.println(new A().toString());
		
	}
	
}

class A {
	int state;
	
	@Override
	public String toString() {
		return "state = " + Integer.toString(this.state);
	}
	
}


