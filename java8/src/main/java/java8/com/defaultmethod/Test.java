package java8.com.defaultmethod;

public class Test {

	public static void main(String[] args) {
		
		Car car=new Car();
		Auto auto=new Auto();
		
		car.move();
		car.clean();
		car.wheels();
		
		
		
		System.out.println();
		auto.move();
		auto.clean();
		auto.wheels();
		
		
		
	}
}
