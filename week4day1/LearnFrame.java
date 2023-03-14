package week4day1;
import java.time.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnFrame {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions option = new ChromeOptions();
        //option.addArguments("disable-notifications");
		option.addArguments("--remote-allow-origins=*");
        ChromeDriver driver=new ChromeDriver(option);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));

        driver.get("https://jqueryui.com/droppable/");
        
        Thread.sleep(800);
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        Actions b = new Actions(driver);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        b.dragAndDrop(drag, drop).perform();
        
        
    


	    
	        
	

	}

}
