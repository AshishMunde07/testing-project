package pom.classes;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import excelpropertyclass.ExcelFiles;


public class LoginPage {

	

	
	@FindBy (xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy (xpath="(//input[@type='password'])[1]")
	private WebElement password;
	
	
	@FindBy (xpath="//a[@id='loginButton']")
	private WebElement loginbutton;
	
	
	public LoginPage(WebDriver driver){
		
		
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(int a, int b) throws EncryptedDocumentException, IOException
	{
		
		username.sendKeys(ExcelFiles.Stringdata(a, b));
	}
	
	public void enterPassword(int a, int b) throws EncryptedDocumentException, IOException
	{
		
		password.sendKeys(ExcelFiles.Stringdata(a, b));
	}
	public void ClickonLogin()
	{
		loginbutton.click();
	}
	
	
	
	
	
	
}
