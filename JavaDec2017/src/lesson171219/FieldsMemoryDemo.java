package lesson171219;

public class FieldsMemoryDemo {
	
	public static void main(String[] args) {
		
		B b = new B();
		
		b.i = 10;
		b.a = new A();
		b.o = b.a;
		
	}

}

class B {
	
	int i;
	
	Object o;
	
	A a;
	
}
