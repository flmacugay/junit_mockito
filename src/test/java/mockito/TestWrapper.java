package mockito;

public class TestWrapper {
	
	WebService service;
	
	public TestWrapper(WebService service) {
		this.service = service;
	}

	public int calculate(int a, int b) {
		System.out.println("wrapper >>> "+service.getClass().getName());
		int i=service.calculate(a, b);
		System.out.println("wrapper end");
		return i;
	}
	
	public WebService getWebService() {
		return service;
	}

}
