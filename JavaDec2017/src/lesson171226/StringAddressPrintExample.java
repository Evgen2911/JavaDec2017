package lesson171226;

public class StringAddressPrintExample {

	// actually, not address, but hashCode!

	public static void main(String[] args) {

		Object o = new Object();

		System.out.println(o);

		printStringAddressLikeInObject("hello");
		
		String s = new String("hello");
		
		System.out.println(s == "hello");
		
		printStringAddressLikeInObject(s);

	}

	private static void printStringAddressLikeInObject(String string) {
		String address = string.getClass().getName() + "@"
				+ Integer.toHexString(string.hashCode());
		System.out.println(address);
	}

}
