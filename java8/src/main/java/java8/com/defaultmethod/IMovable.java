package java8.com.defaultmethod;

public interface IMovable {

	public void move();
	
	default int wheels() {
		System.out.println("4 wheels");
		return 4;
	}
}
