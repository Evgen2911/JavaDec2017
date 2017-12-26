package lesson171226;

public class SwitchExample {
	
	public static void main(String[] args) {
		
		int age = 30;
		
		checkTeen(age);
		checkTeen(12);
		checkTeen(15);
		
	}

	private static void checkTeen(int age) {
		switch (age) {
		case 12:
			break;
		case 13:
		case 14:
		case 15:
		case 16:
		case 17:
		case 18:
		case 19:
			System.out.println("teen");
			break;

		default:
			System.out.println("child or adult");
			break;
		}
		
	}

}
