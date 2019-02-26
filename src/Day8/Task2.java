package Day8;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.lvbank.com/search.aspx?zoom_query=");
		WebElement btnsubmit = driver.findElement(By.xpath("//input[@type='submit']"));
		btnsubmit.click();
		Thread.sleep(10000);
		Alert al=driver.switchTo().alert();
		al.accept();
		Thread.sleep(10000);
		driver.quit();
	}

}
