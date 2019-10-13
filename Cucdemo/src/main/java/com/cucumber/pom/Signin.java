package com.cucumber.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signin {
	WebDriver driver;
	public Signin(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[@title='Log in to your customer account']")
	private WebElement Signinbtn;
	@FindBy(xpath="//input[@id='email']")
	private WebElement emailaddress;
	@FindBy(xpath="//input[@id='passwd']")
	private WebElement password;	
	@FindBy(xpath="//button[@name='SubmitLogin']")
	private WebElement signinloginpg;
	public WebElement getSigninbtn() {
		return Signinbtn;
	}
	public WebElement getEmailaddress() {
		return emailaddress;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getSigninloginpg() {
		return signinloginpg;
	}	
	
	
	
	
	
	

}
