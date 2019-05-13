import java.util.ArrayList;
import java.util.List;

public class TestResult {
	public static void main(String[] args) {
		List<Person> listpeople = new ArrayList<Person>();
		listpeople.add(new Person(1, "Quách Duy Quang", 24, "298 Kim Ngýu"));
		
		for (Person person : listpeople) {
			System.out.println(person);
			System.out.println();
		}
	}
}
