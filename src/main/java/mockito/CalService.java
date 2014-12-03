package mockito;

public class CalService {
	
	private ICalculator cal;

	public CalService(ICalculator cal) {
		this.cal = cal;
	}

	public int addNumbers(int x, int y) {
		System.out.println("hello");
		reply();
		int result=cal.add(x, y);
		System.out.println("hi");
		return result;
	}
	
	public void reply() {
		System.out.println("im ok");
	}
	
	
}
