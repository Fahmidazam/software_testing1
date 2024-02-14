package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ebaybooksPom {

	WebDriver driver;

	public ebaybooksPom (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	
	@FindBy  (xpath ="//*[@id=\"gh-cat\"]")
	WebElement click_all_catagories;
	public WebElement allcatagories () {
		return click_all_catagories;
	}
	
	//*[@id="gh-cat"]/option[5]
	@FindBy  (xpath ="//*[@id=\"gh-cat\"]/option[5]")
	WebElement click_books;
	public WebElement books () {
		return click_books;
	}
}
