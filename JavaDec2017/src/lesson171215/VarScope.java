package lesson171215;

public class VarScope {
	
	static int i;

	public static void main(String[] args) {
		
		int i = 10;
		
		{
			int k = 20;
			System.out.println(i);
			System.out.println(VarScope.i);
//			int i = 30;
		}
		
//		System.out.println(k);
		
		
	}
	
}
