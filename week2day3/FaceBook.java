package week2day3;



import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Mayuri");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Thakur");
		WebElement phoneNo = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		phoneNo.sendKeys("9998887770");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("0000mayuri");
		WebElement dobM = driver.findElement(By.id("month"));
		
		Select month = new Select(dobM);
		month.selectByVisibleText("Jun");
		
		Select day = new Select(driver.findElement(By.id("day")));
		day.selectByIndex(3);
		
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByValue("1980");
		
		driver.findElement(By.xpath("//input[@class='_8esa']")).click();
				
		driver.close();

	}

}
