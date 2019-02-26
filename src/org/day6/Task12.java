package org.day6;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task12 
{
	public static void main(String[] args) throws InterruptedException, AWTException, IOException  
{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/offers/quirky");
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"inputValEnter\"]"));
		searchbox.sendKeys("casual shoes for men");
		WebElement srch=driver.findElement(By.xpath("//*[@id=\"sdHeader\"]/div[4]/div[2]/div/div[2]/button"));
		srch.click();
		Robot r=new Robot();
		Actions b=new Actions(driver);
		WebElement product=driver.findElement(By.xpath("//*[@id=\"619799246047\"]/div[2]/a/picture/img"));
		b.contextClick(product).perform();
		Thread.sleep(4000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//driver.quit();
		
}
}
