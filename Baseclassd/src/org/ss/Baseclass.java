package org.ss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Baseclass {
	public static WebDriver driver;
	public static void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\Baseclassd\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "C:\\Users\\User\\eclipse-workspace\\Baseclassd\\Driver\\IEDriverServer.exe");
			driver=new InternetExplorer    Driver();
			
		}
	}
	
	

}
