package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TEDSearchPage
{
	WebDriver driver;
	
	public TEDSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//div[contains(@class, 'WsMG1c nnK0zc') and text() = 'TED']")
    WebElement PressOnTedIcon;
	
	public void clickontedicon() 
	{
		PressOnTedIcon.click();
	}
	
}
