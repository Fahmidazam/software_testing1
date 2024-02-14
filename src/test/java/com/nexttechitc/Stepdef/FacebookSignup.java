package com.nexttechitc.Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.facebooksignup;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookSignup {

	WebDriver driver;
	
	@Given("^visit FB home page$")
	public void visit_FB_home_page() throws Throwable {
	 
		//how to open browser?
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
				driver = new ChromeDriver();
				
				
				// how to open URL
				  driver.get("https://www.facebook.com/");

				  driver.manage().window().maximize();
	}

	@When("^click on create new account button$")
	public void click_on_create_new_account_button() throws Throwable {
	   
		facebooksignup  FacebookSignup = new facebooksignup(driver);
		FacebookSignup.createnewaccount().click();
	    
	}

	@Then("^user able to enter into signup page$")
	public void user_able_to_enter_into_signup_page() throws Throwable {
	    
	    
	}
}