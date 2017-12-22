package lesson171222;

public class TernaryOperatorDemo2 {
	
	static int currentValue;
	
	public static void main(String[] args) {
		
		a(20);
		
	}

	private static int a(int x) {
		if (x < 10) {
			return x + currentValue;
		} else {
			return x/2;
		}
	}

}
