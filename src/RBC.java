import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RBC {
	static{

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://dev.ebloodbanking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("test_admin");
		driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
		driver.findElement(By.id("edit-submit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[11]")).click();
		driver.findElement(By.xpath("//a[@href='/BloodStockPosition']")).click();
		driver.findElement(By.xpath("//option[@value='Plt']")).click();
		driver.findElement(By.xpath("//option[@value='Ready for Issue']")).click();
		
		driver.findElement(By.xpath("//select[@id='edit-date-filter-op']")).click();
		driver.findElement(By.xpath("(//option[@value='between'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='edit-date-filter-min-datepicker-popup-0']")).click();
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[@value='2']")).click();
		
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[@value='2019']")).click();
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='1']")).click();
		
		driver.findElement(By.xpath("//input[@id='edit-date-filter-max-datepicker-popup-0']")).click();
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[@value='2']")).click();
		
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[@value='2019']")).click();
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='28']")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		WebElement ele2111 = driver.findElement(By.xpath("//button[@value='Apply']"));
		JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
		executor2111.executeScript("arguments[0].click();", ele2111);
		
		
		WebElement ele22 = driver.findElement(By.xpath("(//td[@class='views-field views-field-title']/a)[1]"));
		JavascriptExecutor executor22 = (JavascriptExecutor)driver;
		executor22.executeScript("arguments[0].click();", ele22);
		
	//	driver.findElement(By.xpath("(//td[@class='views-field views-field-title']/a)[1]")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.xpath("//input[@value='Choose some options']")).click();
		driver.findElement(By.xpath("//li[text()='RBC contaminated']")).click();
		
		WebElement ele8 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor8 = (JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();", ele8);
		
		
		WebElement ele6 = driver.findElement(By.xpath("//a[text()='Issue/Reserve']"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele6);
		
		WebElement ele7 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor7 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele7);
	}
}
