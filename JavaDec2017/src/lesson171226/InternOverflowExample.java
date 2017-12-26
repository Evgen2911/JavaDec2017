package lesson171226;

import java.util.Random;

public class InternOverflowExample {

	private static final int MAX = 2000;

	public static void main(String[] args) {

		// for (int i = 0; i < 26; i++) {
		// System.out.println((char)('a' + i));
		// }
		
//		String s1 = "hello";
//		
//		String s2 = new String(s1);
//		
//		String intern = s2.intern();

		Random r = new Random();
		
		long count = 0;

		while (count < 1_000_000) {
			
			if (count++ % 100000 == 0) {
				System.out.println(count);
			}
			
			
			StringBuilder sb = new StringBuilder();

			for (int i = 0; i < MAX; i++) {
				sb.append((char) ('a' + r.nextInt(26)));
			}

			String result = sb.toString();
			result.intern();
//			System.out.println(result);
		}
	}

}
