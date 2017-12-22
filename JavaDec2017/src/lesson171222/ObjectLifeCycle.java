package lesson171222;

public class ObjectLifeCycle {
	
	public static void main(String[] args) {
		
		A a  = new A();
		
	}

}


class A extends Object {

	A() {
		super();
		x = 30;
		y = 30;
		System.out.println("Constructor:  x = "  + x + ", y = " + y);
	}
	
	A(int x, int y) {
		super();
		
	}
	
	static {   // static initialization block
		
	}
	
	int x, y;

	{   // initialization block
		
		System.out.println(" Instance Init: x = "  + x + ", y = " + y);
		
		x = 10;
		
	}
	
//	y = 20;  WRONG PLACE!
	
}
