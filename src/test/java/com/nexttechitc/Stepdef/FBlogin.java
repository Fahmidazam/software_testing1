package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.FBloginPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBlogin {

	WebDriver driver;

@Given("^user visiting facebook login page$")
public void user_visiting_facebook_login_page() throws Throwable {

	try {
	//how to open browser?
	System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	
	driver = new ChromeDriver();
	
	 //Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	// how to open URL
	  driver.get("https://www.facebook.com/");
	
	  // Maximize window  
        driver.manage().window().maximize();
	
}
	catch (Exception e) {
		System.out.println("browser and url not opening" );
	}
		
	}



@When("^users enter \"([^\"]*)\" \"([^\"]*)\"$")
public void users_enter(String arg1, String arg2) throws Throwable {
  
	try {
		 FBloginPom login = new  FBloginPom (driver);
		 login.email_or_phone_number().sendKeys(arg1);
		 login.password().sendKeys(arg2);
	}
	catch(Exception e) {
		System.out.println("email or pw not typing");
	}
}

@When("^When click on login button$")
public void when_click_on_login_button() throws Throwable {
  
	try {
		 FBloginPom login = new  FBloginPom (driver);
		 login.click_login().click();
		Thread.sleep(5000);
	}
	catch(Exception e) {
		System.out.println("login button not clicking");
	}
}

@Then("^user should able to login to fb$")
public void user_should_able_to_login_to_fb() throws Throwable {
  
	driver.quit();
	
}


}
