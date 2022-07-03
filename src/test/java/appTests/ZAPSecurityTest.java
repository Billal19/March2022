package appTests;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.zaproxy.clientapi.core.ApiResponse;
import org.zaproxy.clientapi.core.ClientApi;
import org.zaproxy.clientapi.core.ClientApiException;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ZAPSecurityTest {
	
	static final String ZAP_PROXY_ADDRESS = "localhost";
	static final int ZAP_PROXY_PORT =8081;
	static final String ZAP_API_KEY = "ll8qiohbugmgkpqq2d601p32" ;
	
	
	
	private WebDriver driver ;
	private ClientApi api;
	
	@BeforeMethod
	public void setUp() {
		String proxyServerUrl = ZAP_PROXY_ADDRESS + ":" + ZAP_PROXY_PORT;
		Proxy proxy = new Proxy ();
		proxy.setHttpProxy(proxyServerUrl);
		proxy.setSslProxy(proxyServerUrl);
		
		ChromeOptions co = new ChromeOptions();
		co.setAcceptInsecureCerts(true);
		co.setProxy(proxy);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(co);
		api = new ClientApi(ZAP_PROXY_ADDRESS,ZAP_PROXY_PORT,ZAP_API_KEY);
			
		
	}
	
	@Test
	
	public void ProductStoreSecurityTest() {
		
		
		driver.get("https://www.demoblaze.com/");
		Assert.assertTrue(driver.getTitle().contains("STORE"));
	}
	
	@AfterMethod
	public void teardown() {
		
		if(api!=null) {
			String title = " Product store Zap Security repotr";
			String template ="tranditional-html"; 
			String description ="This report will list all the Product Store testing reports" ; 
			String reportfilename = "product-store-report.html";
			String targetFolder = System.getProperty("user.dir");
			
			
			
			
			try {
				ApiResponse response = api.reports.generate(title, template, null, description, null, null, null, null, null, reportfilename, null, targetFolder, null);
				System.out.println("zap report is generated in this location : " + response.toString());
			} catch (ClientApiException e) {
				
				e.printStackTrace();
			}
			
			
		}
		
		driver.quit();
		
	}
	

}
