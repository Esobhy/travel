package com.phptravels.Testpages;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import com.phptravels.testbase.Testbase;

public class Login_pages extends Testbase{

	public Login_pages() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	
	private By my_account_list = By.xpath("//div[@class='dropdown dropdown-login dropdown-tab']//a[@id='dropdownCurrency']");
	private By login_page = By.partialLinkText("Login");
	private By loginbutton = By.xpath("//button[@class='btn btn-primary btn-lg btn-block loginbtn']");
	private By Loginusername = By.name("username");
	private By loginpassword = By.name("password");
	private By usermane = By.xpath("(//*[@id='dropdownCurrency'])[2]");

	


	
	

	
	
	
	public void login_list() throws InterruptedException  {
		Thread.sleep(1000);
        driver.findElement(my_account_list).click();
	}
	
	public void click_login() throws InterruptedException  {
		Thread.sleep(1000);
        driver.findElement(login_page).click();
	}
	
	public void Perform_login() throws InterruptedException  {
		Thread.sleep(1000);
        driver.findElement(Loginusername).sendKeys(pro.getProperty("username"));
        driver.findElement(loginpassword).sendKeys(pro.getProperty("Password"));
        driver.findElement(loginbutton).click();
	}
	
	public String get_username() throws InterruptedException  {
		Thread.sleep(1000);
		return  driver.findElement(usermane).getText();
         
	}
	public void Quit() {
		driver.quit();
	}
	
}
