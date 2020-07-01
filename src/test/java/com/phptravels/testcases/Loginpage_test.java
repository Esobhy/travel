package com.phptravels.testcases;
import java.io.IOException;
import java.lang.reflect.Method;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.phptravels.Testpages.Login_pages;
import com.phptravels.testbase.Testbase;
import com.phptravels.testutils.Testutils;
import atu.testrecorder.exceptions.ATUTestRecorderException;
public class Loginpage_test extends Testbase{

	public Loginpage_test() throws IOException {
		super();
	
	}
	Login_pages log = new Login_pages();
	
	
	    @Parameters ("Browser")
		@BeforeMethod
		public void login(String Browser,Method method) throws ATUTestRecorderException {
			Testutils.record(method.getName());
	 		Testutils.record_vidio.start();
			initial(Browser);

		}
	 
	 @Test
	 public void login() throws InterruptedException  {

		    log.login_list();
		    log.click_login();
		    log.Perform_login();
 	     	String Actual_result =log.get_username();
 	     	System.out.println("user name is " +Actual_result);
 	     	String Expected_result =DATA.getProperty("username");
 	     	Assert.assertEquals(Actual_result, Expected_result,"element is not exact");
 	     			
	 }
	 
	 @AfterMethod
	 public void testdown() throws ATUTestRecorderException {
		 log.Quit();
	    Testutils.record_vidio.stop();

		 
	 }

}
