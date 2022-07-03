package TestPakacge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractingWithWebElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		// 1st Approach of writing WebElements : 
		driver.findElement(By.id("Form_submitForm_Name")).sendKeys("Bill");
		driver.findElement(By.id("Form_submitForm_Email")).sendKeys("bill.123@gmail.com");
		driver.findElement(By.id("Form_submitForm_Contact")).sendKeys("1223448762");
		
		
		// 2nd Approach : we will be storing the locators in a webElement variables and use the variable names to perform certain action 
		WebElement theName = driver.findElement(By.id("Form_submitForm_Name"));
		WebElement theEmail = driver.findElement(By.id("Form_submitForm_Email"));
		WebElement thePhone= driver.findElement(By.id("Form_submitForm_Contact"));
		
		// now we captured the webElement , we can perform out actions : 
		theName.sendKeys("Bill");
		theEmail.sendKeys("bill123@gmail.com");
		thePhone.sendKeys("736548392736");
		
		
		
		// 3rd approach using the by locator method ; 
		By name = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By phone = By.id("Form_submitForm_Contact");
		
		WebElement name_Ele = driver.findElement(name); 
		WebElement email_Ele = driver.findElement(email); 
		WebElement phone_Ele = driver.findElement(phone); 
		
		name_Ele.sendKeys("Bill");
		email_Ele.sendKeys("bill123@gmail.com");
		phone_Ele.sendKeys("736454838");
		
		
		
		// 4th approach using the by locator with a generic method for webElement  : 
		By name1 = By.id("Form_submitForm_Name"); // in here we used the the by locator approach to store our webElements 
		By email1 = By.id("Form_submitForm_Email");
		By phone1 = By.id("Form_submitForm_Contact");
		
		
//		
//		getElement(name1).sendKeys("Bill");  // instead of using driver.findelement every time i need it , i created a method for that and named it getElement , then i am just calling this method and pass the locator to it 
//		getElement(email1).sendKeys("bil123@gmail.com");
//		getElement(phone1).sendKeys("352615627");
		
		
		
		
		// 5th approach using the by locator with a generic method for webElement & Action : 
		
		By name12 = By.id("Form_submitForm_Name");
		By email12 = By.id("Form_submitForm_Email");
		By phone12= By.id("Form_submitForm_Contact");
		
//		doSendKeys(name12,"billal");
		
		
		
		// 6th approach : 
		By name121 = By.id("Form_submitForm_Name");
		By email121 = By.id("Form_submitForm_Email");
		By phone121= By.id("Form_submitForm_Contact");
		
		ElementUtilClass obj = new ElementUtilClass(driver) ; 
		obj.doSendKeys(name121, "billal");
		obj.doSendKeys(phone121, "234433");
		obj.doSendKeys(email121, "bill123@gmail.com");
		
		
	

	}
	


}
