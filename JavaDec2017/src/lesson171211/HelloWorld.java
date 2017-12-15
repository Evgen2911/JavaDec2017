package lesson171211;

import java.io.PrintStream;

public class HelloWorld {

	public static void main(String[] args) {
		PrintStream out = System.out;
		
		String string = "Hello, world!";
		
//		out.println(string);
		out.println(string.toString());
		
		System.out.println(new A().toString());
		
		Class<System> c = System.class;
	}
	
}
