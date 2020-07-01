package com.phptravels.Testpages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.testbase.Testbase;

public class Featured_pages extends Testbase{

	public Featured_pages() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
	private By featured_offer = By.xpath("//div[@class='content-bottom mt-auto']");
	private By price = By.xpath("//*[@class='text-secondary']");
	List <WebElement> offer_price;
	private By min = By.xpath("//*[@class='d-flex']");
	List <WebElement> min_flight;
	private int min_flight_index = 0;
	


	public void Check_offer() throws InterruptedException {
		Thread.sleep(1000);
        driver.findElement(featured_offer).click();
	}
	
	public String Min_Flight() {
    offer_price= driver.findElements(price);
    min_flight=driver.findElements(min);
	int min_price=Integer.parseInt(offer_price.get(0).getText().substring(1).replace(",", ""));
	
	for(int i=1 ;i<offer_price.size();i++)
	{	
		
		  if(min_price>Integer.parseInt((offer_price.get(i).getText().substring(1).replace(",", ""))))
			{
			min_price=Integer.parseInt((offer_price.get(i).getText().substring(1).replace(",", "")));
			min_flight_index=i;
			}
	}
	return min_flight.get(min_flight_index).getText();
	}

	public void Quit() {
		driver.quit();
	}
}
