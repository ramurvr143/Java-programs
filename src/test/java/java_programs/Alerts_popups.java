package java_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_popups {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.findElement(By.id("alertBtn")).click();
		driver.findElement(By.id("confirmBtn")).click();

		String alerttext = driver.switchTo().alert().getText();
		String expect = "Press a button!";
		System.out.println(alerttext);
		if(expect.equals(alerttext)) {
			driver.switchTo().alert().accept();
		}else
			driver.switchTo().alert().dismiss();
		
		driver.quit();
		
		
	}

}
