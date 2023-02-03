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
	
	@FindBy (linkText = "Log in")
	private WebElement loginBut;
	
	@FindBy (linkText = "Log out")
	private WebElement logOutBut;
	
	@FindBy (linkText = "Computers")
	private WebElement computers;
	
	@FindBy (linkText = "Electronics")
	private WebElement eletronics;
	
	
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
	
	public LoginPage clickLogin() {
		loginBut.click();
		return new LoginPage();
		
	}
	
	public boolean verifyLogin() {
		String value=logOutBut.getText();
		boolean val = value.contains("Log out");
		return val;
	}
	
	public ComputersPage clickComputers() {
		Utility.hold();
		computers.click();
		
		return new ComputersPage();
	}
	
	public EletronicsPage clickEletronics() {
		Utility.hold();
		eletronics.click();
		return new EletronicsPage();
	}
	
	
	
}
