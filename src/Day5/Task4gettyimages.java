package Day5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task4gettyimages {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.toolsqa.com/handling-alerts-using-selenium-webdriver/");
		
		WebElement salert= driver.findElement(By.xpath("//*[@id=\"content\"]/p[4]/button"));
		salert.click();
		//Alert al=driver.switchTo().alert();
		//al.accept();
		
		
		//driver.close();
		
		
		
	}

}
