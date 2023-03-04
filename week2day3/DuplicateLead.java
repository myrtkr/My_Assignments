package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DuplicateLead {

	public static void main(String[] args) throws Throwable {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("mayuri.thakur@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		Thread.sleep(600);
		driver.findElement(By.xpath("//td[contains(@class,'x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first')]//a"));
		WebElement findElement = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a"));
		
		String t = findElement.getText();
		System.out.println(t);
		findElement.click();
		
		driver.findElement(By.xpath("//div[@class='frameSectionExtra']//a")).click();
		String title = driver.getTitle();
		System.out.println(title);
		
		if (title.contentEquals("Duplicate Lead | opentaps CRM")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		WebElement name = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
		String n = name.getText();
		//System.out.println(n);
		
		if (t.contentEquals(n)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		

		
		driver.close();


	}

}
