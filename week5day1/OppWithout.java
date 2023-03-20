package week5day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OppWithout extends Basic{
	
	@Test

	public void oppWithout() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip']/div)[2]")).click();
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(800);
		WebElement j = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", j);
		
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		
		Thread.sleep(800);
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("03/17/2023");
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_icon slds-button_icon-bare slds-button_icon-inverse']")).click();
		
		WebElement error1 = driver.findElement(By.xpath("//div[@class='slds-form-element__help']"));
		WebElement error2 = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]"));
		
		if(error1.isDisplayed() && error2.isDisplayed()) {
			System.out.println("Verification: 2 fields are empty");
		}else {
			System.out.println("All good");
		}
		
		boolean er1 = driver.findElement(By.xpath("//div[@class='slds-form-element__help']")).isDisplayed();
		boolean er2 = driver.findElement(By.xpath("(//div[@class='slds-form-element__help'])[2]")).isDisplayed();
		// Hard Assert
		Assert.assertTrue(er1);
		Assert.assertTrue(er2);
		
		
		

	}

}
