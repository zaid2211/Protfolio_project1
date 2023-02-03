package com.nopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.util.Utility;

public class HomePage extends TestBase {

	//declaring page objects
	
	@FindBy(linkText = "Register")
	private WebElement registerBut;
	
	@FindBy(xpath = "//img[contains(@alt,'nopCommerce demo store')]")
	private WebElement homeLogo;
	
	//initializing page objects using pagefactory
	
	public HomePage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	public String title() {
		String title=driver.getTitle();
		return title;
		
	}
	
	public boolean homeLogo() {
		return	homeLogo.isDisplayed();
	}
	
	
	public RegisterPage clickOnRegisterButton() {
		Utility.hold();
		registerBut.click();
		return new RegisterPage();
	}
	
	
	
}
