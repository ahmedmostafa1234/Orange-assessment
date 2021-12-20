package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EducationPage
{

	WebDriver driver;
	
	public EducationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	 @FindBy(id = "gbqfq")
	    WebElement SearchForTed;
	
	 public void goToTEDSearchPage() {
		 SearchForTed.sendKeys("TED");
		 SearchForTed.submit();		
	}	
}