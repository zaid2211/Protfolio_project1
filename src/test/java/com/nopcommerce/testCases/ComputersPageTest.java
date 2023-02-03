package com.nopcommerce.testCases;

import org.testng.annotations.Test;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.pages.ComputersPage;
import com.nopcommerce.pages.DesktopsPage;
import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.NotebooksPage;
import com.nopcommerce.pages.SoftwarePage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ComputersPageTest extends TestBase{
	HomePage home;
	ComputersPage computers;
	DesktopsPage desktops;
	NotebooksPage notebooks;
	SoftwarePage software;
	
  @Test (priority = 1)
  public void validateComputersPage() {
		  String value=computers.validateComputersPage();
		  Assert.assertEquals(value,"Computers","computer page not validated");
		  Reporter.log("computers page validated",true);
	  
	  }
  
  @Test (priority = 2)
  public void addDesktopToCart() {
	  desktops=computers.clickDesktops();
	  desktops.addDesktopToCart();
	  Reporter.log("Desktop added to cart");
	  
  }
  
  @Test 
  public void addNotebookToCart() {
	  notebooks=computers.clickNotebooks();
	  notebooks.addNotebookToCart();
	  Reporter.log("Notebook added to cart");
	  
  }
  
  
  @Test 
  public void addSoftwareToCart() {
	  software=computers.clickSoftware();
	  software.addSoftwareToCart();
	  Reporter.log("Software added to cart");
  }
  
  @BeforeClass
  public void setup() {
	  initialize();
	  home=new HomePage();
	  computers= home.clickComputers();
  
  }
   
  @AfterClass
  public void tearDown() {
  }

}
