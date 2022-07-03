package TestNG;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {
	
	static WebDriver driver; 
	
	
	@BeforeTest
	
	public void setUp() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.com/");
	}
	
	@Test(priority=1, description = ".......checking page title contains amazon.......... ")
	public void pageTitleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is :" +title);
		Assert.assertEquals(title,"Amazon.com. Spend less. Smile more.");
				
	}
	
	@Test(priority=2, description = ".......checking page URL contains amazon.......... ")
	public void pageUrlTest() {
		String Url = driver.getCurrentUrl();
		System.out.println("the page URL is : " + Url);
		Assert.assertTrue(Url.contains("amazon"), " the URL is not matched ");
		
		
	}
	
	@Test(priority=3, description = ".......checking if the search field exist on loging page.......... ")
	public void isSearchExistTest() {
		
		boolean flag = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
