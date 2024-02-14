package com.nexttechitc.Pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class oldnavyPom {
	WebDriver driver;

	public oldnavyPom (WebDriver driver) {
	    this.driver=driver;
	    PageFactory.initElements(driver, this);
	    }
	@FindBy  (xpath ="/html/body/div[6]/div/div[2]/div[1]/button")
	WebElement click_close;
	public WebElement close () {
		return click_close;
	}
	
 @FindBy (xpath = "//*[@id=\"topNavWrapper\"]/div/div/ul/li[3]/div[1]/a")
	WebElement click_men;
	public WebElement men () {
		return click_men;
		
		
	}
	
	 @FindBy (xpath = "//*[@id=\"megaNav\"]/div/div[1]/ul[1]/li/div/ul/li[3]/a")
		WebElement click_sale;
		public WebElement sale () {
			return click_sale;
			
}
}
