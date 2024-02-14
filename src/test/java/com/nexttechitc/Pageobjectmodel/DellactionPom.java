package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DellactionPom {

WebDriver driver;// global variable
	
	
	
	public  DellactionPom (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	
	   
	@FindBy( xpath ="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
	WebElement click_services;

	public WebElement services() {
		return click_services;
	}
	
	@FindBy( xpath ="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[3]/a")
	WebElement click_viewallservices;

	public WebElement viewallservices() {
		return click_viewallservices;
	}
		   
	   
}
