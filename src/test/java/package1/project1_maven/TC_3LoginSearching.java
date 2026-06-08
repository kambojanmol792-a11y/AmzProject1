package package1.project1_maven;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Utility.ListenerLogic;
import Utility.Basetest;
import Utility.Retrylogic;
//@Listeners(ListenerLogic.class)
public class TC_3LoginSearching extends Basetest 
{
	@Test(retryAnalyzer = Retrylogic.class)
	
	public void loginsearch()
	{
		
	}
}
