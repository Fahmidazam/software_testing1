package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.AmazonsearcPom;
import com.nexttechitc.Pageobjectmodel.BestsellerPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazonsearch {



	WebDriver driver;
		
		@Given("^user visits amazon home$")
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

	@When("^user types \"([^\"]*)\" and click search icon$")
	public void user_types_and_click_search_icon(String arg1) throws Throwable {
	   try {
		AmazonsearcPom amazonsearch = new AmazonsearcPom(driver);
		   amazonsearch.amazonsearch().sendKeys(arg1);
           amazonsearch.amazonsearchbutton().click();
           WebDriverWait wait = new WebDriverWait(driver,30);
	   }
	   catch (Exception e) {
			System.out.println("not typing in search box" );
		}
	   
		   
	}

	@Then("^User should be able to see the expected product$")
	public void user_should_be_able_to_see_the_expected_product() throws Throwable {
	   
		driver.quit();
	}


}

// Syntax of xpath is Xpath=//tagname[@attribute="value"]
// 2 amazon.com webelements xpath is 
// 1. Registry (Xpath= //*[@id="nav-xshop"]/a[7])
// 2. New Releases (Xpath=//*[@id="nav-xshop"]/a[10])
