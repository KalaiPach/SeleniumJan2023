package day04;

import java.io.File;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class program03 {
static WebDriver driver; 
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		screenShot("application");
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Kalaivani");
		screenShot("FName");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pachaiappan");
		screenShot("Lname");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Chennai-39");
		screenShot("address");
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		screenShot("gender");
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Cricket']")).click();
		screenShot("hobbies");
		driver.findElement(By.xpath("//input[@type='checkbox' and @value='Movies']")).click();
		screenShot("hobbies1");
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		WebElement ele = driver.findElement(By.xpath("(//div[@class='form-group'])[6]"));
		screenShotEle("elementhobby");
		
	}
	
	public static void screenShot(String fileName) throws Exception
	{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File("./screenShot/"+fileName+".png");
			FileUtils.copyFile(src, des);
				
	}

	public static void screenShotEle(String fileName) throws Exception
	{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File des = new File("./screenShot/"+fileName+".png");
			FileUtils.copyFile(src, des);
				
	}
}
