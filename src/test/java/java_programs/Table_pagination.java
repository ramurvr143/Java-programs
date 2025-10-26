package java_programs;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table_pagination {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://testautomationpractice.blogspot.com/");
        List<WebElement> page = driver.findElements(By.xpath("//ul[@id='pagination']//a"));
        System.out.println("total pages " +page.size());
        for(int p=1;p<=page.size();p++) {
        	driver.findElement(By.xpath("//a[normalize-space()='"+p+"']")).click();
        	Thread.sleep(2000);
        
        WebElement table = driver.findElement(By.id("productTable"));
        
        List<WebElement> rows = table.findElements(By.tagName("tr"));
        System.out.println("no of rows " + rows.size());
        for(int i =1;i<rows.size();i++) {
        	List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
        	for(WebElement col : cols) {
        		
        		System.out.println(col.getText()+"|");
        		
        	}
        	String productName = cols.get(1).getText(); // 2nd column = Name
            if (productName.equalsIgnoreCase("Laptop")) {
                WebElement checkbox = cols.get(cols.size() - 1).findElement(By.tagName("input"));
                checkbox.click();
                File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
                FileUtils.copyFile(shot, new File("screen1.png"));
                System.out.println(" [Checkbox for Laptop Selected]");
            }
        	System.out.println();
       
         }
        
        
      
	}
        driver.quit();
}
}
