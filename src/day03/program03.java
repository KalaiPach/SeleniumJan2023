package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class program03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Select dropDownSkill = new
				Select(driver.findElement(By.xpath("//select[@id='Skills']")));
				dropDownSkill.selectByValue("Analytics");
				
		
		
	}

}
