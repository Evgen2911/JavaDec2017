package lesson171219;

public class RefTypeExample {
	
	public static void main(String[] args) {
		
		String s = "hello";  
		
		String s2 = new String("hello");
		
		String emptyString = "";
		
		String emptyString2 = new String();
		
		int length = s.length();
		
//		s += ", world";
		
//		String tmp = s + ", world";
		String tmp = s.concat(", world");
		s = tmp;
		
		s = s.concat(", world");
	}

}
