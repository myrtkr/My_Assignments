package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateTask {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("disable-notifications");
        ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://login.salesforce.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf@123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip']/div)[2]")).click();
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("task");
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		Thread.sleep(1200);
		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left--none'])[4]")).click();
		WebElement j = driver.findElement(By.xpath("//div[@class='menuItemsWrapper']//a"));
		driver.executeScript("arguments[0].click();", j);
		Thread.sleep(1200);
		driver.findElement(By.xpath("//input[@class='slds-combobox__input slds-input']")).sendKeys("Bootcamp");
		driver.findElement(By.xpath("//a[text()='Not Started']")).click();
		System.out.println("test1");
		Thread.sleep(1200);
		driver.findElement(By.xpath("//a[text()='Waiting on someone else']")).click();
		driver.findElement(By.xpath("(//span[contains(@class,' label bBody')])[3]")).click();
		WebElement ver = driver.findElement(By.xpath("//div[contains(@class,'slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp')]"));
		if(ver.isDisplayed()) {
			System.out.println("Task Verification: Done");
		}else {
			System.out.println("Task Verification: Not done");
		}
		driver.close();
		
		
	}

}
