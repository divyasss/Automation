package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout {
WebDriver driver;
public Signout(WebDriver ldriver) {
	this.driver=ldriver;
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="//a[@class='logout']")
private WebElement signout_btn;
public WebElement getSignout_btn() {
	return signout_btn;
}
public void setSignout_btn(WebElement signout_btn) {
	this.signout_btn = signout_btn;
}

}
