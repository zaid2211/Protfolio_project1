package com.nopcommerce.util;


import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Try {
	
	
	public static void main(String[] args) throws  IOException, InvalidFormatException {
		FileInputStream file =new FileInputStream("C:\\Users\\jaids\\eclipse-git\\Protfolio_project1\\src\\test\\java\\com\\nopcommerce\\testData\\TestData.xlsx");
		
		
		Workbook wb = WorkbookFactory.create(file);
		String value = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(value);
	}

}
