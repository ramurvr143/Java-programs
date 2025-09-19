package java_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass_dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		WebElement drop = driver.findElement(By.id("country"));
		Select sel = new Select(drop);
		
		sel.selectByIndex(3);
		Thread.sleep(2000);
		
		sel.selectByValue("india");
		Thread.sleep(2000);

		sel.selectByVisibleText("Australia");
		
		WebElement selectedelement = sel.getFirstSelectedOption();
		System.out.println("selected option"  + selectedelement.getText());
		

	}

}
