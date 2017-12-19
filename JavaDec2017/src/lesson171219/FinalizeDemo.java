package lesson171219;

public class FinalizeDemo {
	
	public static void main(String[] args) {
		
//		for (int i = 0; i < 100000; i++) {
//			new F();
//		}
		
		while (true) {
			new F();
		}
		
	}

}


class F {
	
	@Override
	protected void finalize() {
		System.out.println("hohoho");
	}
	
}