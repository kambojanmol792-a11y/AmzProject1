package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class Basetest extends ListenerLogic
{
	public static WebDriver driver;
	@Parameters("Browser")
	
	@BeforeMethod
	
	
	public void BrowserLaunch(@Optional ("chrome")String nameofBrowser) 
	{
		if(nameofBrowser.equalsIgnoreCase("Chrome"))
		{
			ChromeOptions option = new ChromeOptions();
			option.addArguments("incognito");
			driver = new ChromeDriver(option);
			
		}
		
		if(nameofBrowser.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
			
		}
		
		if(nameofBrowser.equalsIgnoreCase("FireFox"))
		{
			driver = new FirefoxDriver();
			
		}
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		
	}
	
	@AfterMethod
	
	public void BrowserQuit() 
	{
		driver.quit();
	}
}

