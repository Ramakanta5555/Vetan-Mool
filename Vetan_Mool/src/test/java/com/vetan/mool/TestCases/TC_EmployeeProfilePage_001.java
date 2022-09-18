package com.vetan.mool.TestCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import com.vetan.mool.PageObjects.EmployeeProfilePage;
import com.vetan.mool.PageObjects.LoginPage;

public class TC_EmployeeProfilePage_001 extends BaseClass {
	
	@Test
	public void EmployeeProfilePageTest() throws InterruptedException
	{
		driver.manage().window().maximize();
		
		LoginPage lp = new LoginPage(BaseClass.driver);
		Thread.sleep(2000);
		
		EmployeeProfilePage epp = new EmployeeProfilePage(BaseClass.driver); 
		Thread.sleep(2000);
		
		//Login 
		
	
		lp.settxtUsername(userName);
		
		lp.clickbtnContinue();
		Thread.sleep(2000);
		
		lp.settxtPassword(password);
		Thread.sleep(2000);
		
		lp.clickbtnSignin();
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		Thread.sleep(5000);

		epp.clickbtnEmployee();
		Thread.sleep(2000);
		
		//Update Pay Structure 

		
//		epp.clickbtnUpdatePayStructure();
//		Thread.sleep(2000);
//		
//		epp.cleartxtPerBasic();
//		Thread.sleep(2000);
//		
//		epp.cleartxtPerBasic();
//		Thread.sleep(2000);
//		
//		epp.settxtPerBasic("50");
//		Thread.sleep(2000);
//		
//		epp.cleartxtPerHra();
//		Thread.sleep(2000);
//		
//		epp.cleartxtPerHra();
//		Thread.sleep(2000);
//		
//		epp.settxtPerHra("29");
//		Thread.sleep(5000);
//		
//		epp.clickbtnFoodAmountCheckBox();
//		Thread.sleep(2000);
//		
//		epp.cleartxtFoodPMonth();
//		Thread.sleep(2000);
//		
//		epp.settxtFoodPMonth("2120");
//		Thread.sleep(2000);
//		
//		epp.clickbtnMobileAmountCheckBox();
//		Thread.sleep(2000);
//		
//		epp.cleartxtMobilePMonth();
//		Thread.sleep(2000);
//		
//		epp.settxtFoodPMonth("1500");
//		Thread.sleep(2000);
//		
//		epp.clickbtnSubmitPayStructure();
//		Thread.sleep(2000);
//		
//		//EditCredentials
//		
//		epp.clickbtnEditCredentials();
//		Thread.sleep(2000);
//		
//		for (int i = 0; i < 10; i++)
//		{
//			epp.cleartxtECPan();
//		} 
//		Thread.sleep(2000);
//		
//		epp.settxtECPan("OOLSP598S");
//		Thread.sleep(2000);
//		
//		for (int i = 0; i < 10; i++)
//		{
//			epp.cleartxtECPhone();
//		}
//		Thread.sleep(2000);
//		
//		epp.settxtECPhone("5669855423");
//		Thread.sleep(2000);
//		
//		for (int i = 0; i < 16; i++)
//		{
//			epp.cleartxtECEmail();
//		}
//		Thread.sleep(2000);
//		
//		epp.settxttxtECEmail("ksidh@yahoo.com");
//		Thread.sleep(2000);
//		
//		epp.clickbtnECUpdate();
//		Thread.sleep(2000);
		
		//Change Password
		
//		epp.clickbtnChangePassword();
//		Thread.sleep(2000);
//		
//		epp.settxtPassword(password);
//		Thread.sleep(2000);
//		
//		epp.clickbtnEyeBtn();
//		Thread.sleep(2000);
//		
//		epp.settxtConfirmPassword(password);
//		Thread.sleep(2000);
//		
//		epp.clickbtnEyeBtn1();
//		Thread.sleep(2000);
//		
//		epp.clickbtnPassSubmit();
//		Thread.sleep(2000);
//		
//		if(driver.getPageSource().contains("Successfully updated the employee password"))
//		{
//			Assert.assertTrue(true);
//			System.out.println("Password changed");
//		}
//		else
//		{
//			Assert.assertTrue(false);
//			System.out.println("Unable to change the password");
//		}
		
		//View
		
		epp.clickbtnView();
		Thread.sleep(5000);
		
		epp.clickbtnPersonalInfoEdit();
		Thread.sleep(2000);
		
		epp.cleartxtPhoneNumber();
		Thread.sleep(2000);
		
		epp.settxtPhoneNumber("8888888888");
		Thread.sleep(2000);
		
		epp.clickbtnDAteOfBirth();
		Thread.sleep(2000);
		
		epp.clickbtnCalYear();
		Thread.sleep(2000);
		
		epp.clickbtnCalBackward();
		Thread.sleep(2000);
		
		epp.clickbtnCalBackward();
		Thread.sleep(2000);
		
		epp.clickbtnCalBackward();
		Thread.sleep(2000);
		
		epp.clickbtnCal1990();
		Thread.sleep(2000);
		
		epp.clickbtnCalMarch();
		Thread.sleep(2000);
		
		epp.clickbtnCal05();
		Thread.sleep(2000);
		
		epp.clickbtnGender();
		Thread.sleep(2000);
		
		epp.clickbtnMaleGender();
		Thread.sleep(2000);
		
		epp.clickbtnRelationshipstatus();
		Thread.sleep(2000);
		
		epp.clickbtnUnmarriedRelationShip();
		Thread.sleep(2000);
		
		epp.cleartxtPAddressOne();
		Thread.sleep(2000);
		
		epp.setbtnPAddressOne("222/888");
		Thread.sleep(2000);
		
		epp.cleartxtPAddressTwo();
		Thread.sleep(2000);
		
		epp.settxtPAddressTwo("Hosur road");
		Thread.sleep(2000);
		
		epp.cleartxtPin();
		Thread.sleep(2000);
		
		epp.settxtPin("560111");
		Thread.sleep(2000);
		
		epp.cleartxtLandMark();
		Thread.sleep(2000);
		
		epp.settxtLandmark("Near Infosys");
		Thread.sleep(2000);
		
		epp.cleartxtCity();
		Thread.sleep(2000);
		
		epp.settxtCity("Banglore");
		Thread.sleep(2000);
		
		epp.clickbtnState();
		Thread.sleep(2000);
		
//		String Value =baseURL;
//				
//		for(int i = 0; i <= 30; i++)
//			 
//		{
//			epp.goDownState();
//			epp.getdivDropdown();
//			    
//			if(Value.equalsIgnoreCase("Karnataka"))
//			{
//			                    
//			         break;
//			     }
//			      else
//			      {
//			        epp.clickbtnStateKarnataka();
//			     }
//			   }
		
//		List<WebElement> optionList = driver.findElements(By.xpath("(//div[@class='rc-virtual-list'])[1]"));
//		
//		JavascriptExecutor je = (JavascriptExecutor) driver;
//		
//		je.executeScript("arguments[16].scrollIntoView(true);", optionList.get(16) );
//		
//		Thread.sleep(2000);
		
		epp.clickbtnStateChandighar();
		Thread.sleep(2000);
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0, 1500)");
		Thread.sleep(2000);
		
		epp.clickbtnPermanentAddress();
		Thread.sleep(2000);
		
		epp.cleartxtDegree();
		Thread.sleep(2000);
		
		epp.settxtDegree("B.tech");
		Thread.sleep(2000);
		
		epp.cleartxtCollegeName();
		Thread.sleep(2000);
		
		epp.settxtCollegeName("Mahatav College of Engineering");
		Thread.sleep(2000);
		
		epp.cleartxtUniversity();
		Thread.sleep(2000);
		
		epp.settxtUniversity("BPUT");
		Thread.sleep(2000);
		
		epp.cleartxtEAddress();
		Thread.sleep(2000);
		
		epp.settxtEAddress("Bhubaneswar");
		Thread.sleep(2000);
		
		epp.clickbtnEStartDate();
		Thread.sleep(2000);
		
		epp.clickbtnCalYear();
		Thread.sleep(2000);
		
		epp.clickbtnCalBackward();
		Thread.sleep(2000);
		
		epp.clickbtnCal1990();
		Thread.sleep(2000);
		
		epp.clickbtnCalMarch();
		Thread.sleep(2000);
		
		epp.clickbtnCal05();
		Thread.sleep(2000);
		
		epp.clickbtnEEndDate();
		Thread.sleep(2000);
		
		epp.clickbtnCalYear();
		Thread.sleep(2000);
		
		epp.clickbtnCalBackward();
		Thread.sleep(2000);
		
		epp.clickbtnCal1990();
		Thread.sleep(2000);
		
		epp.clickbtnCalMarch();
		Thread.sleep(2000);
		
		epp.clickbtnCal05();
		Thread.sleep(2000);
		
		//Emergency Contact
		
		epp.cleartxtECFName();
		Thread.sleep(2000);
		
		epp.settxtECFName("Hari Das varma");
		Thread.sleep(2000);
		
		epp.cleartxtECRelationShip();
		Thread.sleep(2000);
		
		epp.settxtECrelationShip("Father");
		Thread.sleep(2000);
		
		epp.cleartxtECAddress();
		Thread.sleep(2000);
		
		epp.settxtECAddress("Banglore");
		Thread.sleep(2000);
		
		epp.CleartxtECContactNumber();
		Thread.sleep(2000);
		
		epp.settxtECContactNumber("5664848933");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
