package java8.com.lamda;

public class Test {
	
	public static void main(String[] args) {
		
		AdditionInterfaceImpl additionInterfaceImpl=new AdditionInterfaceImpl();
		
		additionInterfaceImpl.add(2, 4);
		
		
		CalculateDemo calculateDemo=new CalculateDemo(additionInterfaceImpl);
		
		
	}

	
	

}
