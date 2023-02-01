package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.base.TestBase;

import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.fail;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;

public class NewTest extends TestBase{
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  
	  initialize();
	 
  }

  @AfterMethod
  public void afterMethod() {
	  
	 
	  driver.quit();
  }

}
