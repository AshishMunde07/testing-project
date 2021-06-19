package testClasses;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import pom.classes.HomePage;
import pom.classes.LoginPage;
import property.Pojo;


public class TestClass extends Pojo {

	private WebDriver driver;
	private HomePage homepage;
	private WebDriverWait wait;
	static ExtentTest test;
	static ExtentHtmlReporter reporter;
	
	@BeforeTest
	@Parameters ("browser")
	public void beforettest(String browser)
	{
		
		reporter = new ExtentHtmlReporter("test-output//ExtendReport//Extent.html");
		ExtentReports extend = new ExtentReports();
		extend.attachReporter(reporter);
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			driver = OpenChrome();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			driver = OpenFirefox();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@BeforeClass
	public void beforeClass()
	{

		driver.get("https://online.actitime.com/ent/login.do");
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException
	{
		LoginPage loginpage = new LoginPage(driver);
		
		Thread.sleep(3000);
		loginpage.enterUsername(1,0);
		loginpage.enterPassword(1,1);
		loginpage.ClickonLogin();
	}
	
	@Test
	public void VerifyTaskurl() throws InterruptedException
	{
		homepage = new HomePage(driver);
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
		Thread.sleep(10000);
	
		homepage.ClickOnReportsButton();
		
		String URL = driver.getCurrentUrl();
	//	Assert.assertEquals(URL, "https://online.actitime.com/ent/reports/dashboard.");
		System.out.println(URL);
	
	}
	
	@AfterMethod
	public void aftermethod() throws InterruptedException
	{
		Thread.sleep(3000);
		homepage.clickOnLogout();
	}
	
	@AfterTest
	public void afterclass()
	{
		driver.quit();
//		driver = null;
		
	}
	
	
}
	
	
	

