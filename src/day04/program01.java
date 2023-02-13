package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		driver.findElement(By.xpath("//a[text()='Arabic']")).click();
		driver.findElement(By.xpath("//a[text()='Danish']")).click();
		driver.findElement(By.xpath("//a[text()='English']")).click();
				
		
	}

}
