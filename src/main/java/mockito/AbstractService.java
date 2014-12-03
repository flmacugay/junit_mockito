package mockito;

public abstract class AbstractService {
	
	
	public int invoke(String method, int a, int b) {
		System.out.println("inside invoke method");
		display();
		return a+b;
	}
	
	protected abstract void display();

}
