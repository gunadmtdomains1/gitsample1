package Day8;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task9 
{
public static void main(String[] args) throws InterruptedException, AWTException  
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com");
	Thread.sleep(5000);
	//after entering into flipkart a login popup will open we have to close 
	WebElement popupclose=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	popupclose.click();
	Thread.sleep(5000);
	//here we Locating & clicking a Login & Signup link on top of the page
	WebElement lnklogin=driver.findElement(By.xpath("//a[text()='Login & Signup']"));
	lnklogin.click();
	Thread.sleep(5000);
	WebElement userid=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
	userid.sendKeys("guna@gmail.com");
	Thread.sleep(5000);
	Robot k=new Robot();
	k.keyPress(KeyEvent.VK_CONTROL);
	k.keyPress(KeyEvent.VK_A);
	k.keyRelease(KeyEvent.VK_CONTROL);
	k.keyRelease(KeyEvent.VK_A);
	k.keyPress(KeyEvent.VK_CONTROL);
	k.keyPress(KeyEvent.VK_X);
	k.keyRelease(KeyEvent.VK_CONTROL);
	k.keyRelease(KeyEvent.VK_X);
	WebElement userpass=driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
	userpass.click();
	k.keyPress(KeyEvent.VK_CONTROL);
	k.keyPress(KeyEvent.VK_V);
	k.keyRelease(KeyEvent.VK_CONTROL);
	k.keyRelease(KeyEvent.VK_V);
	Thread.sleep(5000);
	WebElement btnlogin = driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']"));
	btnlogin.click();
	Thread.sleep(3000);
	driver.quit();
	}
}
