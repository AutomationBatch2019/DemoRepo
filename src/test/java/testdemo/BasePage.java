package testdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class BasePage {
	 WebDriver driver;
		@BeforeClass
		public  void launchBrowser(){
			
			Reporter.log("====Browser launch====", true);
			
				System.setProperty("webdriver.chrome.driver",
						"/home/ambrish/Kautsav_WorkSpace/MonikaDemo/exefile/chromedriver");
				driver = new ChromeDriver();
				driver.navigate().to("https://www.google.com");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			} 
		
		@AfterClass
		public  void closeBrowser() {
			driver.close();
			Reporter.log("=====Browser close====", true);
		}
	

}
