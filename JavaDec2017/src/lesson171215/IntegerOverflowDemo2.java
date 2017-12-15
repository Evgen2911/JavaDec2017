package lesson171215;

public class IntegerOverflowDemo2 {
	
	public static void main(String[] args) {
		
		int i = Integer.MAX_VALUE;
		
		System.out.println(i);
		
		i++;
		
		System.out.println(i);
		
		char c = Character.MAX_VALUE;
		
		System.out.println((int)((char)(c + 1)));

		c++;
		System.out.println((int)c);
		c++;
		System.out.println((int)c);
		
		
	}

}
