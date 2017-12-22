package lesson171222;

public class SystemGCdemo {
	
	public static void main(String[] args) {
		
		System.out.println("start");
		
		for (int i = 0; i < 1_000; i++) {
			new C();
		}
		
		System.out.println("pause");
		
		Utils.pause(100000);
		
		System.gc();
		
	}

}


class C {
}