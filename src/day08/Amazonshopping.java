package day08;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.Set;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;

public class Amazonshopping {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		screenShot("Amazonpage");
		Select dropDown = new 
		Select(driver.findElement(By.xpath("//select[@title='Search in']")));
		dropDown.selectByValue("search-alias=stripbooks");
		screenShot("searchbooks");
		//driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Selenium Java"+Keys.ENTER);
		//driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("//span[text()='Selenium with Java – A Beginner’s Guide: Web Browser Automation for Testing using Selenium with Java']")).click();
		screenShot("SeleniumJavaBook");		
	
	Set<String> windowIds = driver.getWindowHandles();
	System.out.println(windowIds);
		for (String id:windowIds) {
			driver.switchTo().window(id);
			if(driver.getTitle().contains("Selenium with Java"))
			{
				Select dropQty = new
			Select(driver.findElement(By.xpath("//select[@name='quantity']")));
			dropQty.selectByValue("6");
			driver.findElement(By.name("submit.add-to-cart")).click();
			screenShot("Cart");
			}
		}
		}
	public static void screenShot(String fileName) throws Exception{	
	
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File des = new File("./amazon/"+fileName+".png");
		FileUtils.copyFile(src, des);
		
	}

}
