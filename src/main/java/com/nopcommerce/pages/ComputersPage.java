package com.nopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.util.Utility;

public class ComputersPage extends TestBase{
	
	@FindBy(xpath = "//div[@class='page-title']")
	private WebElement computersPageName;
	
	@FindBy(xpath = "(//div[@class='picture'])[1]")
	private WebElement desktops;
	
	@FindBy (xpath = "(//div[@class='picture'])[2]")
	private WebElement notebooks;
	
	@FindBy (xpath = "(//div[@class='picture'])[3]")
	private WebElement software;
	
	
	
	
	public ComputersPage() {
		PageFactory.initElements(driver,this);
	}
	
	//Actions
	
	public String validateComputersPage() {
		Utility.hold();
		return computersPageName.getText();
	}
	
	public DesktopsPage clickDesktops() {
		desktops.click();
		return new DesktopsPage();
		
	}
	
	public NotebooksPage clickNotebooks() {
		notebooks.click();
		return new NotebooksPage();
	}
	
	public SoftwarePage clickSoftware() {
		software.click();
		return new SoftwarePage();
	}
	
	
	
	
	
	

}
