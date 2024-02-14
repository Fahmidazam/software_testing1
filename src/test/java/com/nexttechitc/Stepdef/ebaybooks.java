package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.ebaybooksPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ebaybooks {
 WebDriver driver;
 
	@Given("^User visits ebay homepage$")
	public void user_visits_ebay_homepage() throws Throwable {
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
	

	@When("^User click on all catagories dropdoen menue will appeare$")
	public void user_click_on_all_catagories_dropdoen_menue_will_appeare() throws Throwable {
	   try {
		   
		   ebaybooksPom catagories  = new ebaybooksPom(driver);
		   catagories.allcatagories().click();
	   }
	   catch(Exception e) {
		   System.out.println("all catagories not clicking");
	   }
		   
	   
	}

	@When("^from dropdown user click on books$")
	public void from_dropdown_user_click_on_books() throws Throwable {
	   try {
		Actions act = new Actions(driver);
		 ebaybooksPom catagories  = new ebaybooksPom(driver);
		 act.moveToElement(catagories.allcatagories()).build().perform();
		   catagories.books().click();
		   Thread.sleep(2000);
		   WebDriverWait wait = new WebDriverWait(driver,30);
	   }
	   catch(Exception e) {
		   System.out.println("books not clicking");
	   }
	}



@Then("^User should able to see books option on searcbox$")
public void user_should_able_to_see_books_option_on_searcbox() throws Throwable {
    
	    
		driver.quit();
	}


}
