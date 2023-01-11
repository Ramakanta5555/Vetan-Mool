package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganisationProfilePage {
	
	WebDriver ldriver;
	
	public OrganisationProfilePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath = "(//img[@class='user-logo'])[1]")
	@CacheLookup
	WebElement btnProfileImage;
	
	public void clickbtnProfileImage()
	{
		btnProfileImage.click();
	}
	
	@FindBy(xpath = "(//span[@class='menu-text'][normalize-space()='Profile'])[1]")
	@CacheLookup
	WebElement btnProfile;
	
	public void clickbtnProfile()
	{
		btnProfile.click();
	}
	
	
	@FindBy(xpath = "(//span[@class='flex align-center justify-start action-item'])[2]")
	@CacheLookup
	WebElement btnSupport;
	
	public void clickbtnSupport()
	{
		btnSupport.click();
	}
	
	@FindBy(xpath = "(//span[@class='menu-text'][normalize-space()='Logout'])[1]")
	@CacheLookup
	WebElement btnLogout;
	
	public void clickbtnLogout()
	{
		btnLogout.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Edit')])[1]")
	@CacheLookup
	WebElement btnEdit;
	
	public void clickbtnEdit()
	{
		btnEdit.click();
	}
	
	@FindBy(xpath = "(//input[@name='organisationName'])[1]")
	@CacheLookup
	WebElement txtOrgName;
	
	public void cleartxtOrgName()
	{
		txtOrgName.clear();
	}
	
	public void settxtOrgName(String oName)
	{
		txtOrgName.sendKeys(oName);;
	}
	
	@FindBy(xpath = "(//input[@name='displayName'])[1]")
	@CacheLookup
	WebElement txtOrgDisplayName;
	
	public void cleartxtOrgDisplayName()
	{
		txtOrgDisplayName.clear();
	}
	
	public void settxtOrgDisplayName(String oDname)
	{
		txtOrgDisplayName.sendKeys(oDname);
	}
	
	@FindBy(xpath = "(//input[@name='organisationCode'])[1]")
	@CacheLookup
	WebElement txtOrgCode;
	
	public void cleartxtOrgCode()
	{
		txtOrgCode.clear();
	}
	
	public void settxtOrgCode(String oCode)
	{
		txtOrgCode.sendKeys(oCode);
	}
	
	@FindBy(xpath = "(//input[@name='pointOfContact'])[1]")
	@CacheLookup
	WebElement txtPocName;
	
	public void cleartxtPocName()
	{
		txtPocName.clear();
	}
	
	public void settxtPocName(String pName)
	{
		txtPocName.sendKeys(pName);
	}
	
	@FindBy(xpath = "(//input[@name='designation'])[1]")
	@CacheLookup
	WebElement txtPocDesignation;
	
	public void cleartxtPocDesignation()
	{
		txtPocDesignation.clear();
	}
	
	public void settxtPocDesignation(String pDesgn)
	{
		txtPocDesignation.sendKeys(pDesgn);
	}
	
	@FindBy(xpath = "(//input[@name='addressLine1'])[1]")
	@CacheLookup
	WebElement txtOrgAddress;
	
	public void cleartxtOrgAddress()
	{
		txtOrgAddress.clear();
	}
	
	public void settxtOrgAddress(String oAdd)
	{
		txtOrgAddress.sendKeys(oAdd);
	}
	
	@FindBy(xpath = "(//input[@name='landmark'])[1]")
	@CacheLookup
	WebElement txtOrgLandMark;
	
	public void cleartxtOrgLandMark()
	{
		txtOrgLandMark.clear();
	}
	
	public void settxtOrgLandMark(String oLandmark)
	{
		txtOrgLandMark.sendKeys(oLandmark);
	}
	
	@FindBy(xpath = "(//input[@name='city'])[1]")
	@CacheLookup
	WebElement txtOrgCity;
	
	public void cleartxtOrgCity()
	{
		txtOrgCity.clear();
	}
	
	public void settxtOrgCity(String oCity)
	{
		txtOrgCity.sendKeys(oCity);
	}
	
	@FindBy(xpath = "(//input[@name='state'])[1]")
	@CacheLookup
	WebElement txtOrgState;
	
	public void cleartxtOrgState()
	{
		txtOrgState.clear();
	}
	
	public void settxtOrgState(String oState)
	{
		txtOrgState.sendKeys(oState);
	}
	
	@FindBy(xpath = "(//input[@name='country'])[1]")
	@CacheLookup
	WebElement txtOrgCountry;
	
	public void cleartxtOrgCountry()
	{
		txtOrgCountry.clear();
	}
	
	public void settxtOrgCountry(String oCountry)
	{
		txtOrgCountry.sendKeys(oCountry);
	}
	
	@FindBy(xpath = "(//input[@name='pincode'])[1]")
	@CacheLookup
	WebElement txtOrgPin;
	
	public void cleartxtOrgPin()
	{
		txtOrgPin.clear();
	}
	
	public void settxtOrgPin(String oPin)
	{
		txtOrgPin.sendKeys(oPin);
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Save Changes')])[1]")
	@CacheLookup
	WebElement btnSaveChanges;
	
	public void clickbtnSaveChanges()
	{
		btnSaveChanges.click();	
	}
	
	
	//Password Change
	
	@FindBy(xpath = "(//span[normalize-space()='Change password'])[1]")
	@CacheLookup
	WebElement btnChangePasswordLink;
	
	public void clickbtnChangePaswordLink()
	{
		btnChangePasswordLink.click();
	}
	
	@FindBy(xpath = "(//input[@name='oldPassword'])[1]")
	@CacheLookup
	WebElement txtOldPass;
	
	public void settxtOldPass(String oPass)
	{
		txtOldPass.sendKeys(oPass);
	}
	
	@FindBy(xpath = "(//input[@name='newPassword'])[1]")
	@CacheLookup
	WebElement txtNewPass;
	
	public void settxtNewPass(String nPass)
	{
		txtNewPass.sendKeys(nPass);
	}
	
	@FindBy(xpath = "(//input[@name='confirmPassword'])[1]")
	@CacheLookup
	WebElement txtConfirmPass;
	
	public void settxtConfirmPass(String cPass)
	{
		txtConfirmPass.sendKeys(cPass);
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Change Password')])[1]")
	@CacheLookup
	WebElement btnChangePassword;
	
	public void clickbtnChangePassword()
	{
		btnChangePassword.click();
	}
}
