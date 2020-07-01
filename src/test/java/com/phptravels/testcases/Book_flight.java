package com.phptravels.testcases;
import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.phptravels.Testpages.Bookflight_pages;
import com.phptravels.testbase.Testbase;
import com.phptravels.testutils.Testutils;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Book_flight extends Testbase{
	
	public Book_flight() throws IOException {
		super();
	
	}
	SoftAssert Assert =new SoftAssert();
	 Bookflight_pages bookflight =new Bookflight_pages();
	 
	    @Parameters ("Browser")
		@BeforeMethod
		public void login(String Browser,Method method) throws ATUTestRecorderException {
			Testutils.record(method.getName());
	 		Testutils.record_vidio.start();
			initial(Browser);
		}
	    
	    
	 
	 @Test
	 public void book_flight() throws InterruptedException  { 
		 bookflight.flight_tap();
		 bookflight.Set_From();
		 bookflight.Set_To();
		 bookflight.Set_date();
		 bookflight.Submit();
		 bookflight.select_flighi();
			

			String Actual_Price =bookflight.actual_price();
			String Actual_Destnation=bookflight.actual_Destination();
			String Actual_from=bookflight.actual_From();
			System.out.println("first flight to  " +Actual_Destnation+ "  From  "+ Actual_from +" will cost you  "+ Actual_Price );
			Assert.assertEquals(DATA.getProperty("EX_Price"),Actual_Price, "Wrong Flight");
			Assert.assertEquals(DATA.getProperty("EX_destination"),Actual_Destnation,  "Wrong Destination");
			Assert.assertEquals(DATA.getProperty("EX_from"),Actual_from , "Wrong Pick up");
			
			
	 }
	 
	 @AfterMethod
	 public void testdown() throws ATUTestRecorderException {
		bookflight.Quit();
	    Testutils.record_vidio.stop();

		 
	 }

	

}
