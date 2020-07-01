package com.phptravels.testcases;

import java.io.IOException;
import java.lang.reflect.Method;
import java.text.ParseException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.Assert;
import com.phptravels.Testpages.Featured_pages;
import com.phptravels.testbase.Testbase;
import com.phptravels.testutils.Testutils;

import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Featured_tours extends Testbase {

	public Featured_tours() throws IOException {
		super();
	
	}
	Featured_pages featur =new Featured_pages();
	
    @Parameters ("Browser")
	@BeforeMethod
	public void login(String Browser,Method method) throws ATUTestRecorderException {
		Testutils.record(method.getName());
 		Testutils.record_vidio.start();
		initial(Browser);
	}
	
    @Test
	 public void featur_offer() throws InterruptedException, ParseException  {

        featur.Check_offer();
		System.out.println("the minimum flight is  to " + featur.Min_Flight());
		Assert.assertTrue(true);   			
	 }
	 
	 @AfterMethod
	 public void testdown() throws ATUTestRecorderException {
     featur.Quit();	   
     Testutils.record_vidio.stop();
		 
	 }

	
}
