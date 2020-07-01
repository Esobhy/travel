package com.phptravels.testutils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;


public class Weblistiner implements WebDriverEventListener{

	@Override
	public void afterNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("will Navigated to:'"+url+ "' ");
	}
	
	@Override
	public void beforeNavigateTo(String url, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Before Navigated to:'"+url+ "' ");
	}
	
	
	public void beforeChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("value of :" +element.toString() +"befor any change");
	}
	
	

	public void afterChangeValueOf(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("value of :" +element.toString() +"After change");

	}
	
	
	public void beforeClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("Tring to click on  :" +element.toString() );
	}
	
	@Override
	public void afterClickOn(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("clicked  on  :" +element.toString() );
	}
	

	@Override
	public void beforeNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("navigated back to previous bage" );
	
	}
	@Override
	public void afterNavigateBack(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("navigated back to previous bage" );
	}
	
	@Override
	public void beforeNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("navigated forward  to next bage" );
	}
	
	@Override
	public void afterNavigateForward(WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("navigated forward  to next bage" );
	}
	
	@Override
	public void onException(Throwable error, WebDriver driver) {
		// TODO Auto-generated method stub
		System.out.println("exeption accure " );
	}
	@Override
	public void beforeFindBy(By by, WebElement element, WebDriver drive) {
		// TODO Auto-generated method stub
		System.out.println("tring to fined element by :"+by.toString() );
	}

	@Override
	public void afterFindBy(By by, WebElement element, WebDriver drive) {
		// TODO Auto-generated method stub
		System.out.println("Found element by :"+by.toString() );
	}
	
	
	
	
	
	
	//  not used 
	
	
	
	
	
	@Override
	public void afterAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public <X> void afterGetScreenshotAs(OutputType<X> arg0, X arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterGetText(WebElement arg0, WebDriver arg1, String arg2) {
		// TODO Auto-generated method stub
		
	}

	



	@Override
	public void afterNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertAccept(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeAlertDismiss(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <X> void beforeGetScreenshotAs(OutputType<X> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeGetText(WebElement element, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}


	

	@Override
	public void beforeNavigateRefresh(WebDriver arg0) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void beforeSwitchToWindow(String arg0, WebDriver arg1) {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1, CharSequence[] arg2) {
		// TODO Auto-generated method stub
		
	}

	
	
}
