package java8.com.defaultmethod;

public class Auto implements IMovable,ICleanable {

	@Override
	public void move() {
		System.out.println("Auto moving");

	}
	
	@Override
	public void clean() {
		System.out.println("Auto cleaning");
		
	}

	@Override
	public int wheels() {
		// TODO Auto-generated method stub
		return ICleanable.super.wheels();
	}
	

}
