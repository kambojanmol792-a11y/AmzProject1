package package1.project1_maven;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Utility.ListenerLogic;
import Utility.Basetest;
import Utility.Retrylogic;
//@Listeners(ListenerLogic.class)
public class TC_2LoginToAmazonAndLogout extends Basetest 
{
	@Test(retryAnalyzer = Retrylogic.class)
	public void Loginlogout()
	{
		SoftAssert sa = new SoftAssert();
		
		Home_Page hp = new Home_Page(driver);
		hp.HoverOverAccountAndList(driver);
		hp.ClickOnSignIn();
		
		Login_Page lp = new Login_Page(driver);
		lp.EnteringUsername();
		lp.ContinueButton();
		lp.EnteringPassword();
		lp.ClickOnSignIn();
		
		sa.assertEquals(driver.getTitle(), "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in","Title not matched");
		sa.assertAll();
		
		
		hp.HoverOverAccountAndList(driver);
		hp.sign_Out();
		
	}
}
