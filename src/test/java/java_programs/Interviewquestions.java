package java_programs;


import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Interviewquestions {

    public static void main(String[] args) {
    	String downloadPath = System.getProperty("user.home") + "/Downloads";
    	 // Create Chrome preferences
        Map<String, Object> prefs = new HashMap<String, Object>();
       
       prefs.put("download.default_directory", downloadPath);
       prefs.put("download.prompt_for_download", false);
       prefs.put("download.directory_upgrade", true);

        // Set Chrome options, including maximizing the window
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized--");
        options.setExperimentalOption("prefs", prefs);

    	WebDriver driver = new ChromeDriver(); 
    	
        try {
            driver.get("https://demo.automationtesting.in/FileDownload.html");

            driver.findElement(By.xpath("//a[@type='button']")).click();

            Thread.sleep(30000); // Wait for download

            File downloadedFile = new File(downloadPath + "/samplefile.pdf");

            if (downloadedFile.exists()) {
                System.out.println("File downloaded successfully!");
            } else {
                System.out.println("File not found!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
