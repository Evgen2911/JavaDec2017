package lesson171211;

public class Example1 {
	
	public static void main(String[] args) {
		
		String s = new String();
		
		System.out.println(s.length());
	
		A a = new A() {
			@Override
			public String toString() {
				// TODO Auto-generated method stub
				return "hoho";
			}
		};
		
		process(a);
		
		
	}

	public static void process(A a) {
		System.out.println(a.toString());
	}

}



class A extends Object {
	
	@Override
	public String toString() {
		return "haha";
	}
}