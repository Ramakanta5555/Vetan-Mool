package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayRollPage {
	
	WebDriver ldriver;
	
	public PayRollPage (WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath= "//*[@id=\"root\"]/section/aside/div/div/div[1]/div[2]/div[1]/ul/li[3]/span/img")
	WebElement btnPayroll;
	
	@FindBy(xpath = "(//h3[normalize-space()='Payroll for July'])[1]")
	WebElement btnPayrolljune;
	
	@FindBy(xpath = "//*[@id=\"rc-tabs-0-panel-1\"]/div/main/div[1]/div/button[2]/div/div")
	WebElement btnRunPayRoll;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/main/div[2]/div/div[2]/div/div/div[2]/div/div/div/div/div/div[1]/table/thead/tr/th[1]/div/label/span/input")
	WebElement btnCheckBox;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/main/div[2]/div/div[2]/div/div/div[3]/button/div/div")
	WebElement btnRunPayRoll1;
	
	@FindBy(xpath = "//*[@id=\"rc-tabs-0-panel-1\"]/div/main/div[1]/div/a")
	WebElement btnDownloadcsv;
	
	@FindBy(xpath = "//*[@id=\"rc-tabs-0-panel-1\"]/div/main/div[2]/div/div/ul/li[3]/a")
	WebElement btn2ndpage;
	
	public void clickbtnPayroll()
	{
		btnPayroll.click();
	}
	
	public void clickbtnPayrolljune()
	{
		btnPayrolljune.click();
	}
	
	public void clickbtnRunPayRoll()
	{
		btnRunPayRoll.click();
	}
	
	public void clickbtnCheckBox()
	{
		btnCheckBox.click();
	}
	
	public void clickbtnRunPayRoll1()
	{
		btnRunPayRoll1.click();
	}
	
	public void clickbtnDownloadcsv()
	{
		btnDownloadcsv.click();
	}
	
	public void clickbtn2ndpage()
	{
		btn2ndpage.click();
	}
}
