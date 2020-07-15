package java8.com.optional;

import java.util.Optional;

public class TestOptional {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("emp1", null);
		Employee emp2=new Employee("emp1", new Car("car1"));
		
		
		//System.out.println(emp2.car.name);
		//System.out.println(emp1.car.name);
		
		
		//EmployeeWithOptional emp3=new EmployeeWithOptional("emp", Optional.of(null));
		
		Optional<String> opt=Optional.ofNullable(null);
		
		System.out.println(opt.isPresent());
	}
}
