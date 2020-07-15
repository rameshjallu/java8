package java8.com.optional;

import java.util.Optional;

public class EmployeeWithOptional {

	public String name;
	public Optional<Car> carOpt;
	
	
	public EmployeeWithOptional(String name, Optional<Car> carOpt) {
		super();
		this.name = name;
		this.carOpt = carOpt;
	}
	
	
	
}
