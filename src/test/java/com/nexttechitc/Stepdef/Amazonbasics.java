package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.nexttechitc.Pageobjectmodel.AmazonbasicPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbasics {

	WebDriver driver; 
	@Given("^user visits amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		 //Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		driver.manage().window().maximize();

		Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("browser and url not opening" );
		}
	}
	@When("^user clicks on Amazon Basics$")
	public void user_clicks_on_Amazon_Basics() throws Throwable {
		try {
			
		
		AmazonbasicPom amazonbasic = new AmazonbasicPom (driver);
		amazonbasic.amazonbasics().click();
		Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("amazonbasic is not opening" );
		}
	}

	@Then("^user should be able to redirect to the Amazon Basics Page$")
	public void user_should_be_able_to_redirect_to_the_Amazon_Basics_Page() throws Throwable {
		
		driver.quit();
	   
	}


}
