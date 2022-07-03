package TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGReview {
	
	
	@BeforeSuite
	public void DBConnection() {
		System.out.println("DB ----connection ");
	}
	

	@BeforeTest
	public void createUser() {
		System.out.println("DB ----connection ");
	}
	

	@BeforeClass
	public void LauncheBrowser() {
		System.out.println("DB ----connection ");
	}
	

	@BeforeMethod
	public void loginToApp() {
		System.out.println("DB ----connection ");
	}
	

	@Test
	public void getPageTitleTest() {
		System.out.println("DB ----connection ");
	}
	
	@Test
	public void userInfoTest() {
		System.out.println("DB ----connection ");
	}
	
	@Test
	public void searchTest() {
		System.out.println("DB ----connection ");
	}
	
	
	
	
	
	@AfterMethod
	public void Logout() {
		System.out.println("DB ----connection ");
	}
	

	@AfterClass
	public void closeTheBrowser() {
		System.out.println("DB ----connection ");
	}
	

	@AfterTest
	public void deleteUser() {
		System.out.println("DB ----connection ");
	}
	

	@AfterSuite
	public void disconnectDB() {
		System.out.println("DB ----connection ");
	}

}
