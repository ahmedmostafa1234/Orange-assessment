package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookPage 
{
WebDriver driver;
	
	public FaceBookPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//div[contains(@class, 'WsMG1c nnK0zc') and text() = 'Facebook']")
	WebElement Icon;
	public void ImgDisplayed() {
		Icon.isDisplayed();

		
       
	}
	}
  