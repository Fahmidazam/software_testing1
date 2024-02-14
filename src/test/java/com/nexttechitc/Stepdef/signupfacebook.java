package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.signupfacebookPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class signupfacebook {

	WebDriver driver;
	
	@Given("^User visit facebook sign up form/page$")
	public void user_visit_facebook_sign_up_form_page() throws Throwable {
		try {
		//how to open browser?
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		
		 //Implicit wait
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		// how to open URL
		  driver.get("https://www.facebook.com/reg/");
		
		  // Maximize window  
	        driver.manage().window().maximize();
		
	}
		catch (Exception e) {
			System.out.println("browser and url not opening" );
		}
			
		}

	@When("^user type  valid \"([^\"]*)\" and  and  \"([^\"]*)\"$")
	public void user_type_valid_and_and(String arg1, String arg2) throws Throwable {
	  try {
		signupfacebookPom signup = new signupfacebookPom (driver);
		signup.Firstname().sendKeys(arg1);
		signup.Lastname().sendKeys(arg2);
		Thread.sleep(1000);
		  //explicit wait
		  WebDriverWait wait = new WebDriverWait(driver,30);
	  }
	  catch (Exception e) {
		  System.out.println("firstname lastname not typing");
	  }
	}

	@When("^user type  valid \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_type_valid_and(String arg1, String arg2) throws Throwable {
		try {
			
		
		signupfacebookPom signup = new signupfacebookPom (driver);
		signup.emailaddress().sendKeys(arg1);
		Thread.sleep(1000);
		signup.newpassword().sendKeys(arg2);
		Thread.sleep(1000);
		
		  //explicit wait
		  WebDriverWait wait = new WebDriverWait(driver,30);
		}
		catch (Exception e) {
			  System.out.println("email and password not typing");
		  }
	}

	@When("^user enter valid \"([^\"]*)\" user select option from \"([^\"]*)\"$")
	public void user_enter_valid_When_user_select_option_from(String arg1, String arg2) throws Throwable {
		
		try {
			
			
			signupfacebookPom signup = new signupfacebookPom (driver);
			Select dropdown=new Select (signup.click_month);
			  dropdown.selectByIndex(0);
			 
			  Select dropdown1=new Select (signup.click_day);
			  dropdown1.selectByValue("1");

			  Select dropdown2=new Select (signup.click_year);
			  dropdown2.selectByVisibleText("2001");
			  
			  Thread.sleep(2000);
			  signup.click_Gender().click();
		}
		catch (Exception e) {
			  System.out.println("date of birth and gender is not typing");
		  }
		
	}
	
	@When("^User clicks on sign up button$")
	public void user_clicks_on_sign_up_button() throws Throwable {
	   
		signupfacebookPom signup = new signupfacebookPom(driver);
		  signup.signup().click();
		  Thread.sleep(2000);
	}
	
	@Then("^User will be able to sign up successfully                              \"$")
	public void user_will_be_able_to_sign_up_successfully() throws Throwable {

		try {
		  
		  //explicit wait
		  WebDriverWait wait = new WebDriverWait(driver,30);
	 
		  Thread.sleep(2000);
		  //driver close
		 driver.quit();
	}
	catch (Exception e) {
		  System.out.println("can not signup");
	  }
	}


}
