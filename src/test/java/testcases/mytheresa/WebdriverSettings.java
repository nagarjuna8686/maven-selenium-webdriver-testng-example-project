package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import os;
from selenium.webdriver.chrome.options import Options ;
from selenium import webdriver; 
import org.openqa.selenium.By;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
		ChromeOptions options = new ChromeOptions();
                options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
                options.addArguments("start-maximized"); // open Browser in maximized mode
                options.addArguments("disable-infobars"); // disabling infobars
                options.addArguments("--disable-extensions"); // disabling extensions
                options.addArguments("--no-sandbox");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://google.com");
		//WebDriver driver = new ChromeDriver();
		return driver;
	}

}
