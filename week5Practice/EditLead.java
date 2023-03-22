package week5Practice;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class EditLead extends Base{
	
	@BeforeTest
	public void getData1() {
		dataFile= "EditLead";
	}

	@Test(dataProvider="getDT")
	
	public void editLead(String fn, String cn) throws InterruptedException {
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys(fn);
		
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement company = driver.findElement(By.id("updateLeadForm_companyName"));
		company.clear();
		company.sendKeys(cn);
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}






