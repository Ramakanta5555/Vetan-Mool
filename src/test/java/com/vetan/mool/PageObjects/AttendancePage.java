package com.vetan.mool.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AttendancePage {
	
WebDriver ldriver;
	
	public AttendancePage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	
	@FindBy(xpath ="//*[@id=\"root\"]/section/aside/div/div/div[1]/div[2]/div[1]/ul/li[6]")
	WebElement btnNavAttendance;
	
	public void clickbtnNavAttendance()
	{
		btnNavAttendance.click();
	}
	
	
	//Holiday Setting
	@FindBy(xpath = "//*[@id=\"rc-tabs-0-panel-1\"]/div/div/div[1]/div[2]/div/div/span[2]")
	WebElement btnHolidayCalender;
	
	public void clickbtnHolidayCalender()
	{
		btnHolidayCalender.click();
	}
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[1]/div/div/div[4]/div")
	WebElement btnCal2020;
	
	public void clickbtnCal2020()
	{
		btnCal2020.click();
	}
	
	@FindBy(xpath = "/html/body/div[2]/div/div/div/div[2]/div[1]/div/div/div[6]")
	WebElement btnCal2022;
	
	public void clickbtnCal2022()
	{
		btnCal2022.click();
	}
	
	@FindBy(xpath = "//*[@id=\"rc-tabs-0-panel-1\"]/div/div/div[2]/div[2]/button/div/div")
	WebElement btnHolidayAddNew;
	
	public void clickbtnHolidayAddNew()
	{
		btnHolidayAddNew.click();
	}
	
	@FindBy(xpath = "//input[contains(@class,'input-field-container input-field-undefined undefined')]")
	WebElement txtHolidayName;
	
	public void settxtHolidayName(String Hname)
	{
		txtHolidayName.sendKeys(Hname);
	}
	
	@FindBy(xpath = "(//input[@placeholder='Select date'])[1]")
	WebElement btnHolidayDate;
	
	public void clickbtnHolidayDate()
	{
		btnHolidayDate.click();
	}
	
	
	@FindBy(xpath = "(//div[@class='ant-picker-cell-inner'][normalize-space()='8'])[1]")
	WebElement btnHolidayDate04;
	
	public void clickbtnHolidayDate04()
	{
		btnHolidayDate04.click();
	}
	
	@FindBy(xpath = "(//input[@id='rc_select_2'])[1]")
	WebElement btnHolidayType;
	
	public void clickbtnHolidayType()
	{
		btnHolidayType.click();
	}
	
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Company'])[1]")
	WebElement btnHolidayCompany;
	
	public void clickbtnHolidayCompany()
	{
		btnHolidayCompany.click();
	}
	
	@FindBy(xpath = "/html/body/div[7]/div/div/div/div[2]/div[1]/div/div/div[2]/div")
	WebElement btnHolidayRegional;
	
	public void clickbtnHolidayRegional()
	{
		btnHolidayRegional.click();
	}
	
	@FindBy(xpath = "/html/body/div[7]/div/div/div/div[2]/div[1]/div/div/div[1]/div")
	WebElement btnHolidayNational;
	
	public void clickbtnHolidayNational()
	{
		btnHolidayNational.click();
	}
	
	@FindBy(xpath = "(//button[@class=' button-lib button-type-13'])[1]")
	WebElement btnHolidaySubmit;
	
	public void clickbtnHolidaySubmit()
	{
		btnHolidaySubmit.click();
	}
	
	
	@FindBy(xpath = "(//img[@alt='pri-icon'])[5]")
	WebElement btnHolidayDelete;
	
	public void clickbtnHolidayDelete()
	{
		btnHolidayDelete.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Delete')])[1]")
	WebElement btnHolidayConfirmDelete;
	
	public void clickbtnHolidayConfirmDelete()
	{
		btnHolidayConfirmDelete.click();
	}
	
	
	//Leave
	@FindBy(xpath = "//*[@id=\"root\"]/section/section/div/div/div/div/div[1]/div[1]/div/div[2]")
	WebElement btnLeaveSeting;
	
	public void clickbtnLeaveSetting()
	{
		btnLeaveSeting.click();
	}
	
	@FindBy(xpath = "//*[@id=\"rc-tabs-0-panel-2\"]/div/div/div[2]/div[2]/button/div/div")
	WebElement btnLeaveAdd;
	
	public void clickbtnLeaveAdd()
	{
		btnLeaveAdd.click();
	}
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div[1]/input")
	WebElement txtLeaveName;
	
	public void settxtLeaveName(String Lname)
	{
		txtLeaveName.sendKeys(Lname);
	}
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/div/div[2]/div/div/div/div[2]/input")
	WebElement txtLeaveDescription;
	
	public void settxtLeaveDescription(String Ldes)
	{
		txtLeaveDescription.sendKeys(Ldes);
	}
	
	@FindBy(xpath = "(//input[@value='0'])[1]")
	WebElement txtLeaveBalance;
	
	public void settxtLeaveBalance(String Lbal)
	{
		txtLeaveBalance.sendKeys(Lbal);
	}
	
	//Leave Frequency
	@FindBy(xpath = "//span[@title='Yearly']")
	WebElement btnLeaveCreditFrequency;
	
	public void clickbtnLeaveCreditFrequency()
	{
		btnLeaveCreditFrequency.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Half Yearly')])[1]")
	WebElement btnLeaveHalfYearly;
	
	public void clickbtnLeaveHalfYearly()
	{
		btnLeaveHalfYearly.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Quarterly')])[1]")
	WebElement btnLeaveQuaterly;
	
	public void clickbtnLeaveQuaterly()
	{
		btnLeaveQuaterly.click();
	}
	
	@FindBy(xpath = "/html/body/div[10]/div/div/div/div[2]/div[1]/div/div/div[4]")
	WebElement btnLeaveMonthly;
	
	public void clickbtnLeaveMonthly()
	{
		btnLeaveMonthly.click();
	}
	
	@FindBy(xpath = "(//input[contains(@value,'true')])[1]")
	WebElement btnRadioYesLeaveEncashable;
	
	public void clickbtnRadioYesLeaveEncashable()
	{
		btnRadioYesLeaveEncashable.click();
	}
	
	@FindBy(xpath = "(//input[contains(@value,'false')])[1]")
	WebElement btnRadioNoLeaveForwarNextYear;
	
	public void clickbtnRadioNoLeaveForwarNextYear()
	{
		btnRadioNoLeaveForwarNextYear.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]")
	WebElement btnLeaveSubmit;
	
	public void clickbtnLeaveSubmit()
	{
		btnLeaveSubmit.click();
	}
	
	@FindBy(xpath = "(//img[contains(@alt,'pri-icon')])[12]")
	WebElement btnLeaveDelete;
	
	public void clickbtnLeaveDelete()
	{
		btnLeaveDelete.click();
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Delete'])[1]")
	WebElement btnLeaveConfirmDelete;
	
	public void clickbtnLeaveConfirmDelete()
	{
		btnLeaveConfirmDelete.click();
	}
	
	//Weekly Off Setting
	@FindBy(xpath = "//div[@id='rc-tabs-0-tab-3']")
	WebElement btnWeeklyOffSetting;
	
	public void clickbtnWeeklyOffSetting()
	{
		btnWeeklyOffSetting.click();
	}
	
	@FindBy(xpath = "//div[@id='rc-tabs-0-panel-3']//div[contains(text(),'Add New')]")
	WebElement btnAddNewWeeklyOff;
	
	public void clickbtnAddNewWeeklyOff()
	{
		btnAddNewWeeklyOff.click();
	}
	
	@FindBy(xpath = "(//input[@placeholder=' '])[1]")
	WebElement txtWeeklyOffName;
	
	public void settxtWeeklyOffName(String wName)
	{
		txtWeeklyOffName.sendKeys(wName);
	}
	
	@FindBy(xpath = "(//span)[62]")
	WebElement btnWeeklyOffGroup;
	
	public void clickbtnWeeklyOffGroup()
	{
		btnWeeklyOffGroup.click();
	}
	
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Group A'])[1]")
	WebElement btnGroupA;
	
	public void clickbtnGroupA()
	{
		btnGroupA.click();
	}
	
	@FindBy(xpath = "(//span[@class='ant-select-selection-item'])[4]")
	WebElement btnWeeklyOffOne;
	
	public void clickbtnWeeklyOffOne()
	{
		btnWeeklyOffOne.click();
	}
	
	@FindBy(xpath = "(//div[@title='Tue'])[1]")
	WebElement btnWeeklyOffOneTuesday;
	
	public void clickbtnWeeklyOffOneTuesday()
	{
		btnWeeklyOffOneTuesday.click();
	}
	
	@FindBy(xpath = "(//input[@id='rc_select_4'])[1]")
	WebElement btnWeeklyOffTwo;
	
	public void clickbtnWeeklyOffTwo()
	{
		btnWeeklyOffTwo.click();
	}
	
	@FindBy(xpath = "(//div[@class='ant-select-item-option-content'][normalize-space()='Wed'])[2]")
	WebElement btnWeeklyOffTwoWednesday;
	
	public void clickbtnWeeklyOffTwoWednesday()
	{
		btnWeeklyOffTwoWednesday.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Submit')])[1]")
	WebElement btnWeeklyOffSubmit;
	
	public void clickbtnWeeklyOffSubmit()
	{
		btnWeeklyOffSubmit.click();
	}
	
	@FindBy(xpath = "(//img[@alt='pri-icon'])[10]")
	WebElement btnWeeklyOffDelete;
	
	public void clickbtnWeeklyOffDelete()
	{
		btnWeeklyOffDelete.click();
	}
	
	@FindBy(xpath = "(//div[contains(text(),'Delete')])[1]")
	WebElement btnWeeklyOffConfirmDelete;
	
	public void clickbtnWeeklyOffConfirmDelete()
	{
		btnWeeklyOffConfirmDelete.click();
	}
	
	//Attendance Section
	
	@FindBy(xpath = "(//a[@href='/org/attendance/attendance'])[1]")
	WebElement btnAttendance;
	
	public void clickbtnAttendance()
	{
		btnAttendance.click();
	}
	
	//Daily Attendance
	
	@FindBy(xpath = "(//div[@id='rc-tabs-1-tab-1'])[1]")
	WebElement btnDailyAttendance;
	
	public void clickbtnDailyAttendance()
	{
		btnDailyAttendance.click();
	}

	@FindBy(xpath = "(//span[normalize-space()='Download PDF'])[1]")
	@CacheLookup
	WebElement btnAttendanceDownloadPdf;

	public void clickbtnAttendanceDownloadPdf()
	{
		btnAttendanceDownloadPdf.click();
	}

	@FindBy(xpath = "(//div[@id='rc-tabs-1-tab-2'])[1]")
	@CacheLookup
	WebElement btnAttendancereport;

	public void clickbtnAttendanceReport()
	{
		btnAttendancereport.click();
	}

	@FindBy(xpath = "(//span[contains(text(),'Download PDF')])[2]")
	@CacheLookup
	WebElement btnAttendanceReportDownloadPdf;

	public void clickbtnAttendanceReportDownloadPdf()
	{
		btnAttendanceReportDownloadPdf.click();
	}

	@FindBy(xpath = "(//a[@href='/org/attendance/leave'])[1]")
	@CacheLookup
	WebElement btnLeave;

	public void clickbtnLeave()
	{
		btnLeave.click();
	}

	


	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
