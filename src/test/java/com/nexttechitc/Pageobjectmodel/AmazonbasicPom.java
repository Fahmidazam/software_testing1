package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonbasicPom {

WebDriver driver;// global variable
	
	
	
	public  AmazonbasicPom(WebDriver driver) {
		
	
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	@ FindBy (xpath="//*[@id=\"nav-xshop\"]/a[7]")
	WebElement click_amazonbasics;
	public WebElement amazonbasics() {
		return click_amazonbasics;
		
	}
	
			
			
}
