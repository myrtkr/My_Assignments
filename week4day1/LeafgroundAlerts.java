package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LeafgroundAlerts {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.leafground.com/alert.xhtml");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		driver.findElement(By.xpath("//div[@class='card']//span")).click();
		Alert a = driver.switchTo().alert();
		a.accept();
		System.out.println("done simple");
		
		driver.findElement(By.xpath("(//div[@class='card']//span)[4]")).click();
		Alert b = driver.switchTo().alert();
		b.dismiss();
		System.out.println("done confirm");
		Thread.sleep(800);
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();		
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		System.out.println("done sweet simple dialog");
		
		Thread.sleep(800);
		driver.findElement(By.xpath("(//span[contains(@class,'ui-button-icon-left ui-icon ui-c pi pi-external-link')])[4]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-closethick')])[2]")).click();
		System.out.println("done simple sweet modal dialog");
		
		Thread.sleep(800);
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='Yes']")).click();		
		System.out.println("done sweet confirm");
		
		Thread.sleep(800);
		driver.findElement(By.xpath("((//div[@class='card'])[5])//span")).click();
		Alert f = driver.switchTo().alert();
		f.sendKeys("myr");
		f.accept();
		String text = driver.findElement(By.xpath("//span[@id='confirm_result']")).getText();
		System.out.println(text);
		System.out.println("Done promt");
		
		Thread.sleep(800);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'ui-icon ui-icon-closethick')])[3]")).click();
		System.out.println("Done last one");
		
		
		driver.close();

	}

}
