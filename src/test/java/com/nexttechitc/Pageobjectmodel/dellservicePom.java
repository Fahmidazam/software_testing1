package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dellservicePom {

WebDriver driver;// global variable
	
	
	
	public  dellservicePom  (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	
	@FindBy( xpath ="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/button/span")
	WebElement click_services;

	public WebElement services() {
		return click_services;
	}
	
	@FindBy( xpath ="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[4]/button")
	WebElement click_professionalservices;

	public WebElement professionalservices() {
		return click_professionalservices;
	}
	
	@FindBy( xpath ="//*[@id=\"unified-masthead-navigation\"]/nav/ul/li[4]/ul/li[4]/ul/li[4]/a")
	WebElement click_multicloudservices;

	public WebElement multicloudservices() {
		return click_multicloudservices;
	}
	
	
}
