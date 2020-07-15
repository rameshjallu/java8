package java8.com.defaultmethod;

public class Car implements IMovable,ICleanable {

	@Override
	public void move() {
		System.out.println("Car moving");

	}

	@Override
	public void clean() {
		System.out.println("Car cleaning");
		
	}

	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		return IMovable.super.wheels();
	}
	
	
	
}
