package mockito;

public class CalService {
	
	private ICalculator cal;

	public CalService(ICalculator cal) {
		this.cal = cal;
	}

	public int addNumbers(int x, int y) {
		return cal.add(x, y);
	}
	
}
