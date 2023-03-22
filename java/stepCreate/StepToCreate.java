package stepCreate;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepToCreate {
	
	public ChromeDriver driver;
	
	@Given("Launch the browser and maximize and load the url")
	public void precondition() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("disable-notifications");
	    driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@And("Enter username")
	public void userName() {
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		}
	
	@And("Enter the password")
	public void password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		}
	
	@When("Click on the login button")
	public void clickLogin() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	
	@Then("Verify that login is successful")
	public void verifyLogin() {
			String title= "Leaftaps - TestLeaf Automation Platform";
			String s = driver.getTitle();
			Assert.assertEquals(title, s);
		}
	
	
	@When("Click on Leads")
	public void clickCRM() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		
	}
	
	
	@And("Click on Create Lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
		}
	
	@Then("Verify the create lead page is open")
	public void verifyCreateLdopen() {
		String createPage = driver.getTitle();
		String actualT = "Create Lead | opentaps CRM";
		Assert.assertEquals(actualT,createPage);
				
	}
	
	@When("Enter Company name and First name and Last name")
	public void enterDetails() {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MYR");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("THK");
	}
	
	@Then("Click on create lead")
	public void leadCreated() {
		driver.findElement(By.name("submitButton")).click();
		}
	
	@And("Verify New Lead has been created")
	public void verifyNewLead() {
		String newLead = driver.getTitle();
		String newActual = "View Lead | opentaps CRM";
		Assert.assertEquals(newActual,newLead);
		driver.close();
	}
	
	
	
	
	
	
	

}
