package lesson171222;

public class ObjectInitWIthInheritance {
	
	public static void main(String[] args) {
		
		BB bb = new BB();
		BB bb2 = new BB();
		
		new B();
		
	}

}


class B {
	
	static {
		System.out.println("static B");
	}
	
	{
		System.out.println("init B");
	}
	
	B() {
		System.out.println("cons B");
	}
	
	
}

class BB extends B{
	
	static {
		System.out.println("static BB");
	}
	
	{
		System.out.println("init BB");
	}
	
	BB() {
		super();
		System.out.println("cons BB");
	}
	
}
