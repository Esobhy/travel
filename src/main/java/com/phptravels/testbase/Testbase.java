package com.phptravels.testbase;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import com.phptravels.testutils.Weblistiner;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {
	public static WebDriver driver ;
	public static Properties pro;
	public static Properties DATA;
	public static EventFiringWebDriver e_driver;
	public static Weblistiner   weblistner; 
	
	
	public Testbase () throws IOException {   //constractor of testbase  class
	pro =new Properties();
	FileInputStream prop_file =new FileInputStream ("C:\\Users\\NTG\\eclipse-workspace\\PHPTravelsTest\\PhptravelsTest\\src\\main\\java\\com\\phptravels\\testconfig\\configration.properties");
	pro.load(prop_file);
	
	DATA=new Properties();
	FileInputStream datafile=new FileInputStream("C:\\Users\\NTG\\eclipse-workspace\\PHPTravelsTest\\PhptravelsTest\\src\\main\\java\\com\\phptraveles\\testdata\\Data.properties");
	DATA.load(datafile);
	}
	
	
	
	public void initial(String Browser) {
		
		if (Browser.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver= new ChromeDriver();
		

		}
		
		else if (Browser.equalsIgnoreCase("ie"))
		{
			WebDriverManager.edgedriver().setup();
		    driver= new InternetExplorerDriver();
		 }
		
		
		else if (Browser.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			 driver= new FirefoxDriver();
		}
		
		 e_driver =new EventFiringWebDriver(driver);
		 weblistner =new Weblistiner();
		 e_driver.register(weblistner);
		driver=e_driver;
		driver.get(pro.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();	
	}
	
	

}
