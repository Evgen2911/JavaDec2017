package lesson171222;

import java.util.ArrayList;
import java.util.List;

public class DereferenceExample {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		for (int i = 0; i < 100; i++) {
			a.toString();
		}
		
		a = null;
		
		List<B> list = new ArrayList<>();
		
		for (int i = 0; i < 100; i++) {
			list.add(new B());
		}
		
		// ... do something with list
		
		list.clear();
		
		// do something else
		
	}

}
