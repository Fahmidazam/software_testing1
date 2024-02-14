package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebaysearchPom {

	WebDriver driver;// global variable

	public ebaysearchPom(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"gh-ac\"]")
	WebElement type_search;

	public WebElement ebaysearch() {
		return type_search;
	}

	@FindBy(xpath = "//*[@id=\"gh-btn\"]")
	WebElement click_searchbutton;

	public WebElement ebaysearchbutton() {

		return click_searchbutton;
	}
}
