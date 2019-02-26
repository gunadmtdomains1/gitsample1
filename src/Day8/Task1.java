package Day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		Thread.sleep(8000);
		
		WebElement palt=driver.findElement(By.xpath("//button[text()='Prompt Pop up']"));
		palt.click();
		Alert vb=driver.switchTo().alert();
		vb.sendKeys("Yes");
		Thread.sleep(8000);
		vb.accept();
		driver.quit();
				
	}

}

