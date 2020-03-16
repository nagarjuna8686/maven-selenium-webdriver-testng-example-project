package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		chrome_options.add_argument("no-sandbox");
                chrome_options.add_argument("--disable-extensions");
                chrome_options.add_argument("--headless");
		System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
