package lesson171219;

public class ArgsProcessingDemo {
	
	public static void main(String[] args) {
		
//		System.out.println(args);
//		System.out.println(args.length);
		
		if (args.length == 0) {
			System.out.println("Usage: <MainClassName> <number_of_numbers>");
			System.exit(0);
		}
		
		int number_of_numbers = Integer.parseInt(args[0]);
		
		for (int i = 0; i < number_of_numbers; i++) {
			System.out.println(i);
		}
		
	}

}
