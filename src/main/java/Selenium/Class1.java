package Selenium;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import Utility.*;
import atu.testrecorder.exceptions.ATUTestRecorderException;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Class1 {
	@Test

	public void testSearch() throws ATUTestRecorderException
	{
		WebDriver driver;
		ATURecorder ATU = new ATURecorder();
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Nilmie\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get("http://www.google.lk");
		ATU.startRecord("NIM1");
		driver.findElement(By.id("lst-ib")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.linkText("Selenium - Web Browser Automation"));
		driver.findElement(By.xpath("//h3[@class='LC20lb']")).click();
		
		
		String webTitle = driver.getTitle();
		
		Assert.assertEquals(webTitle, "Selenium - Web Browser Automation");
		ATU.stopRecord();
		driver.close();
		driver.quit();
		
	}
}
