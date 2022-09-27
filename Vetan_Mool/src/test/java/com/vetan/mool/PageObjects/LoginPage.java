package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	@CacheLookup
	WebElement txtUsername;
	
	public void settxtUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Continue')])[1]")
	@CacheLookup
	WebElement btnContinue;
	
	public void clickbtnContinue()
	{
		btnContinue.click();
	}
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	@CacheLookup
	WebElement txtPassword;
	
	public void settxtPassword(String pass)
	{
		txtPassword.sendKeys(pass);
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Sign In'])[1]")
	@CacheLookup
	WebElement btnSignin;
	
	public void clickbtnSignin()
	{
		btnSignin.click();
	}
	
}
