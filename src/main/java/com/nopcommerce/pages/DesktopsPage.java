package com.nopcommerce.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.util.Utility;

public class DesktopsPage extends TestBase {
	
	@FindBy (xpath = "(//button[text()='Add to cart'])[2]")
	private WebElement desktopAddTocart;

	
	public DesktopsPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void addDesktopToCart() {
		Utility.hold();
		desktopAddTocart.click();
	}
}
