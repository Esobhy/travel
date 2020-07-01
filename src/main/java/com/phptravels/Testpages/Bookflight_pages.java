package com.phptravels.Testpages;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.phptravels.testbase.Testbase;

public class Bookflight_pages  extends Testbase  {

	public Bookflight_pages() throws IOException {
		PageFactory.initElements(driver, this);
		
	}
    //flight tab web Element
	private By FLIGHT = By.xpath("//a[contains(@class,'text-center flights')]");
	
    //From  web Element
	private By From = By.xpath("(//*[@class='select2-chosen'])[2]");
	private By type_From = By.xpath("(//*[@class='form-control select2-offscreen'])[1]");
	private By select_match_From = By.xpath("/html[1]/body[1]/div[6]/ul[1]");
	private By lable_from = By.tagName("li");
	List <WebElement> lab_from ;

    //To  web Element
	private By To = By.xpath("(//*[@class='select2-chosen'])[3]");
	private By type_To = By.xpath("(//*[@class='form-control select2-offscreen'])[2]");
	private By select_match_To = By.xpath("/html[1]/body[1]/div[7]/ul[1]");
	private By lable_to = By.tagName("li");
	List <WebElement> lab_to ;

    //Depart web Element
	private By Depart = By.xpath("//input[contains(@placeholder,'Depart')]");

    //Submit web Element
	private By submit = By.xpath("//*[@class='col-xs-12 col-md-12']");

	//first flight web Element
	private By select_flighi = By.xpath("(//*[@class='btn btn-primary btn-block theme-search-results-item-price-btn'])[1]");

	
	 //Expected data web Element
		private By ExPrice = By.xpath("(//*[@class='absolute-right'])[1]");
		private By Expfrom = By.xpath("(//*[@class='theme-search-results-item-flight-section-meta-time'])[1]");
		private By ExpDestnation = By.xpath("(//*[@class='theme-search-results-item-flight-section-meta-time'])[2]");


	
	public void flight_tap() throws InterruptedException {
		Thread.sleep(1000);
        driver.findElement(FLIGHT).click();
	}
	
	public void Set_From() throws InterruptedException {
		Thread.sleep(1000);
        driver.findElement(From).click();
		Thread.sleep(1000);
        driver.findElement(type_From).sendKeys(DATA.getProperty("From"));
		Thread.sleep(1000);
		lab_from =	(driver.findElement(select_match_From)).findElements(lable_from);
		Thread.sleep(1000);
		lab_from.get(0).click();
	


	}
	
	public void Set_To() throws InterruptedException {
		Thread.sleep(1000);
        driver.findElement(To).click();
		Thread.sleep(1000);
        driver.findElement(type_To).sendKeys(DATA.getProperty("To"));
		Thread.sleep(1000);
		lab_to =	(driver.findElement(select_match_To)).findElements(lable_to);
		Thread.sleep(1000);
		lab_to.get(0).click();
		


	}
	
	public void Set_date() throws InterruptedException {
		Thread.sleep(1000);
        driver.findElement(Depart);
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].setAttribute('value','"+ DATA.getProperty("date")+"');",driver.findElement(Depart));
		
	}
	
	public void Submit() throws InterruptedException {
		Thread.sleep(1000);
        driver.findElement(submit).click();
		

	}
	
	public void select_flighi() throws InterruptedException {
		Thread.sleep(1000);
        driver.findElement(select_flighi).click();
		


	}
	
	public String actual_price() throws InterruptedException {
		Thread.sleep(1000);
		return   driver.findElement(ExPrice).getText();
			
	}
	public String actual_From() throws InterruptedException {
		Thread.sleep(1000);
      return   driver.findElement(Expfrom).getText();	
	}
	public String actual_Destination() throws InterruptedException {
		Thread.sleep(1000);
      return   driver.findElement(ExpDestnation).getText();	
	}
	
	
	public void Quit() {
		driver.quit();
	}
	
}
