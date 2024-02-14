package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class facebooksignup {

WebDriver driver;
	
	public facebooksignup (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }

	@FindBy  (xpath="//a[@data-testid=\"open-registration-form-button\"]")
	   WebElement click_Create_new_account;
	   public WebElement createnewaccount(){
		return click_Create_new_account;
	
	   }
	
	}

