package package1.project1_maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home_Page 
{
	
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//Step1
	
	@FindBy(xpath = "//div[@class=\"nav-line-1-container\"]/following-sibling::span ")
	private WebElement accountandList;
	
	@FindBy(xpath = "//span[text()='Sign in']")
	private WebElement signIn;
	
	@FindBy(xpath = "//a[@id=\"nav-item-signout\"]/child::span")
	private WebElement signOut;
	
	// step2
	
	public void HoverOverAccountAndList(WebDriver driver)
	{
		wait.until(ExpectedConditions.visibilityOf(accountandList));
		Actions a1 = new Actions(driver);
		a1.moveToElement(accountandList).perform();
	}
	
	public void ClickOnSignIn()
	{
		signIn.click();
	}
	
	public void sign_Out()
	{
		signOut.click();
	}
	
	//Step3
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	

}
