package mockito;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class SplitTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String string="2014-04-29T13:15:54";
		
		String[] a = string.split("A");
		

		for(String string2 : a) {
			System.out.println(string2);
		}
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println("parsed date > " + sdf.parse("2010-03-29AAAAAAAAAA"));
		
		
		
	      //floating point calculation
	      double amount1 = 2.15;
	      double amount2 = 1.10;
	      System.out.println("difference between 2.15 and 1.0 using double is: " + (amount1 - amount2));
	    
	      //Use BigDecimal for financial calculation
	      BigDecimal amount3 = new BigDecimal("2.15");
	      BigDecimal amount4 = new BigDecimal("1.10") ;
	      System.out.println("difference between 2.15 and 1.0 using BigDecimal is: " + (amount3.subtract(amount4)));      


		
	}

}
