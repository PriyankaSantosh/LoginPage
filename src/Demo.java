import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://dev.ebloodbanking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("test_admin");
		driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
		driver.findElement(By.id("edit-submit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[21]")).click();
	driver.findElement(By.xpath("//a[@href='/inventory/stockreport']")).click();
	driver.findElement(By.xpath("//select[@id='edit-tid']")).click();
	driver.findElement(By.xpath("//option[text()='Blood Bags']")).click();
	driver.findElement(By.xpath("//input[@id='edit-title']")).sendKeys("jala");
	Thread.sleep(3000);
	
	WebElement ele211 = driver.findElement(By.xpath("//button[@value='Apply']"));
	JavascriptExecutor executor211 = (JavascriptExecutor)driver;
	executor211.executeScript("arguments[0].click();", ele211);
		}
}
