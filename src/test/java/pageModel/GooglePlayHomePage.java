package pageModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePlayHomePage {

	WebDriver driver;
	
	@FindBy(id="gbqfq")
	WebElement FB;

	@FindBy(xpath = "//span[contains(text(),'Apps')]")
	WebElement Appl;
	
	public GooglePlayHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void goToAppsPage() {

		Appl.click();
	}

	public void goToFaceBookPage() {
		FB.sendKeys("facebook");
	}
}


