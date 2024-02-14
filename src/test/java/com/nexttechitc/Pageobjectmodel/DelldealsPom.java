package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DelldealsPom {

	WebDriver driver;
	
	public DelldealsPom (WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy (xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/button/span")
	WebElement click_deals;
	public WebElement deals() {
		return click_deals;
		
	}
	
	@FindBy (xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/ul/li[12]/button")
	WebElement click_member_discounts;
	public WebElement memberdiscounts() {
		return click_member_discounts;
	
	}
	
	@FindBy (xpath="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[6]/ul/li[12]/ul/li[3]/a")
	WebElement click_student_discounts;
	public WebElement studentdiscounts() {
		return click_student_discounts;
	
	}

	
}
