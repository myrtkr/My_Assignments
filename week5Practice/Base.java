package week5Practice;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


public class Base {
	
	RemoteWebDriver driver;
	public String dataFile;
	
	@Parameters({"browser","url","username","password"})

	@BeforeMethod
	public void preConditions(String browser,String url,String username,String password){
	if(browser.equalsIgnoreCase("chrome")) {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		option.addArguments("disable-notifications");
		driver=new ChromeDriver(option);
	}
	else if(browser.equalsIgnoreCase("edge")){
		driver= new EdgeDriver();
	}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
	}
	
	
	@AfterMethod
	public void postConditions() {
		driver.close();
	}
	
	@DataProvider(name="getDT")
	public String[][] fetch() throws IOException {
		
		return ReadExcelData.readFromXL(dataFile);
	}

}
