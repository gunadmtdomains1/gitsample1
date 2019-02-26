package Day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5 
	{
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://retail.onlinesbi.com/retail/login.htm");
	Thread.sleep(12000);
	WebElement btncontinue= driver.findElement(By.xpath("//*[@id=\"banner\"]/div[2]/a"));
	btncontinue.click();
	Thread.sleep(12000);
	WebElement btnlogin= driver.findElement(By.xpath("//*[@id=\"Button2\"]"));
	btnlogin.click();
	Thread.sleep(12000);
	Alert bb=driver.switchTo().alert();
	bb.accept();
	Thread.sleep(12000);
	driver.close();
	}
	}