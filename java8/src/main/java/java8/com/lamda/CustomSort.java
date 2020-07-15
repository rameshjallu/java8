package java8.com.lamda;

import java.util.Comparator;

public class CustomSort implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.age-o2.age;
	}
	
}
