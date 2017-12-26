package lesson171226;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample2 {
	
	public static void main(String[] args) {
		
		int[] data = generate(10);
		
		System.out.println(Arrays.toString(data));
		
	}

	private static int[] generate(int capacity) {
		int[] d = new int[capacity];
		
		Random r = new Random();
		
		for (int i = 0; i < d.length; i++) {
			d[i] = r.nextInt(d.length);
		}
		
		return d;
		
	}

}
