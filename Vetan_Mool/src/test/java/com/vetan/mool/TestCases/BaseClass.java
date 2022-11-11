package com.vetan.mool.TestCases;

import java.io.File;  
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.vetan.mool.PageObjects.LoginPage;
import com.vetan.mool.Utilities.readConfig;

public class BaseClass {
	
	public static final String scrollDown = null;

	readConfig readconfig = new readConfig();
	
	public String vetanURL = readconfig.getvetanURL();
	public String stageURl = readconfig.getstageURL();
	public String landingPageURL = readconfig.getlandingPageURL();
	public String devURL = readConfig.getdevURl();
	public String userName = readconfig.getuserName();
	public String password = readconfig.getpassword();
	public static WebDriver driver; 
	
	public static Logger logger;
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br)
	{
		if(br.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", readconfig.getchromepath());
		driver = new ChromeDriver(); 
		}else if(br.equals("safari"))
		{
			driver = new SafariDriver();
		}
		
		driver.get(vetanURL);
		
		
		logger  =  Logger.getLogger("Vetan_Mool");
		PropertyConfigurator.configure("log4j.properties");
	}
	
	
	//ScreenShots
	public void capturescreen(WebDriver driver, String tname) throws IOException
	{
		TakesScreenshot TS = (TakesScreenshot)driver;
		File source = TS.getScreenshotAs(OutputType.FILE);
		File target = new File(System.getProperty("user.dir")+"/Screenshot"+tname+".png");
		FileUtils.copyFile(source, target);
		System.out.println("Screenshot taken");
	}
	

	//Scrolldown

	public void scrollDown()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	}

	public void scrollUp()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-1500)");
	}

	
	
	
	
	
	
	//Random Generations
	public String randomPanalpha()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	public String randomPannumeric()
	{
		String generatedString = RandomStringUtils.randomNumeric(4);
		return generatedString;
	}
	
	//Phone
	public String randomPhone()
	{
		String generatedString = RandomStringUtils.randomNumeric(10);
		return generatedString;
	}
	
	//Email
	public String randomEmail()
	{
		String generatedString = RandomStringUtils.randomAlphanumeric(7);
		return generatedString;
	}
	
	//Name
	public String randomFName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public String randomLName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(5);
		return generatedString;
	}
	
	
	public String randomEmpid()
	{
		String generatedString = RandomStringUtils.randomAlphanumeric(5);
		return generatedString;
	}	
	
	public String randomCtc()
	{
		String generatedString = RandomStringUtils.randomNumeric(5);
		return generatedString;
	}	
	
	public String randomUserName()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}
	
	public String randomOrgname()
	{
		String generatedString = RandomStringUtils.randomAlphabetic(6);
		return generatedString;
	}

	//Login

	public void login() throws InterruptedException
	{
	LoginPage lp = new LoginPage(BaseClass.driver);
	Thread.sleep(2000);

	lp.settxtUsername(userName);

	lp.clickbtnContinue();
	Thread.sleep(2000);
	
	lp.settxtPassword(password);
	Thread.sleep(2000);
	
	lp.clickbtnSignin();
	Thread.sleep(2000);
			
	System.out.println(driver.getTitle());

}
		
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

	
}
