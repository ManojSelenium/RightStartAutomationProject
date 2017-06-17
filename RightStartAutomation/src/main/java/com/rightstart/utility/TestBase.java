package com.rightstart.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase implements Config{

	public WebDriver driver;

	public WebDriver launchBrowser(String sBrowser) {
		if(sBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","D:\\JARS\\geckodriver.exe");
			driver=new FirefoxDriver();
		}else if(sBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver","D:\\JARS\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		System.out.println("Test Base Driver :::: "+driver);
		return driver;
	}
	
	
	public void enterURL(String sURL) {
		driver.get(sURL);
	}
}
