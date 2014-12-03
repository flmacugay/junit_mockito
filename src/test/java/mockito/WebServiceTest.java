package mockito;

import static org.junit.Assert.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.doReturn;


import org.junit.Before;
import org.junit.Test;

public class WebServiceTest {
	
	//TestWrapper wrapper;

	@Before
	public void setUp() throws Exception {
/*		WebService aService=mock(WebService.class);
		wrapper=new TestWrapper(aService);
		when(aService.invoke("add", 1, 2)).thenReturn(5);*/
	}

	@Test
	public void testCalculate() {
		//assertEquals(5, wrapper.calculate(1, 2));
		//assertEquals(5, wrapper.getWebService().calculate(1, 2));
		
		/*public abstract class MyAbstract {
			  public String concrete() {
			    return abstractMethod();
			  }
			  public abstract String abstractMethod();
			}

			public class MyAbstractImpl extends MyAbstract {
			  public String abstractMethod() {
			    return null;
			  }
			}

			// your test code below

			MyAbstractImpl abstractImpl = spy(new MyAbstractImpl());
			doReturn("Blah").when(abstractImpl).abstractMethod();
			assertTrue("Blah".equals(abstractImpl.concrete()));*/
		
		
		WebService service=spy(new WebService());
		doReturn(5).when(service).invoke("add", 1, 2);
		assertEquals(5, service.calculate(1, 2));
	}

}
