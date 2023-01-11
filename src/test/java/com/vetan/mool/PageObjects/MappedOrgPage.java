package com.vetan.mool.PageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MappedOrgPage {
	
	
	WebDriver ldriver;
	
	public MappedOrgPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/aside/div/div/div[2]/div[2]/ul/li[2]/span/a")
	WebElement btnMappOrg;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/div/div/div[1]/button/div/div")
	WebElement btnCreateOrg;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[1]/div/input")
	WebElement txtUsername;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[3]/div/input")
	WebElement txtPhoneNumber;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[4]/div/input")
	WebElement txtEmail;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[5]/div/span/input")
	WebElement txtPass;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[5]/div/span/span")
	WebElement btnEyePass;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[6]/div/span/input")
	WebElement txtCPass;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[6]/div/span/span/span")
	WebElement btnCEyeCPass;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[7]/div/input")
	WebElement txtClegalName;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[8]/div/input")
	WebElement txtOrgName;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[9]/div/input")
	WebElement txtPoc;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[10]/div/input")
	WebElement txtDesignation;
	
	@FindBy(xpath = "(//span[normalize-space()='Create Organisation'])[1]")
	WebElement btnCreateOrg1;
	
	public void clickbtnMappedOrg()
	{
		btnMappOrg.click();
	}
	
	public void clickbtnCreateOrg()
	{
		btnCreateOrg.click();
	}
	
	public void clicktxtUsername()
	{
		txtUsername.click();
	}
	public void settxtUsername(String uname)
	{
		txtUsername.sendKeys(uname);
	}
	
	public void settxtPhoneNumber(String phone)
	{
		txtPhoneNumber.sendKeys(phone);
	}
	
	public void settxtEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void settxtPass(String pass)
	{
		txtPass.sendKeys(pass);
	}
	
	public void clickbtnEyePass()
	{
		btnEyePass.click();
	}
	
	public void settxtCPass(String cpass)
	{
		txtCPass.sendKeys(cpass);
	}
	
	public void clickbtnCEyePass()
	{
		btnCEyeCPass.click();
	}
	
	public void settxtClegalName(String lname)
	{
		txtClegalName.sendKeys(lname);
	}
	
	public void settxtOrgName(String oname)
	{
		txtOrgName.sendKeys(oname);
	}
	
	public void settxtPoc(String poc)
	{
		txtPoc.sendKeys(poc);
	}
	
	public void settxtDesignation(String dsgn)
	{
		txtDesignation.sendKeys(dsgn);
	}
	
	public void goDown()
	{
		txtDesignation.sendKeys(Keys.TAB);
	}
	
	public void clickbtnCreateOrg1()
	{
		btnCreateOrg1.click();
	}
	
	
}
