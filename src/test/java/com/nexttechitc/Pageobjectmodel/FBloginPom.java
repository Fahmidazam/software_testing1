package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginPom {

	WebDriver driver;
	public  FBloginPom (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }

	@FindBy (xpath="//input[@id=\"email\"]")
	WebElement email_or_phone_number;
	public WebElement email_or_phone_number() {
		return email_or_phone_number;
		
		
		
	}
	
	@FindBy (xpath="//*[@id=\"passContainer\"]/input")
	WebElement password;
	public WebElement password() {
		return password;
		
		
	}
	
	@FindBy (name="login")
	WebElement click_login;
	public WebElement click_login() {
		return click_login;
		
	}
}
