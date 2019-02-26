package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		WebElement n=driver.findElement(By.id("//input[@id=\"login1\"]"));
		n.sendKeys("gunaitsoft@yahoo.com");
		WebElement s=driver.findElement(By.name("//input[@name=\"proceed\"]"));
		s.click();
	}
}
