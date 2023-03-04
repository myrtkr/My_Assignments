package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Create Contact']")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Maya");
		driver.findElement(By.id("lastNameField")).sendKeys("Speigel");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Mayuri");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("thakur");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Development");
		WebElement desc = driver.findElement(By.id("createContactForm_description"));
		desc.sendKeys("We develop mobile camera application and stream app for both mobile and web platforms");
		driver.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("abcde@gmail.com");
		
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select stt = new Select(state);
		stt.selectByVisibleText("Texas");
		
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("updating the description");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		
		driver.close();
		
		
		

	}

}
