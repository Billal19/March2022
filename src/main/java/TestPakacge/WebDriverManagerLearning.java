package TestPakacge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerLearning {

	
	
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup(); // using the webDriver manager will allow us not to download the webDriver for any browser and we don't have to set the properties 
		WebDriver driver = new ChromeDriver(); // in here we created an instance of a driver for the chrome browser so we can launch it 
		String name ="david123 , this variable is create to not be used , it is for git commits practice only";
		
		
		
		// Session ID when using the quit() method : 
		
		driver.get("https://www.google.com");  // the session ID is (to be able to get it, we just have to mouse over the driver) : ChromeDriver: chrome on MAC (81a407c5df1482a1e556633687ad311d)
		String title = driver.getTitle(); // same session ID : ChromeDriver: chrome on MAC (81a407c5df1482a1e556633687ad311d)
		System.out.println(title); // Same Session ID : ChromeDriver: chrome on MAC (81a407c5df1482a1e556633687ad311d)
		System.out.println(driver.getCurrentUrl()); // Same Session ID : ChromeDriver: chrome on MAC (81a407c5df1482a1e556633687ad311d)
		//driver.quit(); // the session ID here will not be the same, it will be a null as written here  : ChromeDriver: chrome on MAC (null)
		//System.out.println(driver.getTitle()); // Exception in thread "main" org.openqa.selenium.NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?
		
		
		// Session ID when using close() method : 
		
		driver.close(); // if we run the close method instead of the quit , the system will throw invalid session ID unlike the Quit method that threw null session 
		System.out.println(driver.getTitle()); // Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		
		
		
		
		
		
		

	}

}
