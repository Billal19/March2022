package TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	
	
	static WebDriver driver; 
	
	
	@BeforeTest
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1, description = ".......checking page title contains Google.......... ")
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is :" +title);
		Assert.assertEquals(title,"Google");
				
	}
	
	@Test(priority=2, description = ".......checking page URL contains amazon.......... ")
	public void pageUrlTest() {
		String Url = driver.getCurrentUrl();
		System.out.println("the page URL is : " + Url);
		Assert.assertTrue(Url.contains("google"), " the URL is not matched ");
		
		
	}
	
	@Test(priority=3, description = ".......checking if the search field exist on loging page.......... ")
	public void isSearchExistTest() {
		
		boolean flag = driver.findElement(By.xpath("//input[@name='q']")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
