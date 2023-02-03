package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.util.Utility;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class RegisterPageTest extends TestBase{
	
	HomePage home;
	RegisterPage register;
	
	
	
  @Test (priority=1)
  public void registerPageTitleTest() {
	String title=  register.title();
	  Assert.assertEquals(title,"nopCommerce demo store. Register",
			  "Register page title does not matched");
	  
  }
  
  @Test (priority=2)
  public void registerPageLogo() {
	  boolean value=register.logo();
	  Assert.assertTrue(value,"Register page logo is not visible");
	  
  }
  
  @Test (priority=3)
  public void register() throws InvalidFormatException, IOException {
	register.enterGenderFirstLastName(Utility.readExcel(0, 1), Utility.readExcel(1, 1), 
			Utility.readExcel(2, 1));
	Reporter.log("Gender, First name, Last name entered",true);
	
	
	register.enterDob(Utility.readExcel(3, 1), Utility.readExcel(3, 2), 
			Utility.readExcel(3, 3));
	  Reporter.log("Date of birth Entered",true);
  
  
	 register.enterEmailPass(Utility.readExcel(4, 1), Utility.readExcel(5, 1));
	 Reporter.log("Email and password entered",true);
	 
	 register.clickOnRegisterBut();
	 Reporter.log("Register button clicked",true);
  }
  
  @Test (priority = 4, dependsOnMethods = "register")
  public void verifyRegistration() {
	String msz=  register.verifyRegistrationMessage();
	
	Assert.assertEquals(msz,"Your registration completed","Registration failed");
  }
  
  
  
  @BeforeClass
  public void beforeClass() {
	  initialize();
	  home=new HomePage();
	register=  home.clickOnRegisterButton();
	  
	  
  }

  @AfterClass
  public void afterClass() {
  }

}
