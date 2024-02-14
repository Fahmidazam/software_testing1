package com.nexttechitc.Stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.nexttechitc.Pageobjectmodel.DellactionPom;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DellAction {

	WebDriver driver; 
	
	@Given("^user visits Dell homepage$")
	public void user_visits_Dell_homepage() throws Throwable {
		try {
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
		 catch(Exception e) {
			   System.out.println("browser not opening");
		   }
	}

	@When("^user go to service dropdown menu and able to see View All Service$")
	public void user_go_to_service_dropdown_menu_and_able_to_see_View_All_Service() throws Throwable {
		try {
		Actions act=new Actions(driver);

		DellactionPom ser = new DellactionPom(driver);
		
		act.moveToElement(ser.services()).build().perform();

		Thread.sleep(3000);

		ser.viewallservices().click();
		
		//Explicit wait
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		}
		 catch(Exception e) {
			   System.out.println("view all service not clicking");
		   }
	}

	@Then("^user redirects to view all service$")
	public void user_redirects_to_view_all_service() throws Throwable {
	  
		driver.quit();
	}


}
