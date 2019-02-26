package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.*;

public class FirstProgram {
public static void main(String[] args) throws InterruptedException   
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Gunasekar\\eclipse-workspace\\Seleniumpractise\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://aceassociatess.in/contactus.php");
	//finding from locator details
	driver.manage().window().maximize();
		
}
}