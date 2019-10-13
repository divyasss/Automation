package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summarypage {
	WebDriver driver;
	public Summarypage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[text()='Printed Summer Dress']")
	private WebElement Description;
	@FindBy(xpath="//span[text()='Proceed to checkout']")
	private WebElement Proceed_btn;
	public WebElement getDescription() {
		return Description;
	}
	public WebElement getProceed_btn() {
		return Proceed_btn;
	}
	

}
