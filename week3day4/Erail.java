package week3day4;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;




public class Erail {

	public static void main(String[] args) throws Throwable {
		ChromeOptions option = new ChromeOptions();
        //option.addArguments("disable-notifications");
		option.addArguments("--remote-allow-origins=*");
        ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	
		WebElement city = driver.findElement(By.id("txtStationTo"));
		city.clear();
		city.sendKeys("CO",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
		Thread.sleep(2000);
        
        List<WebElement> colList = driver.findElements(By.xpath("//div[@id='divTrainsList']//tbody//td[2]"));
		
		
		for (int i = 0; i <= colList.size()-7; i++) {
					
			String cL=colList.get(i).getText();
			System.out.println(cL);
					
		}
		
		Thread.sleep(2000);
		driver.close();
		
		

	}

}
