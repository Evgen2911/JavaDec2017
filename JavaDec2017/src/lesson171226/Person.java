package lesson171226;

public class Person {
	
	int age;
	int height;
	int weight;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Person) {
			Person p = (Person) obj;
			if (age != p.age)
				return false;
			if (height != p.height)
				return false;
			if (weight != p.weight)
				return false;
			return true;
		}
		return false;
	}

}
