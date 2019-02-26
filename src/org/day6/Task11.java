package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task11 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/chennai/login-besant-nagar-adyar");
		TakesScreenshot url=(TakesScreenshot)driver;
		File s=url.getScreenshotAs(OutputType.FILE);
		File d=new File ("E:\\screenshot\\swiggyurl.png");
		FileUtils.copyFile(s, d);
		WebElement signin=driver.findElement(By.xpath("//span[text()='Sign In']"));
		signin.click();
		TakesScreenshot url1=(TakesScreenshot)driver;
		File a=url1.getScreenshotAs(OutputType.FILE);
		File b=new File ("E:\\screenshot\\clicksignin.png");
		FileUtils.copyFile(a, b);
		Actions ac=new Actions(driver);
		Robot r=new Robot();
		WebElement mob=driver.findElement(By.xpath("//*[@id=\"mobile\"]"));
		mob.sendKeys("9677200948");
		TakesScreenshot url2=(TakesScreenshot)driver;
		File c=url2.getScreenshotAs(OutputType.FILE);
		File g=new File ("E:\\screenshot\\userid.png");
		FileUtils.copyFile(c, g);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		WebElement pass=driver.findElement(By.id("password"));
		pass.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		TakesScreenshot url3=(TakesScreenshot)driver;
		File e=url3.getScreenshotAs(OutputType.FILE);
		File f=new File ("E:\\screenshot\\pastepass.png");
		FileUtils.copyFile(e, f);
		Thread.sleep(6000);
		driver.quit();
		
		
	
}		
}
