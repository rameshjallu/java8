package java8.com.lamda;

public class Employee {

	public String name;
	public int id;
	public int age;
	public Employee(String name, int id, int age) {
		super();
		this.name = name;
		this.id = id;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", age=" + age + "]";
	}
	
	
	
	
}
