package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;

import org.testng.annotations.BeforeMethod;


import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class HomePageTest extends TestBase{
	
	HomePage home;
	RegisterPage register;
	
	
  @Test (priority = 1)
   public void HomePageTitleTest() {
	 String title= home.title();
	 Assert.assertEquals(title, "nopCommerce demo store","HomePage title does not match");
  }
  
  @Test (priority = 2)
  public void homePageLogo() {
     Boolean logo= home.homeLogo();
     Assert.assertTrue(logo,"HomePage logo is not visible");
  }
  
  @Test (priority = 3)
  public void registerBut() {
	  register= home.clickOnRegisterButton();
  }
  
  
  
  @BeforeClass
  public void beforeMethod() {
	  initialize();
	  
	  home=new HomePage();
	  
  }

  @AfterClass
  public void tearDown() {
	  driver.quit();
  }

}
