package java8.com.lamda;

public class CalculateDemo {

	public AdditionInterface additionInterface;
	
	int a,b;
	
	public CalculateDemo(int a , int b) {
		this.a=a;
		this.b=b;
	}
	
	public CalculateDemo(AdditionInterface additionInterface) {
		
		System.out.println(additionInterface.add(this.a, this.b));
	}
}
