package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class program01 {

	public static void main(String[] args) {
		
		WebDriver driver;
		driver = new ChromeDriver();
		//driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getClass());
		

	}

}
