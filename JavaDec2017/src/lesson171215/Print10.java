package lesson171215;

public class Print10 {

	public static final int MY_MAGIC_NUMBER = 10;

	public static void main(String[] args) {

		// printNumbers(MY_MAGIC_NUMBER);
		// printNumbers(20);
		// printNumbers(1);
		printNumbers(0);

	}

	public static void printNumbers(int max) {
		if (max <= 0) { // guard condition
			System.err.println("Wrong parameter: should be greater than 0 " + max);
			return;
		}
		if (max >= 50) {
			System.err.println("Wrong parameter: should be less than 50 " + max);
			return;
		}

		for (int i = 1; i <= max; i++) {
			System.out.println(i);
		}
	}

}
