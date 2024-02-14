package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.ebayelectronicsPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebayelectronics {

	WebDriver driver;
	
	@Given("^User visit Ebay homepage$")
	public void user_visit_Ebay_homepage() throws Throwable {
		try {
			  
			  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			   
			   driver = new ChromeDriver();
			   
			   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			   
			   driver.get("https://www.ebay.com/");
			   
			   driver.manage().window().maximize();
			   
			   Thread.sleep(2000);
		}
		   catch(Exception e) {
			   System.out.println("browser not opening");
		   }
	}

	@When("^User go to electronics dropdoen menue will able to see ebay refurbished$")
	public void user_go_to_electronics_dropdoen_menue_will_able_to_see_ebay_refurbished() throws Throwable {
	    try {
		Actions act = new Actions(driver);
		 
		ebayelectronicsPom elc = new ebayelectronicsPom(driver);
		 
		 act.moveToElement(elc.Electronics()).build().perform();
		 
		 Thread.sleep(2000);
	    }
	    catch(Exception e) {
			   System.out.println("electronics not clicking");
		   }
	}

	@When("^When click on ebay refurbished$")
	public void when_click_on_ebay_refurbished() throws Throwable {
	   try {
		Actions act = new Actions(driver);
		 ebayelectronicsPom elc = new ebayelectronicsPom(driver);
		 
		 act.moveToElement(elc.ebayRefurbished()).build().perform();
		 
		 Thread.sleep(2000);
		 
		 elc.ebayRefurbished().click();
		
		 Thread.sleep(2000);
		
		 WebDriverWait wait = new WebDriverWait(driver,30); 
	   }
	   catch(Exception e) {
		   System.out.println("ebayRefurbished is not opening");
	   }
	}

	@Then("^User should able to see the products$")
	public void user_should_able_to_see_the_products() throws Throwable {
	   
		
		driver.quit();
	}


}
