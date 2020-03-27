package testdemo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class JavaTPoint extends BasePage {
	 
	@Test(priority=1)
	public  void serach() {
		Reporter.log("=====Search For TestNg started=====", true);
		WebElement element = driver.findElement(By.xpath("//div[@class='a4bIc']//input[@type='text']"));
		element.sendKeys("TestNG");
		List<WebElement> testnglink = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count = testnglink.size();
		for (int i = 0; i <count; i++) {
			WebElement wb=testnglink.get(i);
			String str = wb.getText();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			if (str.equalsIgnoreCase("TestNG")) {
				testnglink.get(i).click();
				
				break;
			} else {

				
			}

		}
		
			
	}
	@Test(priority=2)
	public  void openTpoint() throws IOException {
		Reporter.log("=====Open JavaTpoint and extract menu list=====", true);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement tpointLink= driver.findElement(By.xpath("//div[@class='g']//h3[contains(text(),'TestNG Tutorial - Javatpoint')]"));
		tpointLink.click();
		
		List<WebElement> menulist = driver.findElements(By.xpath("//div[@id='menu']"));
		int count = menulist.size();
		System.out.println("Size of list is:" + count);
		
		for (int j = 0; j <count; j++) {
			WebElement wb1=menulist.get(j);
			String str2 = wb1.getText();
			
			
			//Write all menu list in text file
			  String WriteFile = "/home/ambrish/Kautsav_WorkSpace/MonikaDemo/WriteMenuList.txt";
			  File FC = new File(WriteFile);//Created object of java File class.
			  FC.createNewFile();
			  
			  FileWriter FW = new FileWriter(WriteFile);
			  BufferedWriter BW = new BufferedWriter(FW);
			  BW.write(str2); 
			  BW.close();
			  
			 //System.out.println("This is string:" + str2);
			//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			
		}
	
		
	}
	

}
