package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SingleEmployeeCreatePage {
	
WebDriver ldriver;
	
	public SingleEmployeeCreatePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	//1st Page
	@FindBy(xpath = "//*[@id=\"root\"]/section/aside/div/div/div[1]/div[2]/div[1]/ul/li[2]")
	WebElement imgEmployee;
	
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/main/main/main/div/div[2]/button/div")
	WebElement btnAdd;
	
	@FindBy(xpath = "/html/body/div[2]/div/div/ul/li[1]/span[2]")
	WebElement btnSingleUser;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[1]/div/input")
	WebElement txtPan;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[2]/div/input")
	WebElement txtPhonenumber;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[3]/div/input")
	WebElement txtEmail;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[4]/div/input")
	WebElement txtName;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[5]/div/input")
	WebElement txtEmpid;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[6]/div/div/div/input")
	WebElement clickDob;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div[1]/div[1]/div/button[2]")
	WebElement btnyear;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/div[1]/button[1]/span")
	WebElement btnbackward;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/div")
	WebElement btn2001;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div/div[2]/table/tbody/tr[1]/td[3]/div")
	WebElement btnMonth;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div/div[1]/div[2]/table/tbody/tr[2]/td[5]/div")
	WebElement btn08date;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[3]/button[2]/span")
	WebElement btnNext;
	
	//2nd Page
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[1]/div/div/div[2]/input")
	WebElement txtCtc;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[2]/div/div/div/span[2]")
	WebElement fieldEmpCont;
	
	@FindBy(xpath = "/html/body/div[4]/div/div/div/div[2]/div[1]/div/div/div[1]")
	WebElement btnYesCtc;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[3]/div/div/div/span[2]")
	WebElement fieldOptPf;
	
	@FindBy(xpath = "/html/body/div[5]/div/div/div/div[2]/div[1]/div/div/div[1]")
	WebElement btnYesPf;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[4]/div/div/div[2]/input")
	WebElement txtVpercnt;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[5]/div/div")
	WebElement fieldGroup;
	
	@FindBy(xpath = "/html/body/div[6]/div/div/div/div[2]/div[1]/div/div/div[1]/div")
	WebElement btnGeneral;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[6]/div/div")
	WebElement fieldDept;
	
	@FindBy(xpath = "/html/body/div[7]/div/div/div/div[2]/div[1]/div/div/div/div")
	WebElement btnDept1;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[7]/div/div")
	WebElement fieldDesgn;
	
	@FindBy(xpath = "/html/body/div[8]/div/div/div/div[2]/div[1]/div/div/div")
	WebElement btnD1;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[2]/div[8]/div/div")
	WebElement fieldLocation;
	
	@FindBy(xpath = "/html/body/div[9]/div/div/div/div[2]/div[1]/div/div/div")
	WebElement btnHo;
	
	@FindBy(xpath = "/html/body/div[3]/div/div[2]/div/div[2]/div/div/div/main/div/div[3]/button[2]/span")
	WebElement btnSubmit;
	
	
	//1st Page
	public void clickEmployeeImage()
	{
		imgEmployee.click();
	}
	
	public void clickAdd()
	{
		btnAdd.click();
	}
	
	public void clickSingleUser()
	{
		btnSingleUser.click();
	}
	
	public void setPan(String pan)
	{
		txtPan.sendKeys(pan);
	}
	
	public void setPhone(String Phone)
	{
		txtPhonenumber.sendKeys(Phone);
	}
	
	public void setEmail(String Email)
	{
		txtEmail.sendKeys(Email);
	}
	
	public void setName(String Name)
	{
		txtName.sendKeys(Name);
	}
	
	public void setEmpid(String Empid)
	{
		txtEmpid.sendKeys(Empid);
	}
	
	//DOB_set
	public void clickDOB()
	{
		clickDob.click();
	}
	public void clickYear()
	{
		btnyear.click();
	}
	
	public void clickBackward()
	{
		btnbackward.click();
	}
	
	public void click2001() 
	{
		btn2001.click();
	}
	public void clickMonth()
	{
		btnMonth.click();
	}
	
	public void click08Date()
	{
		btn08date.click();
	}
	
	public void clickNext()
	{
		btnNext.click();
	}
	
	//2ndPage
	public void setCtc(String ctc)
	{
		txtCtc.sendKeys(ctc);
	}
		
	public void clickfieldEmpCont()
	{
		fieldEmpCont.click();
	}
	
	public void clickYesCtc()
	{
		btnYesCtc.click();
	}
	
	public void clickfieldOptPf()
	{
		fieldOptPf.click();
	}
	
	public void clickYesPf()
	{
		btnYesPf.click();
	}
	
	public void setVpercnt(String vper)
	{
		txtVpercnt.sendKeys(vper);
	}
	
	public void clickfieldGroup()
	{
		fieldGroup.click();
	}
	
	public void clickGeneral()
	{
		btnGeneral.click();
	}
	
	public void clickfieldDept()
	{
		fieldDept.click();
	}
	
	public void clickDept1()
	{
		btnDept1.click();
	}
	
	public void clickfieldDesgn()
	{
		fieldDesgn.click();
	}
	
	public void clickD1()
	{
		btnD1.click();
	}
	
	public void clickfieldLocation()
	{
		fieldLocation.click();
	}
	
	public void clickHo()
	{
		btnHo.click();
	}
	
	public void clickSubmit()
	{
		btnSubmit.click();
	}
	
	
	
}
