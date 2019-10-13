package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	WebDriver driver;
	public Shipping(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="cgv")
	private WebElement Shippingcheckbx;
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement Proceedinshipping;
	public WebElement getShippingcheckbx() {
		return Shippingcheckbx;
	}
	public WebElement getProceedinshipping() {
		return Proceedinshipping;
	}
	

}
