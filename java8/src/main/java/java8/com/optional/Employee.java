package java8.com.optional;

public class Employee {

	public String name;
	public Car car;
	
	
	public Employee(String name, Car car) {
		super();
		this.name = name;
		this.car = car;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	
	
}
