package lesson171215;

public class FieldScopeDemo {

	static {
//		System.out.println(k);  ERROR!
	}
	
	public static void main(String[] args) {
		
		System.out.println(k);
	}

	static int k;
}
