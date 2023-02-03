package com.nopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.util.Utility;

public class LoginPage extends TestBase {

	@FindBy (id = "Email")
	private WebElement email;
	
	@FindBy (id = "Password")
	private WebElement pass;
	
	@FindBy (xpath = "//button[text()='Log in']")
	private WebElement loginBut;
	
	
	
	
	public LoginPage(){
		PageFactory.initElements(driver,this);
	}
	

public String validateLoginPageTitle() {
	Utility.hold();
	String title=driver.getTitle();
	return title;
}

public void enterEmailAndPass(String email,String pass) {
	Utility.hold();
	this.email.sendKeys(email);
	this.pass.sendKeys(pass);
}

public HomePage clickLogin() {
	
	loginBut.click();
	return new HomePage();
}
	
	
	
}
