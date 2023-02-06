package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("TestFN");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("TestLN");
		driver.findElement(By.xpath("//input[@name='Username']")).sendKeys("TestinguserName");
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Test123");
		driver.findElement(By.xpath("//input[@jsname='YPqjbf' and @type='checkbox']")).click();
		
		
		
	}

}
