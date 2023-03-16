package week3day4;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class SnapDeal {

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disabled-notifications");
		opt.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.snapdeal.com/");
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		WebElement moveToElement = driver.findElement(By.xpath("//span[@class='catText']"));
		Actions builder =new Actions(driver);
		builder.moveToElement(moveToElement).perform();
		Thread.sleep(600);
		driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();
		
		List<WebElement> totalShoes = driver.findElements(By.xpath("//div[contains(@class,'col-xs-6  favDp product-tuple-listing js-tuple ')]"));
		int tS= totalShoes.size();
		System.out.println(tS);
		
		driver.findElement(By.xpath("(//div[contains(@class,'child-cat-name')])[3]")).click();
		driver.findElement(By.xpath("//i[contains(@class,'sd-icon sd-icon-expand-arrow sort-arrow')]")).click();
		Thread.sleep(600);
		driver.findElement(By.xpath("//li[@class='search-li']")).click();
		Thread.sleep(1200);
		List<WebElement> filter = driver.findElements(By.xpath("//span[contains(@class,'lfloat product-price')]"));
		int f =filter.size();
		System.out.println(f);
		List<Integer> listSorted= new ArrayList<Integer>();
		for (int i = 0; i < filter.size(); i++) {
			
			String st=filter.get(i).getAttribute("display-price");
			System.out.println(st);
			int finalprice= Integer.parseInt(st);
			if(finalprice>0) {					
				listSorted.add(finalprice);
			}
			
		}Collections.sort(listSorted);
		System.out.println(listSorted);
		WebElement lowH = driver.findElement(By.xpath("//div[contains(text(),'Price Low To High')]"));
		if(lowH.isDisplayed()) {
			System.out.println("shorted by low to high: true");
		}else {
			System.out.println("shorted by low to high: false");
		}
		
		Thread.sleep(800);
		driver.findElement(By.xpath("//div[@class='child-cat-name ']")).click();
		WebElement sc = driver.findElement(By.xpath("(//button[text()='View More '])[3]"));
		Actions b= new Actions(driver);
		b.scrollToElement(sc).perform();
		sc.click();
		driver.findElement(By.xpath("//label[@for='Color_s-Yellow']/span")).click();
		
		Thread.sleep(1200);
		WebElement minP = driver.findElement(By.xpath("//input[@class='input-filter']"));
		Thread.sleep(1200);
		minP.clear();
		
		minP.sendKeys("500");
		WebElement maxP = driver.findElement(By.xpath("(//input[@class='input-filter'])[2]"));
		maxP.clear();
		maxP.sendKeys("1200");
		driver.findElement(By.xpath("//div[@class='price-go-arrow btn btn-line btn-theme-secondary']")).click();
		Thread.sleep(1200);	
		WebElement color = driver.findElement(By.xpath("//div[@class='navFiltersPill']/a"));
		Thread.sleep(1200);
		WebElement price = driver.findElement(By.xpath("//a[@data-key='Price|Price']"));
		Thread.sleep(3000);
		if(color.isDisplayed() && price.isDisplayed()) {
			System.out.println("yes yellow and price are selected");
		}else {
			System.out.println("Price and yellow are not selected");
		}
		
		WebElement firstD = driver.findElement(By.xpath("//picture[@class='picture-elem']/img"));
		b.moveToElement(firstD).perform();
		
		driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar  btn btn-theme-secondary  ')]")).click();
		System.out.println("test1");
		
		Thread.sleep(2000);
		File sr = driver.getScreenshotAs(OutputType.FILE);
		File ds = new File("./Screenshots/snap.png");
		FileUtils.copyFile(sr, ds);
		
		driver.close();


}
}	