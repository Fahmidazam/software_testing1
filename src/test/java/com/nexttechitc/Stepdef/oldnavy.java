package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.nexttechitc.Pageobjectmodel.oldnavyPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class oldnavy {
	
	WebDriver driver;
	
	@Given("^User visit old navy  homepage$")
	public void user_visit_old_navy_homepage() throws Throwable {
	   try {
		   System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		   
		   driver = new ChromeDriver();
		   
		   driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		   
		   driver.get("https://oldnavy.gap.com/");
		   
		   driver.manage().window().maximize();
		   
		   Thread.sleep(2000);
	}
	   catch(Exception e) {
		   System.out.println("browser not opening");
	   }
		   
	   }

	@When("^user go to men dropdown menu and able to see deals$")
	public void user_go_to_men_dropdown_menu_and_able_to_see_deals() throws Throwable {
	   try {
		  
		   Actions act =new Actions(driver);
		   oldnavyPom men = new oldnavyPom (driver);
		   
		   
		   
		   men.close().click();
		  
		   men.men().click();
		   
		   Thread.sleep(2000);
	   }
	   catch(Exception e) {
		   System.out.println("browser not opening");
	   }
		   
	}

	@When("^When user go to sale and click on it$")
	public void when_user_go_to_sale_and_click_on_it() throws Throwable {
		try {
			  
			   Actions act =new Actions(driver);
			   
			   oldnavyPom men = new oldnavyPom (driver);
			   
			   act.moveToElement(men.men()).build().perform();
			   men.sale().click();
			   Thread.sleep(2000);
		   }
		   catch(Exception e) {
			   System.out.println("browser not opening");
		   }
	}

	@Then("^user should redirects to sale page$")
	public void user_should_redirects_to_sale_page() throws Throwable {
	  
	}


}
