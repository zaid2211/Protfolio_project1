package com.nopcommerce.util;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.nopcommerce.base.TestBase;

public class Utility extends TestBase {

	public static void takeScreenshot() {
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\jaids\\eclipse-git\\Protfolio_project1\\"
				+ "ScreenShots"+System.currentTimeMillis()+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	

	public static  void hold() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	public static String readExcel(int rowNum,int cellNum) throws  IOException, InvalidFormatException {
		File file =new File("C:\\Users\\jaids\\eclipse-git\\Protfolio_project1\\src\\test\\java\\com\\nopcommerce\\testData\\TestData.xlsx");
		
		
			Workbook wb = WorkbookFactory.create(file);
			Sheet sheet = wb.getSheet("Sheet1");
			Row row=sheet.getRow(rowNum);
			Cell cell=row.getCell(cellNum);
			String value=cell.getStringCellValue();
			return value;
		
			
		
		
	}
	
}
