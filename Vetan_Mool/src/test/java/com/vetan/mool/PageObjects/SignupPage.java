package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

WebDriver ldriver;
	
	public SignupPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "(//a[normalize-space()='New organisation? create account'])[1]")
	WebElement btnNewOrgCreateAccount;
	
	public void clickbtnNewOrgCreateAccount()
	{
		btnNewOrgCreateAccount.click();
	}
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	WebElement txtOrgName;
	
	public void settxtOrgName(String oName)
	{
		txtOrgName.sendKeys(oName);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	WebElement txtOrgPan;
	
	public void settxtOrgPan(String oPan)
	{
		txtOrgPan.sendKeys(oPan);
	}
	
	@FindBy(xpath = "(//input[@type='email'])[1]")
	WebElement txtOrgEmail;
	
	public void settxtOrgEmail(String oEmail)
	{
		txtOrgEmail.sendKeys(oEmail);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[3]")
	WebElement txtOrgPocName;
	
	public void settxtOrgPocName(String oPoc)
	{
		txtOrgPocName.sendKeys(oPoc);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement txtOrgDesignation;
	
	public void settxtOrgDesignation(String oDes)
	{
		txtOrgDesignation.sendKeys(oDes);
	}
	
	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement txtOrgPhone;
	
	public void settxtOrgPhone(String oPhone)
	{
		txtOrgPhone.sendKeys(oPhone);
	}
	
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	WebElement btnAcceptTerms;
	
	public void clickbtnAcceptTerm()
	{
		btnAcceptTerms.click();
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Create an Account'])[1]")
	WebElement btnCreateAccount;
	
	public void clickbtnCreateAccount()
	{
		btnCreateAccount.click();
	}
	
	
}
