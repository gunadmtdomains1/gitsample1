package Day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4 {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	WebElement btnsubmit=driver.findElement(By.xpath("//*[@id=\"frmLogon\"]/div[2]/div[4]/div/input"));
	btnsubmit.click();
	Thread.sleep(12000);
	Alert vb=driver.switchTo().alert();
	vb.accept();
	Thread.sleep(12000);
	driver.quit();
	}

}
