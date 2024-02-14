package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signupfacebookPom {

	WebDriver driver;
	public  signupfacebookPom (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }

	

@FindBy(name="firstname")
WebElement type_First_name;

public WebElement Firstname() {
	return type_First_name;
	
	
}
	
	@FindBy(name="lastname")
	WebElement type_Last_name;

	public WebElement Lastname() {
		return type_Last_name ;
	}
	
	@FindBy(name="reg_email__")
	WebElement type_email_address;

	public WebElement emailaddress() {
		return type_email_address ;
	}
	
	@FindBy(name="reg_passwd__")
	WebElement type_newpassword;

	public WebElement newpassword() {
		return type_newpassword;
	}
	
	@FindBy(name="birthday_month")
	public WebElement click_month;
	    
	      
	 @FindBy(id="day")
	public WebElement click_day;
	        
	        
	 @FindBy(id="year")
	public WebElement click_year;
	 
	 @FindBy(name="sex")
	 WebElement click_Gender;
		public WebElement click_Gender () {
			return click_Gender;
			
		}
			
	 @FindBy (name="websubmit")
	 WebElement SignUp;
	 public WebElement signup() {
		return SignUp;
		 
	 }
	 
		}


