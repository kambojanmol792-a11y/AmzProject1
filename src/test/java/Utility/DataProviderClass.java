package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class DataProviderClass 

{
	
	@DataProvider(name = "logindata")
	
	public Object data() throws EncryptedDocumentException, IOException, InvalidFormatException  
	{
		Object d1[][] = new Object[3][2];
		
		FileInputStream fs = new FileInputStream("C:\\\\Users\\\\anmol\\\\eclipse-workspace\\\\testing\\\\target\\\\Excel\\\\anmolTest.xlsx");
		Workbook wb = WorkbookFactory.create(fs);
		DataFormatter df = new  DataFormatter();
		
		for(int i = 0; i<3; i++) 
		{
			for(int j = 0; j <2 ; j++) 
			{
				d1[i][j] = df.formatCellValue( wb.getSheet("login").getRow(i).getCell(j));
			}
			
		}
		
		return d1;
		
		
	}
	
	

}
