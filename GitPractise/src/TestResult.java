import java.util.ArrayList;
import java.util.List;

public class TestResult {
	public static void main(String[] args) {
		List<Person> listpeople = new ArrayList<Person>();
		List<Animal> listanimals = new ArrayList<Animal>();
		listpeople.add(new Person(1, "Qu�ch Duy Quang", 24, "298 Kim Ng�u", "abc.jpg", "25000"));

		for (Person person : listpeople) {
			System.out.println(person);
			System.out.println();
		}

		listanimals.add(new Animal(1, "con bò"));

		for (Animal animal : listanimals) {
			System.out.println(animal);
			System.out.println();
		}
	}
}
