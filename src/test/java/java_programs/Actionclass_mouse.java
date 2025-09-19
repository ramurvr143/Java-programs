package java_programs;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass_mouse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		Actions action = new Actions(driver);
		WebElement dragit = driver.findElement(By.id("draggable"));
		WebElement dropin = driver.findElement(By.id("droppable"));
	
		action.dragAndDrop(dragit, dropin).build().perform();
		Thread.sleep(3000);
		
		String droptext = driver.findElement(By.id("droppable")).getText();
		System.out.println(droptext);
	    assertEquals(droptext, "Dropped!");
		driver.quit();
	}

}
