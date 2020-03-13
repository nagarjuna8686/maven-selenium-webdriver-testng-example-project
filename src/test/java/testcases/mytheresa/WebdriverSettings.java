package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		String nodeURL1 = "http://54.80.92.125:4444//wd/hub";
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
