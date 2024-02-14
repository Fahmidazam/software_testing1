package com.nexttechitc.Stepdef;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.DelldealsPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Delldeals {

	WebDriver driver;
	@Given("^User visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
		try {
	    System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	    
	    //how to open browser
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    //how to open URL
	    driver.get("https://www.dell.com/en-us");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
		}
		catch (Exception e) {
			System.out.println("browser and url not opening" );
		}
	}

	@When("^user go to deals dropdown menu and able to see member discounts$")
	public void user_go_to_deals_dropdown_menu_and_able_to_see_member_discounts() throws Throwable {
	   try {
		Actions act = new Actions(driver);
		DelldealsPom ser = new DelldealsPom(driver);
		act.moveToElement(ser.deals()).build().perform();
		ser.deals().click();
		Thread.sleep(2000);
		ser.memberdiscounts().click();
		Thread.sleep(2000);
		ser.studentdiscounts().click();
		WebDriverWait wait = new WebDriverWait(driver,30);
	   }
	   catch (Exception e) {
			System.out.println("student discount is not opening" );
		}
				
	}

	@When("^When user go to member discounts dropdown menu and able to see student discounts$")
	public void when_user_go_to_member_discounts_dropdown_menu_and_able_to_see_student_discounts() throws Throwable {
	  
		driver.quit();
	}

	@Then("^user should redirects to student discounts$")
	public void user_should_redirects_to_student_discounts() throws Throwable {
	   
	}


}
