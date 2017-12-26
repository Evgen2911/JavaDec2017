package lesson171226;

public class SwitchStringExample {
	
	public static void main(String[] args) {
		
		if (args.length == 0) {
			System.out.println("Usage: say something");
			System.exit(0);
		}
		
		switch (args[0]) {
		case "hello":
			System.out.println("hi there");
			break;

		case "привет!":
			System.out.println("и тебе здорово");
			break;
			
		default:
			System.out.println("здороваться надо!");
			break;
		}
		
	}

}
