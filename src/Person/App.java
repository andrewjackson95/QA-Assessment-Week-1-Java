package Person;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		
		Person person1 = new Person ("Andrew",23,"Trainee");
		Person person2 = new Person ("Bob",50,"Electrician");
		Person person3 = new Person ("Tom",22,"Grape Picker");
		
		ArrayList<Person> people = new ArrayList<>();
		
		people.add(person1);
		people.add(person2);
		people.add(person3);
	    
		for (Person p : people) {
			if (p.getName().equals("Andrew")) {
				System.out.println(p);
			}
		}
	}
}
