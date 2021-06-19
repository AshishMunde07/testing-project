package com.pom.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonPage {


	@FindBy (xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
	private WebElement elementonpage;
	
	
	public AmazonPage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		
	}
	
	public String gettext()
	{
		return elementonpage.getText();
	}
	
	
	
}
