package soloInstructor_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Studios extends Instructor_Modules_Abstract{

	WebDriver driver;
	public Studios(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@id='root']/div/div/div/div/div[4]/button")
	WebElement addStudios;
	
	@FindBy(xpath="//div/div/div/div[3]/div/div/div[1]/div[2]/button")
	WebElement edit1stStudio;
	
	@FindBy(xpath="//div/div/div/div[3]/div/div/div[1]/div[3]/button")
	WebElement delete1stStudio;
	
	@FindBy(xpath="//div/div/div/div[5]/div/div/div[1]/div/button")
	WebElement studiosPreviousStep;
	
	@FindBy(xpath="//div/div/div/div[5]/div/div/div[2]/div/button")
	WebElement studiosSaveAndContinue;

	public WebElement AddStudios()
	{
		return addStudios;
	}
	public WebElement Edit1stStudio()
	{
		return edit1stStudio;
	}
	public WebElement Delete1stStudio()
	{
		return delete1stStudio;
	}
	public WebElement StudiosPreviousStep()
	{
		return studiosPreviousStep;
	}
	public WebElement studiosSaveAndContinue()
	{
		return studiosSaveAndContinue;
	}

}
