package com.nopcommerce.testCases;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.util.Utility;

public class NewTest extends TestBase {
	
	HomePage home;
	RegisterPage register;
  @Test
  public void f() throws InvalidFormatException, IOException {
	  home.clickOnRegisterButton();
	  register.enterGenderFirstLastName(Utility.readExcel(0, 1), Utility.readExcel(1, 1), Utility.readExcel(2, 1));
  }
  @BeforeMethod
  public void beforeMethod() {
	  initialize();
	  home=new HomePage();
	  register=new RegisterPage();
	  
  }

  @AfterMethod
  public void afterMethod() {
  }

}
