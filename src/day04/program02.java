package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class program02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath("//span[@aria-labelledby='select2-country-container']")).click();
		driver.findElement(By.xpath("//input[@class='select2-search__field']")).sendKeys("India");
		driver.findElement(By.xpath("//li[text()='India']")).click();
		
	}

}
