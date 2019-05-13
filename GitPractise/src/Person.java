
public class Person {
	public int id;
	public String name;
	public int age;
	public String address;
	public String image;
	public String money;

	public Person(int id, String name, int age, String address, String image, String money) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.address = address;
		this.image = image;
		this.money = money;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", address=" + address + ", image=" + image
				+ ", money=" + money + "]";
	}


}
