package Day5;
import java.awt.*;
import java.awt.List;
import java.util.ArrayList;
import java.util.*;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task6 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shopclues.com/wholesale.html/");
		
		Actions ac = new Actions(driver);
		WebElement but1 =driver.findElement(By.xpath("//a[text()='Sports & More']"));
		ac.moveToElement(but1).perform();
		WebElement but2 =driver.findElement(By.xpath("//a[text()='Weight Gainers']"));
		but2.click();
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		Actions acc=new Actions(driver);
		Set<String> pwd=driver.getWindowHandles();
		System.out.println(pwd);
		for(String v:pwd)
		{
			if(!v.equals(parent))
			{
				driver.switchTo().window(v);
				System.out.println(v);
			}
		}
				
		WebElement but3 =driver.findElement(By.xpath("//img[@title='Tara Nutricare 1Kg Amino Mass Powder']"));
		but3.click();
		String parent2=driver.getWindowHandle();
		System.out.println(parent2);
		Set<String> pwd2=driver.getWindowHandles();
		System.out.println(pwd2);
		for(String v1:pwd2)
		{
			if(!v1.equals(parent2))
			{
				driver.switchTo().window(v1);
				System.out.println(v1);
			}
		}
		
		int count = 0;
		for(String x:pwd2)
		{
			if(count==2)
			{
				driver.switchTo().window(x);
				
			}
			count++;
		}
				
		WebElement addcart =driver.findElement(By.xpath("//*[@id=\"add_cart\"]"));
		addcart.click();
	
		WebElement addcart1 =driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/ul/li[4]/a/span"));
		acc.moveToElement(addcart1).perform();
		WebElement viewCart =driver.findElement(By.xpath("/html/body/div[3]/div/div/div[4]/ul/li[4]/div/div/div[3]/a[1]"));
		viewCart.click();
		WebElement Total =driver.findElement(By.xpath("//*[@id=\"3753326_2451615036\"]/div[2]/div[4]/span"));
		WebElement pic=dr
		String price1=Total.getText();
		System.out.println("PRICE :" +price1);
		
	}
}
