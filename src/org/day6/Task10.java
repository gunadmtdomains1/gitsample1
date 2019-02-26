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

public class Task10 {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement signin=driver.findElement(By.xpath("//*[@id=\"nav-link-yourAccount\"]/span[1]"));
		signin.click();
		Actions cd=new Actions(driver);
		Robot r=new Robot();
		WebElement userid=driver.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		userid.sendKeys("gunadmtdomains@gmail.com");
		userid.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
		WebElement cont=driver.findElement(By.id("continue"));
		cont.click();
		WebElement pass = driver.findElement(By.xpath("//*[@id=\"ap_password\"]"));
		pass.click();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
}
}