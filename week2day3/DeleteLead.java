package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws Throwable {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.id("label")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		WebElement countryCode = driver.findElement(By.xpath("//input[@name='phoneCountryCode']"));
		countryCode.clear();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9994445550");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(600);
		WebElement leadFirst = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
		String lead = leadFirst.getText();
		System.out.println(lead);
		leadFirst.click();
		
		driver.findElement(By.xpath("(//a[@class='subMenuButton']/following-sibling::a)[3]")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(lead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(600);
		WebElement ver = driver.findElement(By.xpath("//div[contains(@class,'x-small-editor')]//div"));
		String verMatch = ver.getText();
		System.out.println(verMatch);
		
		if(verMatch.contentEquals("No records to display")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		

	}

}
