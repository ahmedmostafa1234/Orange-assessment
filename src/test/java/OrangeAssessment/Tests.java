package OrangeAssessment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageModel.AppsPage;
import pageModel.EducationPage;
import pageModel.FaceBookPage;
import pageModel.GooglePlayHomePage;
import pageModel.TEDSearchPage;

public class Tests {
	WebDriver driver;

	GooglePlayHomePage googleplayhomepage;
	AppsPage appspage;
	EducationPage educationpage;
	TEDSearchPage tedsearchpage;
	FaceBookPage facebookpage;

	@BeforeTest
	public void Open_Browser() 
	{
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		googleplayhomepage = new GooglePlayHomePage(driver);
		appspage = new AppsPage(driver);
		educationpage = new EducationPage(driver);
		tedsearchpage = new TEDSearchPage(driver);
		facebookpage = new FaceBookPage(driver);

	}
	
	@BeforeMethod
	public void goToWebsite() {
		driver.get("https://play.google.com/store");

	}
	
	@AfterTest
	public void close_Browser() 
	{
		driver.close();
	}
	
	@Test
	public void GotoAppPage() 
	{
		googleplayhomepage.goToAppsPage();
		String actualURL = driver.getCurrentUrl();
		System.out.println(actualURL);
		Assert.assertEquals("https://play.google.com/store/apps",actualURL);
		appspage .goToEducationPage();
		String actURL = driver.getCurrentUrl();
		System.out.println(actURL);
		Assert.assertEquals("https://play.google.com/store/apps/category/EDUCATION",actURL);
		educationpage .goToTEDSearchPage();
		tedsearchpage.clickontedicon();
		WebElement InstallBtn = driver.findElement(By.xpath("//button[contains(text(),'Install')]"));
		InstallBtn.isEnabled();
		System.out.println("Install Btn is enabled");	
	}
	
	@Test
	public void SearchForFaceBook() 
	{
		googleplayhomepage.goToFaceBookPage();		
		System.out.println("Img is Displayed");
	}

}