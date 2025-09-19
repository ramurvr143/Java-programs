package java_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webdriver_comands {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.get("https://engagebay.com");
		String title =driver.getTitle();
		String url =driver.getCurrentUrl();
		//String source = driver.getPageSource();
		WebElement element = driver.findElement(By.xpath("//li[@class='nav-item nav-item-line']//a[@class='nav-link cursor-pointer'][normalize-space()='Pricing']"));
		String attributevalue = element.getAttribute("class");
		
		System.out.println(title);
		System.out.println(url);
		//System.out.println(source);
		System.out.println(attributevalue);
		
	}

}
