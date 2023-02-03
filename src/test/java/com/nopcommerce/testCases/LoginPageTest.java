package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.LoginPage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.pages.ReturnedRegistrationPage;
import com.nopcommerce.util.Utility;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class LoginPageTest extends TestBase{
	HomePage home;
	LoginPage login;
	RegisterPage register;
	ReturnedRegistrationPage returnedPage;
	
	
  @Test (priority = 1)
  public void ValidateLoginPageTitle() {
	  
	String title=  login.validateLoginPageTitle();
	Assert.assertEquals(title,"nopcommerce demo store. Login");
	Reporter.log("Login Page title validated",true);
  }
  
  @Test (priority = 1)
  public void loginCreds() throws InvalidFormatException, IOException {
	  login.enterEmailAndPass(Utility.readExcel(4, 1), Utility.readExcel(4, 1));
	  login.clickLogin();
	  
  
  }
  
  @Test (priority = 2)
  public void verifyLogin() {
	 boolean value= home.verifyLogin();
	 Assert.assertTrue(value, "User is not logged in");
  }
  
  @BeforeClass
  public void setup() {
	  initialize();
	  home=new HomePage();
	  login =home.clickLogin();
	
	 register=new RegisterPage();
	 returnedPage=new ReturnedRegistrationPage();
	 
  }

  @AfterClass
  public void tearDown() {
	  
	  driver.quit();
  }

}
