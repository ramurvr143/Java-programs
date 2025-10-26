package java_programs;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowshanddle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://the-internet.herokuapp.com/windows");
		String firstwindow = driver.getWindowHandle();
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> allwindows = driver.getWindowHandles();
		for(String window : allwindows) {
			if(!window.equals(firstwindow)) {
				driver.switchTo().window(window);
				System.out.println("new window title " + driver.getTitle());
			}
		}
		
	}

}
