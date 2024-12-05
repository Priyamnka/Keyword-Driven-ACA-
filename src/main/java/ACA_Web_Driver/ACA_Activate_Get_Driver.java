package ACA_Web_Driver;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ACA_Activate_Get_Driver {

	public static WebDriver driver;	
		
	public static WebDriver getdriver()
	{
	    if (driver == null)
	    {
//          System.setProperty("webdriver.chrome.driver","C:\\QA_Testing_Doc\\Keyword_Driven_Framework_For_ACA\\Keyword_Driven_Framework_For_ACA\\src\\test\\chromedriver.exe");
//	    	System.setProperty("webdriver.chrome.driver","C:\\Users\\Miriyala.Yamini\\Documents\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
//			WebDriverManager.chromedriver().setup();
//	    	WebDriver driver = new ChromeDriver();
//	    	driver = new ChromeDriver();
	    	
//	    	System.setProperty("webdriver.edge.driver", "C:\\Users\\Miriyala.Yamini\\Documents\\GitHub\\edgedriver_win64 (2)\\msedgedriver.exe");
            System.setProperty("webdriver.edge.driver", "C:\\Keyword_Driven_Framework_ACA\\edgedriver_win64 (2)\\msedgedriver.exe");
	    	driver = new EdgeDriver();
	    	
//	    	System.setProperty("webdriver.gecko.driver", "src/test/resources/geckodriver.exe");
//	        driver = new FirefoxDriver();
	        
	        driver.manage().window().maximize();
	    	
	      return driver;
	    }
	    else
	    {
	      return driver;
	    }
	 }
	
	
}
