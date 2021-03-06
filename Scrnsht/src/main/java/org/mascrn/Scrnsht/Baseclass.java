package org.mascrn.Scrnsht;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;



public class Baseclass {
	public static WebDriver driver;
	//browser name
    public static WebDriver getDriver(String browsername ) throws Throwable {
    	try {
    		if(browsername.equalsIgnoreCase("chrome")) {
    			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Scrnsht\\Driver\\chromedriver.exe");
    			driver=new ChromeDriver();
    		}
    		else {
    			System.out.println("browser is invalid");
    		}
    	}
    	catch(Exception e){
    		throw new Exception("invalid");  		
    		
    	}
    	driver.manage().window().maximize();
    	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   	
		
		return driver;
	}
    //get url
    public static void getUrl(String url) throws Exception {
    	
    		try {
				driver.get(url);
			} 
    		catch (Exception e) {			
				e.printStackTrace();
				throw new Exception("url not present");
			}  		    	
    		
    	
    }
    //mouse hover
    public static void mousehover(WebElement element) {
    	waitforvisibilityofelement(element);
    	Actions ac=new Actions(driver);
    	if(elementisDisplayed(element)&&elementisEnabled(element)) {
    		ac.moveToElement(element).build().perform();    		
    	}   

}
    //isenabled
    public static boolean elementisEnabled(WebElement element) {	
			
		
		boolean enabled = false;
		try {			
			enabled=element.isEnabled();
		} 
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return enabled;
	}
    //isdisplayed
	public static boolean elementisDisplayed(WebElement element) {
		boolean displayed = false;
		try {			
			displayed=element.isDisplayed();
		} catch (Exception e) {
		
			e.printStackTrace();
		}
		return displayed;
	}
	//isselected
	public static boolean elementisSelected(WebElement element) {
		boolean selected=false;
		try {
			selected=element.isSelected();
		} catch (Exception e) {			
			e.printStackTrace();
		}
		return selected;
	}
	//explictwait
	public static void waitforvisibilityofelement(WebElement element) {
		
			try {
				WebDriverWait wb=new WebDriverWait(driver,30);
				wb.until(ExpectedConditions.visibilityOf(element));
			} 
			catch (Exception e) {				
				e.printStackTrace();
			}	
		
	}
	//currenturl
	public static String getCurrentUrl() throws Exception {
		String currentUrl=null;
		try {
			currentUrl=driver.getCurrentUrl();
			System.out.println(currentUrl);
		} catch (Exception e) {			
			e.printStackTrace();
			throw new Exception("url not present");
			
		}
		return currentUrl;
	}
	//scroll
	public static void scroll(WebElement element) {
		try {
			JavascriptExecutor je=(JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView()", element);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//send keys
	public static void sendkeys(WebElement element, String value) throws Exception {		
		waitforvisibilityofelement(element);
		try {
			if(elementisDisplayed(element)&&elementisEnabled(element)) {
				element.clear();
				element.sendKeys(value);
			
			}
		} catch (Exception e) {			
			e.printStackTrace();
			throw new Exception("value not present");
		}
	}
	//gettitle
	public static String getTitle() {
		String title = null;
		try {			
			title = driver.getTitle();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    return title;
	}
	//dropdown
	public static void dropdown(WebElement element, String value, String i) {
        Select s=new Select(element);
		if(value.equals("index")) {			
			s.selectByIndex(Integer.parseInt(i));
			
		}
		else if(value.equals("value")) {
			s.selectByValue(value);
		}
		else if(value.equals("text")) {
			s.selectByVisibleText(value);
			
		}	
		
	}
	//to click
	public static void clickElement(WebElement element) {
		waitforvisibilityofelement(element);
		try {			
			element.click();
		} catch (Exception e) {			
			e.printStackTrace();			
		}
	}
	//navigate to
	public static void navigateto(String url) {
		try {
			driver.navigate().to(url);
		} catch (Exception e) {	
			
			e.printStackTrace();
		}		
	}	
	//navigate back
	public static void navigateback() {
		try {
			driver.navigate().back();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	//navigate forward
	public static void navigateforward() {
		try {
			driver.navigate().forward();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	//navigate refresh
	public static void refresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	//get text
	public static void getText(WebElement element) {
		try {
			System.out.println(element.getText());
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	public static void getAtrribute(WebElement element) {
		try {
			String attribute = element.getAttribute("value");
			System.out.println(attribute);
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	//radio button
	public static void radioButton(WebElement element) {
		try {
			element.click();
		} catch (Exception e) {			
			e.printStackTrace();
		}
	}
	//getOptions
	public static void getOptions(WebElement element) {
		Select y=new Select(element);
		List<WebElement> options=y.getOptions();
		for(WebElement y1:options) {
			System.out.println(y1.getText());
		}
		
	}
	//firstSelectedOption
	public static void firstSelectedOption(WebElement element) {
		Select y=new Select(element);
		WebElement firstSelectedOption = y.getFirstSelectedOption();
		System.out.println(firstSelectedOption.getText());
		
	}
	//screenshot
	public static void screenshot() throws Exception {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		File saveFile=new File("C:\\Users\\User\\eclipse-workspace\\Scrnsht\\Scrnshott\\screenshot.png");
		Files.copy(screenshotAs, saveFile);
		
	}
	//window handles
	public static void getWindowHandles(WebElement element) {
		String childid = driver.getWindowHandle();
		element.click();
		Set<String> parentid = driver.getWindowHandles();
		String y=null;
		for(String d:parentid) {
			if(!d.equals(childid)) {
				y=d;
			}
		}
		driver.switchTo().window(y);
	}
	//alerts for accept and dismiss
	public static void alerts(WebElement element, String s) {
		element.click();
		Alert alert = driver.switchTo().alert();
		if(s=="accept") {
			alert.accept();
			driver.switchTo().defaultContent();
		}
		else
		{
			alert.dismiss();
			driver.switchTo().defaultContent();
		}
	}
	//alerts with textbox/sendkeys
	public static void alerts1(WebElement element, String value) {
		element.click();
		Alert alert = driver.switchTo().alert();
		driver.switchTo().defaultContent();
		alert.sendKeys(value);
	}
	//close
	public static void closee() {
		driver.close();
	}
	//quit
	public static void quit() {
		driver.quit();
	}
	//double click-use actions
	public static void doubleclick(WebElement element) {
		Actions ac1=new Actions(driver);
		ac1.doubleClick(element).build().perform();
	}
	//click-use actions
	public static void click(WebElement element) {
		Actions ac2=new Actions(driver);
		ac2.click(element).build().perform();
	}
	//right click/context click -use actions
	public static void rightclick(WebElement element) {
		Actions ac3=new Actions(driver);
		ac3.contextClick(element).build().perform();
	}
	//sendkeys using actions
	public static void sendkeysActions(WebElement element, String value) {
		Actions ac4=new Actions(driver);
		ac4.sendKeys(element, value).build().perform();
	}
	//robot
	public static void robot(WebElement element) throws AWTException {
		Actions ac5=new Actions(driver);
		ac5.contextClick(element).build().perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);	
		
	}
	//drag and drop
	public static void dragdrop(WebElement element1, WebElement element2) {
		Actions ac6=new Actions(driver);
		ac6.dragAndDrop(element1,element2).build().perform();
	}
	//frames
	public static void frames(WebElement element) {
		driver.switchTo().frame(element);
	}
}
