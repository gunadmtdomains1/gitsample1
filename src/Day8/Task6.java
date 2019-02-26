package Day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task6 {
	public static void main(String[] args) throws InterruptedException 
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.sprint.com/");
	Thread.sleep(2000);
	WebElement btnsignin=driver.findElement(By.xpath("/html/body/div[1]/header/div[2]/div/div/div[4]/div[1]/div/div[1]/a/p"));
	btnsignin.click();
	Thread.sleep(2000);
	WebElement btnsubmit=driver.findElement(By.xpath("//*[@id=\"loginHeaderButton\"]"));
	btnsubmit.click();
	}
}
