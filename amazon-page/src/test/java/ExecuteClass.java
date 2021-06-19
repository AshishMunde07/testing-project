import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pom.classes.AmazonPage;
import com.pom.classes.HomePage;

public class ExecuteClass {

	WebDriver driver;
	
	
	@BeforeClass
	public void beforeClass()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\automation project\\chromedriver.exe");
	
		//System.setProperty("webdriver.gecko.driver","");
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@BeforeMethod
	public void beforeMethod() 
	{
		HomePage page = new HomePage(driver);
		page.SendKeys("mobile");
		page.clickOnButton();
	}
	@Test
	public void testURL()
	{
		String URL = driver.getCurrentUrl();
		boolean  b = URL.equals(URL);
		System.out.println(b);
	}
	@Test
	public void textcheck()
	{
		AmazonPage page1 = new AmazonPage(driver);
		String text = page1.gettext();
	
		System.out.println(text);
	}
	@AfterMethod
	public void afterMethod() {
		driver.navigate().back();
	}
	@AfterClass
	public void Close() {
		driver.close();
	}
	
	

}
