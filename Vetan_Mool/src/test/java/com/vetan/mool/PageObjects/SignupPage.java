package com.vetan.mool.PageObjects;

import org.asynchttpclient.AsyncHandler.State;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
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
	
	@FindBy(xpath = "(//input[contains(@placeholder,'')])[1]")
	@CacheLookup
	WebElement txtOrgName;

	public void settxtOrgName(String orgName)
	{
		txtOrgName.sendKeys(orgName);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[2]")
	@CacheLookup
	WebElement txtGSTIN;
	
	public void settxtGSTIN(String GSTIN)
	{
		txtGSTIN.sendKeys(GSTIN);
	}

	@FindBy(xpath = "(//input[@type='email'])[1]")
	@CacheLookup
	WebElement txtEmail;

	public void settxtEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[4]")
	@CacheLookup
	WebElement txtPOC;

	public void settxtPOC(String POC)
	{
		txtPOC.sendKeys(POC);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[5]")
	@CacheLookup
	WebElement txtDesignation;

	public void settxtDesignation(String Designation)
	{
		txtDesignation.sendKeys(Designation);
	}

	@FindBy(xpath = "(//input[@role='spinbutton'])[1]")
	@CacheLookup
	WebElement txtPhoneNumber;

	public void settxtPhoneNumber(String PhoneNumber)
	{
		txtPhoneNumber.sendKeys(PhoneNumber);
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	@CacheLookup
	WebElement btnTermsConditionCheckbox;

	public void clickbtnTermsConditionCheckbox()
	{
		btnTermsConditionCheckbox.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Register Now')])[1]")
	@CacheLookup
	WebElement btnRegisterNow;

	public void clickbtnRegisterNow()
	{
		btnRegisterNow.click();
	}


	//Choose your Plan Page

	@FindBy(xpath = "(//div[contains(text(),'Monthly')])[1]")
	@CacheLookup
	WebElement btnMonthlyPlan;

	public void clickbtnMonthlyPlan()
	{
		btnMonthlyPlan.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Quarterly')])[1]")
	@CacheLookup
	WebElement btnQuarterlyPlan;

	public void clickbtnQuarterlyPlan()
	{
		btnQuarterlyPlan.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Yearly')])[1]")
	@CacheLookup
	WebElement btnYearlyPlan;

	public void clickbtnYearlyPlan()
	{
		btnYearlyPlan.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Select this plan')])[1]")
	@CacheLookup
	WebElement btnStaterPlan;

	public void clickbtnStaterPlan()
	{
		btnStaterPlan.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Select this plan')])[2]")
	@CacheLookup
	WebElement btnStandardPlan;

	public void clickbtnStandardPlan()
	{
		btnStandardPlan.click();
	}

	@FindBy(xpath = "(//*[name()='svg'])[1]")
	@CacheLookup
	WebElement btnCoreHR;

	public void clickbtnCoreHR()
	{
		btnCoreHR.click();
	}

	//Order Summary Page

	@FindBy(xpath = "(//input[@value='1'])[1]")
	@CacheLookup
	WebElement txtEmployeeCount;

	public void settxtEmployeeCount(String EmployeeCount)
	{
		txtEmployeeCount.sendKeys(EmployeeCount);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[2]")
	@CacheLookup
	WebElement txtAddressline1;

	public void setxtAddressLine1(String Address1)
	{
		txtAddressline1.sendKeys(Address1);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[3]")
	@CacheLookup
	WebElement txtAddressLine2;

	public void settxtAddressLine2(String Address2)
	{
		txtAddressLine2.sendKeys(Address2);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[4]")
	@CacheLookup
	WebElement txtState;

	public void settxtState(String State)
	{
		txtState.sendKeys(State);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[5]")
	@CacheLookup
	WebElement txtCity;

	public void settxtCity(String City)
	{
		txtCity.sendKeys(City);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[6]")
	@CacheLookup
	WebElement txtPincode;

	public void settxtPincode(String Pincode)
	{
		txtPincode.sendKeys(Pincode);
	}

	@FindBy(xpath = "(//input[contains(@placeholder,'')])[7]")
	@CacheLookup
	WebElement txtCouponCode;

	public void settxtCouponCode(String CouponCode)
	{
		txtCouponCode.sendKeys(CouponCode);
	}

	@FindBy(xpath = "(//div[contains(text(),'Apply')])[1]")
	@CacheLookup
	WebElement btnApplyCoupon;

	public void clickbtnApplyCoupon()
	{
		btnApplyCoupon.click();
	}

	@FindBy(xpath = "(//div[contains(text(),'Make Payment')])[1]")
	@CacheLookup
	WebElement btnMakePayment;

	public void clickbtnMakePayment()
	{
		btnMakePayment.click();
	}

	

	
}
