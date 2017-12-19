package lesson171219;

import java.util.ArrayList;
import java.util.List;

public class GCDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		List<List<C>> global = new ArrayList<>();
		
		while (true) {
			global.add(generate());
			Thread.sleep(5000);
		}
		
		
	}

	private static List<C> generate() {
		List<C> list = new ArrayList<C>();
		for (int i = 0; i < 1_000; i++) {
			list.add(new C());
		}
		return list;
	}

}


class C {
	int[] data = new int[1_000];
}
