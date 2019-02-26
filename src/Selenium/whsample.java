package Selenium;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class whsample {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException  
	{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.get("https://www.lvbankonline.in/lvbretail/forgot_password.htm");
				String pwid = driver.getWindowHandle();
				System.out.println(pwid);
				Set<String> allwindows = driver.getWindowHandles();
				System.out.println(allwindows);
				//WebElement link1=driver.findElement(By.xpath("//a[text()='AC Seller Katpadi']"));
				//link1.click();
				//WebElement enq=driver.findElement(By.xpath("//*[@id=\"home\"]/div/div/div[2]/ul/p/a[2]/img"));
				//enq.click();
				//driver.close();

}
}