package week5Practice;



import org.openqa.selenium.By;

import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;


public class CreateLead extends Base{
	
	@BeforeTest
	
	public void getDT() {
		dataFile= "CreateLead";
	}
	
	
	@Test(dataProvider="getDT")

	public void createLead(String cn,String fn,String ln) {
		
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cn);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fn);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(ln);
		driver.findElement(By.name("submitButton")).click();


	}	
	


		
	
	
}






