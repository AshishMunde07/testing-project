package pom.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	@FindBy (xpath="//div[@id='container_tasks']")
	private WebElement TaskButton;
			
	@FindBy (xpath="//div[@id='container_reports']")
	private WebElement ReportsButton;	
	
	@FindBy (xpath="//a[@href='/ent/logout.do']")
	private WebElement logout;
	@FindBy (xpath="//a[@href='/ent/logout.do']")
	private WebElement logout;
	//private WebDriver driver ;
			
	public HomePage(WebDriver driver)
	{
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
			
	public void ClickOnTaskbutton()
	{
		TaskButton.click();
	}
	
	public void ClickOnReportsButton()
	{
		
		//WebDriverWait wait = new WebDriverWait(this.driver,10);
		//this.ReportsButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='container_reports']")));
//		Actions a = new Actions(this.driver);
//		a.moveToElement(ReportsButton).click().build().perform();
		ReportsButton.click();
	}
	
	public void clickOnLogout()
	{
		
		logout.click();
	}
	
}
