package Selenium;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lvbankwh {
	public static void main(String[] args) throws IOException  
	{
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.lvbankonline.in/lvbretail/RetailLogin.html");
				
				WebElement link1 = driver.findElement(By.xpath("//*[@id=\"Table10\"]/tbody/tr[2]/td/a"));
				
				link1.click();
				
				String pwid = driver.getWindowHandle();
				
				System.out.println(pwid);
				
				Set <String> allwindowId = driver.getWindowHandles();
				
				System.out.println(allwindowId);
				
				for(String v:allwindowId) {
					if(!v.equals(pwid)) {
						driver.switchTo().window(v);
					}
				}
				WebElement link2=driver.findElement(By.xpath("//a[text()='Reset Login password']"));
				link2.click();
				for(String a:allwindowId) {
					if(!a.equals(pwid)) {
						driver.switchTo().window(a);
					}
				}
				WebElement txtbox=driver.findElement(By.id("fldUId"));
				txtbox.sendKeys("123456");

}
}
