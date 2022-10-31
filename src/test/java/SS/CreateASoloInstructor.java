package SS;

import java.io.IOException;
import java.util.Random;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.UberAdmin_CompanySoloTablePage;
import pageObjects.UberAdmin_CreateSoloInstructorPage;
import pageObjects.UberAdmin_LoginPage;
import resources.base;

public class CreateASoloInstructor extends base{

	@BeforeTest
	public void initialize() throws IOException
	
	{
		driver = initializeBrowser();
		driver.get(pro.getProperty("url"));
		UberAdmin_LoginPage u = new UberAdmin_LoginPage(driver);
		u.EmailID().sendKeys("jyoti.kharatmol@azularc.com");
		u.Password().sendKeys("Password@3");
		u.LoginButton();
	}
	
	@Test
	public void CreateNewSoloInst()
	{
		UberAdmin_CompanySoloTablePage s = new UberAdmin_CompanySoloTablePage(driver);
		s.SoloInstructorTab().click();
		
		UberAdmin_CreateSoloInstructorPage so= s.AddSoloButton();
		
		
		so.BrandName().sendKeys("Cross-Fit");
		so.TimeZone().click();
		so.TimeZone_central().click();
		so.Address1().sendKeys("1022 Highland Street");
		so.City().sendKeys("Atlanta");
		so.State().click();
		so.stateoption().click();
		so.Zip().sendKeys("30300");
		so.FirstName().sendKeys("Jyoti");
		so.LastName().sendKeys("Kharatnmol");
		so.PhoneNumber().sendKeys("2345623235");
		so.SoloInstrcutorEmailID().sendKeys("jyoti.kharatmol@azularc.com");
		
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(100);
		
		so.CompanyAlias().sendKeys("Alias"+randomInt);
		
		so.MerchantId().sendKeys("234542");
		so.MerchantUsername().sendKeys("SmartStudio");
		so.MerchantPassword().sendKeys("SmartStudio@1");
		so.SaveAndSendInvite().click();
		
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
	
	
	
	
}
