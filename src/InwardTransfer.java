import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InwardTransfer {
static
{
	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://dev.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("edit-name")).sendKeys("test_admin");
	driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
	driver.findElement(By.id("edit-submit")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[5]")).click();
	driver.findElement(By.xpath("//a[@href='/inward-transfers']")).click();
	driver.findElement(By.xpath("//a[@href='/node/add/inward-transfer']")).click();
	driver.findElement(By.id("edit-title")).sendKeys("iuii");
	driver.findElement(By.id("edit-field-it-blood-bank-und")).click();
	driver.findElement(By.xpath("//option[@value='13847']")).click();
	
	driver.findElement(By.id("edit-field-it-transfer-date-und-0-value-datepicker-popup-0")).click();
	driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
	driver.findElement(By.xpath("//option[@value='2']")).click();
	
	
	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
	driver.findElement(By.xpath("//option[@value='2019']")).click();
	
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[text()='8']")).click();
	File f=new File("./inwardTransfer/sheetnew.csv");
	
	String path=f.getAbsolutePath();
	driver.findElement(By.id("edit-field-file-und-0-upload")).sendKeys(path);
	
	
	driver.findElement(By.xpath("//button[@id='edit-field-file-und-0-upload-button']")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[@value='Save']")).click();
	driver.findElement(By.xpath("//a[text()='Transfer Units to Blood Bank']")).click();
	driver.findElement(By.xpath("//button[text()='Transfer Units to Blood Bank']")).click();
	
}

}
