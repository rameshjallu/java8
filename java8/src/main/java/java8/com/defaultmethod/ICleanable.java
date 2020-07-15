package java8.com.defaultmethod;

public interface ICleanable {

	public static final int i=0;
	
	public void clean();
	
	default int wheels() {
		System.out.println("3 wheels");
		return 3;
	}
	
	default int wheels1() {
		System.out.println("3 wheels");
		return 3;
	}
	
	
}
