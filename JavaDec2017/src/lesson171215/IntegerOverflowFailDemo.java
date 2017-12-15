package lesson171215;

public class IntegerOverflowFailDemo {

	public static void main(String[] args) {
		
		int i = 0;
		while (true) {
			if (i++ % 1_000_000_000 == 0) {
				System.out.println(i);
			}
		}
		
	}
	
}
