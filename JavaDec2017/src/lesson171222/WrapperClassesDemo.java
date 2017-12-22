package lesson171222;

import java.util.Hashtable;

public class WrapperClassesDemo {
	
	public static void main(String[] args) {
		
		Hashtable table = new Hashtable();
		
		table.put("Pete", "123-456-7890");
		table.put("John", "123-456-7899");
		
		table.put(23, "Иванов");  // Autoboxing
		table.put(new Integer(23), "Иванов");
		
		int x = new Integer(100).intValue();
		
		System.out.println(table.get("John"));
		
	}

}
