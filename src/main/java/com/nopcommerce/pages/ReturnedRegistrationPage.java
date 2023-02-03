package com.nopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.util.Utility;

public class ReturnedRegistrationPage extends TestBase{
	
	@FindBy (linkText = "Log in")
	private WebElement loginBut;

	@FindBy (linkText = "Continue")
	private WebElement continiue;
	
	@FindBy (xpath = "//div[@class='result']")
	private WebElement result;
	
	
	
	public ReturnedRegistrationPage() {
		PageFactory.initElements(driver,this);
	}

	public HomePage clickContinue() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Utility.hold();
		continiue.click();
		
		return new HomePage();
	}
	
	public LoginPage login() {
		Utility.hold();
		loginBut.click();
		return new LoginPage();
	}
	
	public String verifyRegistrationMessage() {
		Utility.hold();
		return result.getText();
	}
	
}
