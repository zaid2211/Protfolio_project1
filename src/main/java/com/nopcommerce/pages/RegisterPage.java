package com.nopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.util.Utility;

public class RegisterPage extends TestBase {
	
	@FindBy (xpath = "//img[contains(@alt,'nopCommerce demo store')]")
	private WebElement logo;
	
	
	@FindBy (id = "gender-male")
	private WebElement genderM;
	
	@FindBy (id = "gender-female")
	private WebElement genderF;
	
	@FindBy (id = "FirstName")
	private WebElement firstName;
	
	@FindBy (id = "LastName")
	private WebElement lastName;
	
	@FindBy (name = "DateOfBirthDay")
	private WebElement dateOfBirthDay;
	
	@FindBy (name = "DateOfBirthMonth")
	private WebElement birthMonth;
	
	@FindBy (name = "DateOfBirthYear")
	private WebElement birthYear;
	
	@FindBy (id = "Email")
	private WebElement email;
	
	@FindBy (id = "Password")
	private WebElement pass;
	
	@FindBy (id = "ConfirmPassword")
	private WebElement passC;
	
	@FindBy (id = "register-button")
	private WebElement registerBut;
	
	
	
	
	
	public RegisterPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	//Actions
	
	public String title() {
		Utility.hold();
		return driver.getTitle();
	}
	
	public boolean logo() {
	return	logo.isDisplayed();
	}
	
	public void enterGenderFirstLastName(String gender,String FirstName,String LastName) {
		Utility.hold();
		
		if(gender.equals("Male")) {
		genderM.click();
		}
		else if (gender.equals("Female")) {
			genderF.click();
		} 
		
		firstName.sendKeys(FirstName);
		lastName.sendKeys(LastName);
		
	}
	
	public void enterDob(String date,String month,String year) {
		Select selectDate=new Select(dateOfBirthDay);
		
		selectDate.selectByVisibleText(date);
		
		Select selectMonth=new Select(birthMonth);
		selectMonth.selectByVisibleText(month);
		
		Select selenctYear =new Select(birthYear);
		selenctYear.selectByVisibleText(year);
		
	
	}
	
	public void enterEmailPass(String email,String pass) {
		this.email.sendKeys(email);
		this.pass.sendKeys(pass);
		passC.sendKeys(pass);
		
	}
	
	public ReturnedRegistrationPage clickOnRegisterBut() {
		registerBut.click();
		return new ReturnedRegistrationPage();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
