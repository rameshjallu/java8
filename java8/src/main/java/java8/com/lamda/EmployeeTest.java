package java8.com.lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Set<Employee> empSet=new TreeSet<>((Employee e1,Employee e2)-> e2.name.length()-e1.age);
		
		for(int i=1;i<10;i++) {
			Employee e1=new Employee("emp"+i, 100-i,i);
			empSet.add(e1);
		}
		
		System.out.println(empSet);
	}
}
