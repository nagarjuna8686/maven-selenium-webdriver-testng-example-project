package testcases.mytheresa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverSettings {
	
	public WebDriver driverSettings() {
		
		chrome_options = Options();
                chrome_options.add_argument("--headless");
                chrome_options.add_argument("--no-sandbox");
		driver = webdriver.Chrome('lib/chromedriver', "options=chrome_options");
		//System.setProperty("webdriver.chrome.driver", "lib/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

}
