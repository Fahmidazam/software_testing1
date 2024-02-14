package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.DellactionPom;
import com.nexttechitc.Pageobjectmodel.dellservicePom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class dellservice {

	WebDriver driver;
	
	@Given("^user visit Dell homepage$")
	public void user_visit_Dell_homepage() throws Throwable {
	
System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		//how to open browser
		driver = new ChromeDriver();
		
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		//how to open url
		driver.get("https://www.dell.com/en-us");
		
		//maximise windows
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
	}

	@When("^user go to service dropdown menu and able to see professional services$")
	public void user_go_to_service_dropdown_menu_and_able_to_see_professional_services() throws Throwable {
	  
		Actions act=new Actions(driver);

		dellservicePom  ser = new dellservicePom (driver);
		
		act.moveToElement(ser.services()).build().perform();

		Thread.sleep(2000);

		ser.professionalservices().click();
		
		
		
	}

	@When("^When user go to professional services dropdown menu and able to see multicloud services$")
	public void when_user_go_to_professional_services_dropdown_menu_and_able_to_see_multicloud_services() throws Throwable {
	 
		Actions act=new Actions(driver);

		dellservicePom  ser = new dellservicePom (driver);
		
		act.moveToElement(ser.professionalservices()).build().perform();

		Thread.sleep(2000);

		ser.multicloudservices().click();
		
		//Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,30);
	}

	@Then("^user should redirects to view all service$")
	public void user_should_redirects_to_multicloud_services() throws Throwable {

	}


}
