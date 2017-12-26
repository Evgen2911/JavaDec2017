package lesson171226;

import java.util.Arrays;

public class ArrayExample1 {
	
	public static void main(String[] args) {
		
		int a[] = {0, 1, 2, 3};
		
		System.out.println(a);
		
		String[] dishes = {"steak", "fish", "apple"};
		
		System.out.println(dishes);
		System.out.println(dishes.length);
		
		System.out.println(Arrays.toString(dishes));
		System.out.println(Arrays.toString(a));
		
		print1(a);
		System.out.println();
		print2(a);
		System.out.println();
		print3(a);
	}

	private static void print1(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}

	private static void print2(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
	
	private static void print3(int[] a) {
		int i = 0;
		while (i < a.length) {
			System.out.println(a[i]);
			i++;
		}
	}
	
}
