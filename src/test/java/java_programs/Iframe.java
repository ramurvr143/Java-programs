package java_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.findElement(By.cssSelector("div[aria-label='Close']")).click();

		
		
		driver.switchTo().frame("mce_0_ifr");
		WebElement text = driver.findElement(By.id("tinymce"));
		//text.clear();
		text.sendKeys(Keys.CONTROL+"a");
		text.sendKeys(Keys.DELETE);
	    text.sendKeys("I thing i switch the frame");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		String footer = driver.findElement(By.id("page-footer")).getText();
		System.out.println(footer);
		
		

	}

}
