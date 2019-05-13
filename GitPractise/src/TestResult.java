import java.util.ArrayList;
import java.util.List;

public class TestResult {
	public static void main(String[] args) {
		List<Person> listpeople = new ArrayList<Person>();
		listpeople.add(new Person(1, "Qu�ch Duy Quang", 24, "298 Kim Ng�u", "abc.jpg", "25000"));

		for (Person person : listpeople) {
			System.out.println(person);
			System.out.println();
		}
	}
}
