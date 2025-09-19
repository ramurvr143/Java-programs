package java_programs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Makemytrip {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.makemytrip.com/");
		
		try {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@class='commonModal__close']")));
		element.click();
		}
		catch (Exception e) {
			System.out.println("popup not displayed");
		}
		
		driver.findElement(By.cssSelector("label[for='departure'] span[class='lbl_input appendBottom10']")).click();
		Thread.sleep(2000);
		String departmonth = "September 2025";
		String returnmonth = "September2025";
		
		while (true) {
			String exdepartmonth = driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
			System.out.println(exdepartmonth);
			if(departmonth.equals(exdepartmonth)) {
				driver.findElement(By.xpath("//div[@aria-label='Wed Sep 17 2025']//div[@class='dateInnerCell']")).click();
				Thread.sleep(3000);
				break;
				

			}else
			{
				driver.findElement(By.className("DayPicker-NavButton DayPicker-NavButton--next")).click();
			}
			
		
		}
		
		driver.findElement(By.xpath("//span[normalize-space()='Return']")).click();
		Thread.sleep(3000);

		while (true) {
			String exreturnmonth = driver.findElement(By.xpath("//body/div[@id='root']/div[@id='top-banner']/div[@class='minContainer']/div/div[@class='flightWidgetSection appendBottom40']/div/div[@class='searchWidgetContainer']/div[@class='fltWidgetSection appendBottom40 primaryTraveler ']/div[@class='fsw widgetOpen']/div[@class='fsw_inner returnPersuasion']/div[@class='flt_fsw_inputBox dates inactiveWidget ']/div[@class='datePickerContainer']/div[@class='flightCalOverlay']/div[@class='dayPickerFlightWrap']/div[@class='RangeExample']/div[@class='DayPicker Selectable Range']/div[@class='DayPicker-wrapper']/div[@class='DayPicker-Months']/div[1]/div[1]/div[1]")).getText();
			System.out.println(exreturnmonth);
			if(returnmonth.equals(exreturnmonth)) {
				driver.findElement(By.xpath("//div[@aria-label='Fri Sep 19 2025']//div[@class='dateInnerCell']")).click();
				Thread.sleep(3000);
				break;

			}else
			{
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
	
	}
		driver.quit();
	}
}
