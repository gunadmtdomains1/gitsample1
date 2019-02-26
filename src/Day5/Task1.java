package Day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task1 {
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		//first drag & drop
		driver.findElement(By.xpath("//*[@id=\"fourth\"]/a")).click();
		WebElement dragme=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		
	
		WebElement dropme=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		Actions acc = new Actions(driver);
		acc.dragAndDrop(dragme, dropme).perform();
		//second drag & drop
		driver.findElement(By.xpath("//*[@id=\"fourth\"]/a")).click();
		WebElement dragme1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement dropme1=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		
		Actions acc1 = new Actions(driver);
		acc1.dragAndDrop(dragme1, dropme1).perform();
		driver.quit();
	}

}
