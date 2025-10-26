package java_programs;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlinkpage {
	public static void main(String[] arg) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://app.engagebay.com");
		java.util.List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("print links count " +links.size());
		
		for(WebElement link : links) {
			String url = link.getAttribute("href");
			
			if(url == null||url.isEmpty()) {
				System.out.println("url is not configure properly");
			continue;
			}
			try {
				
				HttpURLConnection connection = (HttpURLConnection) (new URL(url).openConnection());
				connection.setRequestMethod("HEAD");
				connection.connect();
				int responsecode = connection.getResponseCode();
				
				if(responsecode >= 400) System.out.println(url + "url broken("+responsecode+" )");
				else System.out.println(url+ "url is working ("+responsecode+")");	
				
			}catch (Exception e) {
				// TODO: handle exception
				System.out.println("exception message :" + e.getMessage());
			}
				
			
		
		}
		
		
	}

}
