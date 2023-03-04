package week2day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

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
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("mayuri");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(800);
		WebElement company = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-companyName')]//a"));
		String c = company.getText();
		System.out.println(c);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.contentEquals("View Lead | opentaps CRM")) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).clear();
		driver.findElement(By.xpath("//input[@id='updateLeadForm_companyName']")).sendKeys("myr");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("mayuri");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(800);
		WebElement company1 = driver.findElement(By.xpath("//div[contains(@class,'x-grid3-col-companyName')]//a"));
		String c1 = company1.getText();
		
		if (c.contentEquals(c1)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		driver.close();


	}

}
