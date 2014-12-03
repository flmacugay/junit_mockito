package mockito;

public class WebService extends AbstractService {

	public int calculate(int a, int b) {
		System.out.println("from calc method...");
		int i=invoke("add",a, b);
		return i;
	}
	
	@Override
	protected void display() {
		System.out.println("message from web service");
	}

}
