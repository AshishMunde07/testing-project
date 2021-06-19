package property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Pojo {

	public static WebDriver OpenChrome()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\browser\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;	
	}
	
	public static WebDriver OpenFirefox()
	{
		System.setProperty("webdriver.gecko.driver", "src\\test\\resources\\browser\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		return driver;
	}
	
	
	
	
}
