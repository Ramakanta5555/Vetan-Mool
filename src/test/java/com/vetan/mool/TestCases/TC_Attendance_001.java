package com.vetan.mool.TestCases;

import org.testng.annotations.Test;
// import org.testng.Assert;
import com.vetan.mool.PageObjects.AttendancePage;
import com.vetan.mool.PageObjects.LoginPage;

public class TC_Attendance_001 extends BaseClass{
	
	@Test
	public void AttendanceTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);		
		
		AttendancePage ap = new AttendancePage(BaseClass.driver);
		Thread.sleep(2000);
		
		
		//Login
		
		login();
		Thread.sleep(4000);
		
		//Holiday Setting
		
//		ap.clickbtnHolidayCalender();
//		Thread.sleep(2000);
//		
//		ap.clickbtnCal2020();
//		Thread.sleep(2000);
//		
//		ap.clickbtnHolidayCalender();
//		Thread.sleep(2000);
//		
//		ap.clickbtnCal2022();
//		Thread.sleep(2000);
//		
//		ap.clickbtnHolidayAddNew();
//		Thread.sleep(2000);
//		
//		ap.settxtHolidayName("Selenium_Holiday");
//		Thread.sleep(2000);
//		
//		ap.clickbtnHolidayDate();
//		Thread.sleep(2000);
//			
//		ap.clickbtnHolidayDate04();
//		Thread.sleep(2000);
//		
//		ap.clickbtnHolidayType();
//		Thread.sleep(2000);
//		
//		ap.clickbtnHolidayCompany();
//		Thread.sleep(2000);
//		
//		ap.clickbtnHolidaySubmit();
//		Thread.sleep(2000);
//		
//		if(driver.getPageSource().contains("Selenium_Holiday"))
//		{
//			
//			Assert.assertTrue(true);
//			System.out.println("HoliDay created successfully");
//		}
//		else
//		{
//			Assert.assertTrue(false);
//			System.out.println("Holiday has been deleted");
//		}
//		
//		ap.clickbtnHolidayDelete();
//		Thread.sleep(2000);
//		
//		ap.clickbtnHolidayConfirmDelete();
//		Thread.sleep(5000);
//		
//		if(driver.getPageSource().contains("Selenium_Holiday"))
//		{
//			Assert.assertTrue(false);
//			System.out.println("Error");
//		}
//		else
//		{
//			Assert.assertTrue(true);
//			System.out.println("Holiday has been deleted");
//		}
		
		
		//Leave
		
//		ap.clickbtnLeaveSetting();
//		Thread.sleep(2000);
//		
//		ap.clickbtnLeaveAdd();
//		Thread.sleep(2000);
//		
//		ap.settxtLeaveName("Selenium_Leave");
//		Thread.sleep(2000);
//		
//		ap.settxtLeaveDescription("Test");
//		Thread.sleep(2000);
//		
//		ap.settxtLeaveBalance("5");
//		Thread.sleep(2000);
//		
//		ap.clickbtnLeaveCreditFrequency();
//		Thread.sleep(2000);
//		
//		ap.clickbtnLeaveHalfYearly();
//		Thread.sleep(2000);
//		
//		ap.clickbtnRadioYesLeaveEncashable();
//		Thread.sleep(2000);
//		
//		ap.clickbtnRadioNoLeaveForwarNextYear();
//		Thread.sleep(2000);
//		
//		ap.clickbtnLeaveSubmit();
//		Thread.sleep(2000);
//		
//		if(driver.getPageSource().contains("Selenium_Leave"))
//		{
//			Assert.assertTrue(true);
//			System.out.println("New Leave Created Successfully");
//		}
//		else
//		{
//			Assert.assertTrue(false);
//			System.out.println("Error");
//		}
//		
//		ap.clickbtnLeaveDelete();
//		Thread.sleep(2000);
//		
//		ap.clickbtnLeaveConfirmDelete();
//		Thread.sleep(2000);
//		
//		if(driver.getPageSource().contains("Selenium_Leave"))
//		{
//			Assert.assertTrue(false);
//			System.out.println("Error");
//		}
//		else
//		{
//			Assert.assertTrue(true);
//			System.out.println("Leave Deleted Successfully");
//		}
		
		
		//Weekly Off Setting
		
		// ap.clickbtnWeeklyOffSetting();
		// Thread.sleep(7000);
		
		// ap.clickbtnAddNewWeeklyOff();
		// Thread.sleep(2000);
		
		// ap.settxtWeeklyOffName("Selenium_Weeklyoff");
		// Thread.sleep(2000);
		
		// ap.clickbtnWeeklyOffGroup();
		// Thread.sleep(2000);
		
		// ap.clickbtnGroupA();
		// Thread.sleep(2000);
		
		// ap.clickbtnWeeklyOffOne();
		// Thread.sleep(2000);
		
		// ap.clickbtnWeeklyOffOneTuesday();
		// Thread.sleep(2000);
		
		// ap.clickbtnWeeklyOffTwo();
		// Thread.sleep(2000);
		
		// ap.clickbtnWeeklyOffTwoWednesday();
		// Thread.sleep(2000);
		
		// ap.clickbtnWeeklyOffSubmit();
		// Thread.sleep(2000);

		// if(driver.getTitle().contains("Selenium_WeeklyOff") )
		// {
		// 	logger.info("WeeklyOff created");
		// 	ap.clickbtnWeeklyOffDelete();
		// 	Thread.sleep(2000);
		
		// 	ap.clickbtnWeeklyOffConfirmDelete();
		// 	Thread.sleep(2000);
		// 	Assert.assertTrue(true);
		
		// }

		// else 
		// {
		// 	logger.info("Failed to create WeeklyOff");
		// 	Assert.assertTrue(false);
		// }


		
		//Attendance Section
		
		ap.clickbtnAttendance();
		Thread.sleep(2000);

		ap.clickbtnDailyAttendance();
		Thread.sleep(2000);

		ap.clickbtnAttendanceDownloadPdf();
		Thread.sleep(2000);


		
		
		
		
		
		
	}
}
