package week5day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Basic {
	
	ChromeDriver driver;
	
	
	@Parameters({"browser","url","username", "password"})
	
	@BeforeMethod
	public void preConditions(String browser,String url,String username,String password){
		if(browser.equalsIgnoreCase("chrome")) {
			ChromeOptions option = new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			option.addArguments("disable-notifications");
			driver=new ChromeDriver(option);
		}
		else {
			System.out.println("No browser");
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("Login")).click();
		
	}
	
	@AfterMethod
	public void postConditions(){
		driver.close();
	}

}
