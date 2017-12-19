package lesson171219;

public class FinalizeDemo2Savior {
	
	static E safe;
	
	public static void main(String[] args) {
		
		while (true) {
			new E();
		}
		
	}

}

class E {

	
	@Override
	protected void finalize() {
		FinalizeDemo2Savior.safe = this;
	}
	
}
