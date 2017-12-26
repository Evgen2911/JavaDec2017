package lesson171226;

public class ComparePersonsExample {
	
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.age = 30;
		p1.height = 180;
		p1.weight = 90;
		
		Person p2 = new Person();
		p2.age = 30;
		p2.height = 180;
		p2.weight = 90;
		
		System.out.println(p1.equals(p2));
		
	}

}
