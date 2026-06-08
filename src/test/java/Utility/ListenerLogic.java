package Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerLogic implements ITestListener
{
//	public static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		Date d1 = new Date();
		System.out.println(d1.getTime());
		
		Date d2 = new Date(d1.getTime()*1000*60*60*24*1l);
		System.out.println(d2);
		
		String format1 = d2.toString();
		System.out.println(format1);
		
		String date = format1.substring(8, 10);
		String month = format1.substring(4, 7);
		String day = format1.substring(0, 3);
		String time = format1.substring(11, 19).replace(":", "_");
		
		String format2 = date.concat(month).concat(day).concat(time);
		System.out.println(format2);
		
		TakesScreenshot ts =  (TakesScreenshot) Basetest.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
//		File destination = new File("C:\\Users\\anmol\\eclipse-workspace\\project1_maven\\test-output\\Screenshots\\Pass\\" + result.getName()+ format2 + ".png");
		File destination = new File("C:\\Users\\anmol\\eclipse-workspace\\project1_maven\\test-output\\Screenshots\\Pass\\" + result.getName()+ format2 + ".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		// TODO Auto-generated method stub
				ITestListener.super.onTestSuccess(result);
				
				Date d1 = new Date();
				System.out.println(d1.getTime());
				
				Date d2 = new Date(d1.getTime()*1000*60*60*24*1l);
				System.out.println(d2);
				
				String format1 = d2.toString();
				System.out.println(format1);
				
				String date = format1.substring(8, 10);
				String month = format1.substring(4, 7);
				String day = format1.substring(0, 3);
				String time = format1.substring(11, 19).replace(":", "_");
				
				String format2 = date.concat(month).concat(day).concat(time);
				System.out.println(format2);
				
				TakesScreenshot ts =  (TakesScreenshot) Basetest.driver;
				File source = ts.getScreenshotAs(OutputType.FILE);
//				File destination = new File("C:\\Users\\anmol\\eclipse-workspace\\project1_maven\\test-output\\Screenshots\\Pass\\" + result.getName()+ format2 + ".png");
				File destination = new File("C:\\Users\\anmol\\eclipse-workspace\\project1_maven\\test-output\\Screenshots\\Failed\\" + result.getName()+ format2 + ".png");
				
				try {
					FileHandler.copy(source, destination);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	
	
}
