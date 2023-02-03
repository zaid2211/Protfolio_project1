package com.nopcommerce.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.nopcommerce.base.TestBase;
import com.nopcommerce.util.Utility;

public class NotebooksPage extends TestBase {
	
	@FindBy (xpath = "(//button[text()='Add to cart'])[2]")
	private WebElement notebookAddTocart;

	
	public NotebooksPage() {
		PageFactory.initElements(driver,this);
	}
	
	public void addNotebookToCart() {
		Utility.hold();
		notebookAddTocart.click();
	}
}
