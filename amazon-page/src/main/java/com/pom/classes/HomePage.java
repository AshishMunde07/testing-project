package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy (xpath="//input[@id='twotabsearchtextbox']")
	private WebElement textbox;
	
	@FindBy (xpath="//input[@id='nav-search-submit-button']")
	private WebElement submit;
	
	
	public HomePage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void SendKeys(String search)
	{
		textbox.sendKeys(search);
	}
	
	public void clickOnButton()
	{
		submit.click();
	}
	
	
}
