package java_programs;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://mytravel.org.in/");
		
		driver.findElement(By.xpath("//button[normalize-space()='Pick a date']")).click();
		String month ="October, 2025";
		while(true) {
			String actualmonth = driver.findElement(By.className("dp_caption")).getText();
			System.out.println(actualmonth);
			
			if (month.equals(actualmonth)) {
				WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
				WebElement elements = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[normalize-space()='20']")));
				elements.click();
				Thread.sleep(5000);
				break;
			}
			else {
				driver.findElement(By.className("dp_next")).click();
			}
			
		}
		
		driver.close();
	}
	
	

}
