package lesson171215;

public class DataTypes {
	
	public static void main(String[] args) {
		
		int i; // 32 bit = 4 byte
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		i = 0b1;
		i = 01;
		i = 0x1;
		i = 1;
		
		intTypesDemo();
		
		
	}

	private static void intTypesDemo() {
		byte b;  // 8
		short s; // 16
		char c;  // 16
		int i;  // 32
		long l;  // 64
	}

}
