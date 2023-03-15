package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SalesForceAccount {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		opt.addArguments("disable-notifications");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip']/div)[2]")).click();
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		WebElement j = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", j);
		
		driver.findElement(By.xpath("//a[@title='New']")).click();
		driver.findElement(By.xpath("(//input[@class='slds-input'])[2]")).sendKeys("MYR-TKR");
		System.out.println("test");
		
		driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Public']")).click();
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement ver = driver.findElement(By.xpath("//lightning-formatted-text[@class='custom-truncate']"));
		if(ver.isDisplayed()) {
			System.out.println("Account Verification: Done");
		}else {
			System.out.println("Account Verification: Not done");
		}
		driver.close();
	}
}
