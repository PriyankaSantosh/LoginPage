import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OutWardTransferPositive {
	static{

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
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
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[5]")).click();
		driver.findElement(By.xpath("(//a[@href='/outward-transfers-list'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='/node/add/demand-challan']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-dc-issue-time-und-0-value-datepicker-popup-0']")).sendKeys("5 Mar 2019");
		driver.findElement(By.xpath("//input[@id='edit-field-dc-issue-time-und-0-value-timeEntry-popup-1']")).sendKeys("10:00");
		driver.findElement(By.xpath("//select[@id='edit-field-dc-issue-centre-und']")).click();
		driver.findElement(By.xpath("(//option[text()='Test Blood Bank'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-dc-destination-und-0-value']")).sendKeys("mg road");
		driver.findElement(By.xpath("//input[@id='edit-field-dc-dispatch-through-und-0-value']")).sendKeys("adv");
		driver.findElement(By.xpath("//textarea[@id='edit-field-dc-bb-numbers-und-0-value']")).sendKeys("88522-FFP");
		
		WebElement ele11 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor11 = (JavascriptExecutor)driver;
		executor11.executeScript("arguments[0].click();", ele11);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='edit-search-text']")).sendKeys("88522-FFP");
		WebElement ele111 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor111 = (JavascriptExecutor)driver;
		executor111.executeScript("arguments[0].click();", ele111);
			




	}

}