package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.ebaysearchPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebaysearch {

	WebDriver driver;
	
	@Given("^User visit ebay homepage$")
	public void user_visit_ebay_homepage() throws Throwable {
	   try { 
		//how to open browser?
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		// how to open URL
		  driver.get("https://www.ebay.com/");
		// Maximize window  
	        driver.manage().window().maximize();
	   }
	   catch(Exception e) {
		   System.out.println("browser not opening");
	   }

	}

	@When("^User type \"([^\"]*)\" and click on search icon$")
	public void user_type_and_click_on_search_icon(String arg1) throws Throwable {
	   try {
		ebaysearchPom ebaysearch = new ebaysearchPom(driver);
		ebaysearch.ebaysearch().sendKeys(arg1);
		ebaysearch.ebaysearchbutton().click();
		WebDriverWait wait = new WebDriverWait(driver,30); 
	   }
	   catch(Exception e) {
		   System.out.println("typing problem");
	   }

	   
	}

	@Then("^User should able to see expected product$")
	public void user_should_able_to_see_expected_product() throws Throwable {
	
		driver.quit();
	}


}
