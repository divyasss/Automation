package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Paymentbtn {
	WebDriver driver;
	public Paymentbtn(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@class='bankwire']")
	private WebElement Paybank;
	@FindBy(xpath="//span[text()='I confirm my order']")
	private WebElement Confrim;
	public WebElement getPaybank() {
		return Paybank;
	}
	public WebElement getConfrim() {
		return Confrim;
	}
	
	
	

}
