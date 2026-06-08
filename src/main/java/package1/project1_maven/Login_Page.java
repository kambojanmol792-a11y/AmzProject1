package package1.project1_maven;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login_Page
{
	
	WebDriver driver;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	//Step1
	
	@FindBy(name = "email")
	private WebElement username;
	
	@FindBy(id = "continue")
	private WebElement continueButton;
	
	@FindBy(id = "ap_password")
	private WebElement password;
	
	@FindBy(id = "signInSubmit")
	private WebElement signIn;
	
	// step2
	
	public void EnteringUsername()
	{
		wait.until(ExpectedConditions.visibilityOf(username));
		username.sendKeys("kambojanmol792@gmail.com");
	}
	
	
	
	public void ContinueButton()
	{
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
	}
	
	public void EnteringPassword()
	{
		wait.until(ExpectedConditions.visibilityOf(password));
		password.sendKeys("AK@1996feb13");
	}
	
	public void ClickOnSignIn()
	{
		wait.until(ExpectedConditions.elementToBeClickable(signIn));
		signIn.click();
	}
	
	//Step3
	
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
