package weekendAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Opportunity extends Basic{
	
	@Test(priority=0, enabled=false)
	
	public void opportune() throws InterruptedException {
		
		driver.findElement(By.xpath("(//div[@class='tooltipTrigger tooltip-trigger uiTooltip']/div)[2]")).click();
		driver.findElement(By.xpath("//lightning-button[@class='slds-button slds-p-horizontal--small']/button")).click();
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
		Thread.sleep(800);
		WebElement j = driver.findElement(By.xpath("//span[text()='Opportunities']"));
		driver.executeScript("arguments[0].click();", j);
		
		driver.findElement(By.xpath("//a[@class='forceActionLink']")).click();
		WebElement opName = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
		opName.sendKeys("Salesforce Automation by Mayuri Thakur");
		Thread.sleep(800);
		
		
		driver.findElement(By.xpath("(//input[@class='slds-input'])[3]")).sendKeys("03/16/2023");
		
		driver.findElement(By.xpath("//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value']")).click();
		Thread.sleep(1200);
		
		driver.findElement(By.xpath("(//lightning-base-combobox-item[@class='slds-media slds-listbox__option slds-media_center slds-media_small slds-listbox__option_plain'])[4]")).click();
				
		driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']")).click();
		WebElement n = driver.findElement(By.xpath("//slot[@class='slds-page-header__title slds-m-right--small slds-align-middle clip-text slds-line-clamp']/lightning-formatted-text"));
		String name = n.getText();
		System.out.println(name);
		
		if(n.isDisplayed()) {
			System.out.println("Verification: True");
		}else {
			System.out.println("Verification: False");
		}
		
				
		
	}

}
