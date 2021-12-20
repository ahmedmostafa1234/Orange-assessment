package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AppsPage
{
	WebDriver driver;

	@FindBy(id = "action-dropdown-parent-Categories")
	WebElement CatBtn;
	@FindBy(linkText = "Education")
	WebElement Education ;
	
	public AppsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToEducationPage() {

		CatBtn.click();
		Education.click();	
	}

}



