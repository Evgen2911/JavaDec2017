package lesson171222;

public class MyStackDemo {
	
	public static void main(String[] args) {
		
		Stack s = new Stack(100);
		
		for (int i = 0; i < 100; i++) {
			s.push(Integer.toBinaryString(i));
		}

		for (int i = 0; i < 100; i++) {
			System.out.println(s.pop());
		}
	}

}

class Stack {  // LIFO : Last In, First Out
	
	String[] items;
	int tos = 0;  // TOP OF STACK -> TOS

	public Stack(int capacity) {
		items = new String[capacity];
	}
	
	
	void push(String item) {
		items[tos++] = item;
	}
	
	String pop() {
		String result = items[--tos];
		items[tos] = null;
		return result;
	}
	
	
}
