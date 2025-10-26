package java_programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tablebase {

	
	    WebDriver driver;
	    WebElement table;

	    // Constructor
	    public  Tablebase(WebDriver driver, String tableLocator) {
	        this.driver = driver;
	        this.table = driver.findElement(By.xpath(tableLocator));
	    }

	    // Get total rows (tbody only, excluding headers)
	    public int getRowCount() {
	        List<WebElement> rows = table.findElements(By.xpath("//body[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div[4]/div[1]/div[1]/div[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]"));
	        return rows.size();
	    }

	    // Get total columns (from first row)
	    public int getColCount() {
	        List<WebElement> cols = table.findElements(By.xpath("//td[normalize-space()='Learn Selenium']"));
	        return cols.size();
	    }

	    // Get cell value by row & column (1-based index)
	    public String getCellValue(int row, int col) {
	        WebElement cell = table.findElement(By.xpath(".//tbody/tr[" + row + "]/td[" + col + "]"));
	        return cell.getText();
	    }

	    // Click button/link inside a cell
	    public void clickCellElement(int row, int col) {
	        WebElement element = table.findElement(By.xpath(".//tbody/tr[" + row + "]/td[" + col + "]//*"));
	        element.click();
	    }

	    // Get entire row values
	    public String getRowData(int row) {
	        List<WebElement> cols = table.findElements(By.xpath(".//tbody/tr[" + row + "]/td"));
	        StringBuilder rowData = new StringBuilder();
	        for (WebElement col : cols) {
	            rowData.append(col.getText()).append(" | ");
	        }
	        return rowData.toString();
	    }

	    // Find row number by cell text
	    public int getRowByCellText(String text) {
	        List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr"));
	        for (int i = 0; i < rows.size(); i++) {
	            if (rows.get(i).getText().contains(text)) {
	                return i + 1; // return row index (1-based)
	            }
	        }
	        return -1; // not found
	    }
	}


