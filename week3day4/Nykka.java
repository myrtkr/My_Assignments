package week3day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Nykka {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disabled-notifications");
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
				
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
		
		WebElement brands = driver.findElement(By.xpath("(//ul[contains(@class,'HeaderNav css-f7ogli')])[2]"));
		Actions b =new Actions(driver);
		b.moveToElement(brands).perform();
		driver.findElement(By.xpath("//a[text()='The Face Shop']/following::a")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
		if(title.contains("L'Oreal Paris")){
			System.out.println("title verified: True");
		
		}else{
			System.out.println("title verified: False");
		
		}
		
		driver.findElement(By.xpath("//button[@class=' css-n0ptfk']")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'control-indicator radio ')])[4]")).click();
		driver.findElement(By.xpath("//div[@class='css-xdicx1']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@class=' css-b5p5ep']/span")).click();
		
		Thread.sleep(1200);
		driver.findElement(By.xpath("(//div[@class='control-value'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//div[@class='control-value']/span[text()='Color Protection']")).click();
		
		Thread.sleep(800);
		WebElement filterS = driver.findElement(By.xpath("//div[@class='css-1emjbq5']"));
		WebElement filterC = driver.findElement(By.xpath("//div[@class='css-1emjbq5']"));
		if(filterS.isDisplayed() && filterC.isDisplayed()) {
			System.out.println("yes shampoo and color protaction are selected");
		}else {
			System.out.println("shampoo and color protaction are not selected");
		}
		Thread.sleep(2000);
		WebElement trial1 = driver.findElement(By.xpath("//div[@class='css-1rd7vky']"));
		trial1.click();
		String tr= trial1.getText();
		System.out.println(tr);
		//driver.close();
		Set<String> window = driver.getWindowHandles();
		System.out.println(window);
		List<String> window1 = new ArrayList<String>(window);
		
		System.out.println("Total windows: "+window1.size());
		
		driver.switchTo().window(window1.get(1));
		
		opt.addArguments("disabled-notifications");
		opt.addArguments("--remote-allow-origins=*");
				
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,' css-1r0ze8m')]/span")).click();
		WebElement mrp = driver.findElement(By.xpath("//span[text()='₹209']"));
		String mrpR=mrp.getText();
		System.out.println("MRP of 1st product: "+mrpR);
		driver.findElement(By.xpath("//div[@class='css-atcw01']//button")).click();
		driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
		driver.findElement(By.xpath("//span[@class='cart-count']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(0);
			
		String t= driver.getTitle();
		System.out.println(t);
		
		WebElement grandTotal = driver.findElement(By.xpath("(//div[@class='css-11m81vr e1d9ugpt3']/p)[3]"));
		grandTotal.click();
		String gT=grandTotal.getText();
		System.out.println("Grand Total: "+gT);
		
		driver.quit();

	}

}
