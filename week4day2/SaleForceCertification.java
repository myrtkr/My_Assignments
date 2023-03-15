package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class SaleForceCertification {

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
        driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> window = driver.getWindowHandles();
		System.out.println(window);
		List<String> window1 = new ArrayList<String>(window);
		
		System.out.println("Total windows: "+window1.size());
		
		driver.switchTo().window(window1.get(1));
		Thread.sleep(800);
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		Shadow s= new Shadow(driver);
		s.findElementByXPath("//span[text()='Learning']").click();
		
		Thread.sleep(800);
		WebElement learn = s.findElementByXPath("//span[text()='Learning on Trailhead']");
		
		Actions builder =new Actions(driver);
		builder.moveToElement(learn).perform();
		
		s.findElementByXPath("//a[text()='Salesforce Certification']").click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='roleMenu-item_text'])[2]")).click();
		String url= driver.getCurrentUrl();
		System.out.println("url: "+url);
		
		WebElement text = driver.findElement(By.xpath("//div[@class='slds-container--center slds-container--medium slds-p-vertical--large']/div"));
		String t = text.getText();
		System.out.println("Summary"+t);
		List<WebElement> listCerti = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println("List of Salesforce Architect Certifications Available: "+listCerti.size());
		
		for (int i = 0; i < listCerti.size(); i++) {
			String name= listCerti.get(i).getText();
			System.out.println((i+1)+": " +name);
		}
		
		driver.findElement(By.xpath("//div[@class='credentials-card_title']/a")).click();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='credentials-card_title']/a"));
		System.out.println("List of Application Architect: "+list.size());
		
		for (int i = 0; i < list.size(); i++) {
			String name= list.get(i).getText();
			System.out.println((i+1)+": " +name);
		}
		driver.quit();
		
		
		/*
		 * 1. Launch Salesforce application https://login.salesforce.com/
2. Login with Provided Credentials
3. Click on Learn More link in Mobile Publisher and click Confirm
4. Click Learning and Mouse hover on Learning On Trailhead
5. Select SalesForce Certification
6. Choose Your Role as Salesforce Architect and verify the URL
7. Get the Text(Summary) of Salesforce Architect
8. Get the List of Salesforce Architect Certifications Available
9. Click on Application Architect
10.Get the List of Certifications available
		 * 
		 */

	}

}
