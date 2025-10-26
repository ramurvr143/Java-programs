package java_programs;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_table {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://testautomationpractice.blogspot.com/");
        
        WebElement table = driver.findElement(By.id("taskTable"));
        
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println("number of rows "+rows.size());
        
        for(int i =1; i<rows.size();i++) {
        	List<WebElement>cols = rows.get(i).findElements(By.tagName("td"));
        	for(WebElement col : cols) {
        		System.out.print(col.getText()+ "|");
        	}
        }
        
        System.out.println();
        driver.quit();
        
	}

}
