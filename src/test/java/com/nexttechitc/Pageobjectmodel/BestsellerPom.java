package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BestsellerPom {

	WebDriver driver;// global variable
	
	
	
	public  BestsellerPom (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }

	@FindBy  (xpath="//a[@href=\"/gp/bestsellers/?ref_=nav_cs_bestsellers\"]")
	   WebElement click_bestseller;
	   public WebElement bestseller(){
		return click_bestseller;
		   
	   }
}
