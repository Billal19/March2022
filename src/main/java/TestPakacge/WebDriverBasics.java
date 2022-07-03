package TestPakacge;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {
	
	static String url = "https://www.facebook.com";

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "//Users//billalyahiaoui//Downloads//chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		


	}

}
