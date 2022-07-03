package TestPakacge;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtilClass {
	
	private WebDriver driver ;
	
	public ElementUtilClass(WebDriver driver) {
		this.driver=driver;
	}
	
	public WebElement getElement(By Locator) { // this method created so we can use it for find element instead of writing find elements multiple timmes  
		return driver.findElement(Locator);
	}
	
	public void doSendKeys(By Locator , String value) {
		getElement(Locator).sendKeys(value);
	}

}
