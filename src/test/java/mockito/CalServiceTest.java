package mockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalServiceTest {
	
	CalService calService;
	
	@Before
	public void setUp() throws Exception {
		ICalculator calculator=mock(ICalculator.class);
		when(calculator.add(3, 3)).thenReturn(6);
		when(calculator.add(3, 4)).thenReturn(7);
		calService=new CalService(calculator);
	}

	@Test
	public void testAddNumbers() {
		Assert.assertEquals(7, calService.addNumbers(3, 4));
	}

}
