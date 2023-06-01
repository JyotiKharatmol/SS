package Abstract;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {

	WebDriver driver;
	
	public  AbstractComponent(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void waitForElementToAppear(WebElement a )
	{
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		w.until(ExpectedConditions.visibilityOf(a));
	
	}

	
	
	
	
	
}
