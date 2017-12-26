package lesson171226;

public class StringCompare {
	
	public static void main(String[] args) {
		
		String s1 = "hello";
		
		String s2 = "hello";
		
		String s3 = new String("hello");
		
		System.out.println(s1);
		System.out.println(s2);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		
		String s4 = s3.intern();

		System.out.println(s1 == s3);
		System.out.println(s1 == s4);
		
		System.out.println(s1.equals(s3));
	}

}
