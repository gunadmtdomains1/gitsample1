package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class d3task11 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Actions acc=new Actions(driver);
	    WebElement popUp=driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
	    popUp.click();
	    
	    WebElement homeElement=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[6]/span"));
	    acc.moveToElement(homeElement).perform();
	    
	    
	    WebElement btnlogin=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/ul/li[6]/ul/li/ul/li[2]/ul/li[9]/a"));
	    js.executeScript("arguments[0].Click()", btnlogin);
	    
	    driver.quit();
	}

}
