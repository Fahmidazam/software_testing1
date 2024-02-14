package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.BestsellerPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonbestseller {

	WebDriver driver;
	@Given("^user visits Amazon homepage$")
	public void user_visits_Amazon_homepage() throws Throwable {

		try {
		//how to open browser?
		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		 //Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		// how to open URL
		  driver.get("https://www.amazon.com/");
		// Maximize window  
	        driver.manage().window().maximize();

	        Thread.sleep(2000);
		}
		catch (Exception e) {
			System.out.println("browser and url not opening" );
		}
	}

	@When("^user clicks on Best seller$")
	public void user_clicks_on_Best_seller() throws Throwable {
		try {
			
		
	    BestsellerPom Amazonbestseller = new BestsellerPom(driver);
	    Amazonbestseller.bestseller().click();
	    Thread.sleep(2000);
	    WebDriverWait wait = new WebDriverWait(driver,30); 
		}
		catch (Exception e) {
			System.out.println("bestseller not opennig" );
		}
	}

	@Then("^user should be able to redirect to the Best Seller Page$")
	public void user_should_be_able_to_redirect_to_the_Best_Seller_Page() throws Throwable {
	    driver.quit();
	}
}
