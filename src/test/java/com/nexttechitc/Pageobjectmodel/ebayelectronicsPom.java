package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebayelectronicsPom {

	WebDriver driver;

	public ebayelectronicsPom  (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	
	@FindBy  (xpath ="//*[@id=\"vl-flyout-nav\"]/ul/li[4]/a")
	WebElement Electronics;
	public WebElement Electronics () {
		return Electronics;
		
	}
	
	
	@FindBy  (xpath="//*[@id=\"vl-flyout-nav\"]/ul/li[4]/div[2]/div[1]/nav[2]/ul/li[1]/a")
	WebElement ebay_Refurbished;
	public WebElement ebayRefurbished () {
		return ebay_Refurbished;
	}
}
