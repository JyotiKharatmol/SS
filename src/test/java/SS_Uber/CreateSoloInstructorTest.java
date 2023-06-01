package SS_Uber;

import java.io.IOException;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.base;
import uberAdmin_PageObjects.Uber_InstructorList;
import uberAdmin_PageObjects.Create_SoloInstructor;
import uberAdmin_PageObjects.Uber_Login;

public class CreateSoloInstructorTest extends base{

	@BeforeTest
	public void initialize() throws IOException
	
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
		Uber_Login u = new Uber_Login(driver);
		u.EmailID().sendKeys("jyoti.kharatmol@azularc.com");
		u.Password().sendKeys("Password@3");
		u.LoginButton();
	}
	
	@Test
	public void CreateNewSoloInst()
	{
		Uber_InstructorList s = new Uber_InstructorList(driver);
		s.SoloInstructorTab().click();
		
		Create_SoloInstructor so= s.AddSoloButton();
		so.BrandName().sendKeys("Cross-Fit");
		so.TimeZone().click();
		so.TimeZone_central().click();
		so.Address1().sendKeys("1022 Highland Street");
		so.City().sendKeys("Atlanta");
		so.State().click();
		so.stateoption().click();
		so.Zip().sendKeys("30300");
		so.FirstName().sendKeys("Jyoti");
		so.LastName().sendKeys("Kharatmol");
		so.PhoneNumber().sendKeys("2345623235");
		so.SoloInstrcutorEmailID().sendKeys("jyoti.kharatmol@azularc.com");
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		
		so.CompanyAlias().sendKeys("alias"+randomInt);
		
		so.MerchantId().sendKeys("234542");
		so.MerchantUsername().sendKeys("SmartStudio");
		so.MerchantPassword().sendKeys("Smar3tStudio@1");
		so.SaveAndSendInvite().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
	driver.close();
	}
	
	
	
	
}
