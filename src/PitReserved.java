import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PitReserved {
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
		driver.findElement(By.xpath("//option[@value='Reserved']")).click();
		/*WebElement link = driver.findElement(By.xpath("//option[@value='Ready for Issue']"));
		Actions action= new Actions(driver);
		action.sendKeys(Keys.CONTROL).click(link).perform();*/
		
		WebElement link1 = driver.findElement(By.xpath("//option[@value='Ready for Issue']"));
		Actions action1= new Actions(driver);
		action1.sendKeys(Keys.CONTROL).click(link1).perform();
		
		driver.findElement(By.xpath("//select[@id='edit-date-filter-op']")).click();
		driver.findElement(By.xpath("(//option[@value='between'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='edit-date-filter-min-datepicker-popup-0']")).click();
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[@value='1']")).click();
		
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[@value='2019']")).click();
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='1']")).click();
		
		driver.findElement(By.xpath("//input[@id='edit-date-filter-max-datepicker-popup-0']")).click();
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		driver.findElement(By.xpath("//option[@value='1']")).click();
		
		
		driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
		driver.findElement(By.xpath("//option[@value='2019']")).click();
		
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//a[text()='28']")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		/*driver.findElement(By.xpath("(//option[text()='Is equal to'])[1]")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@id='edit-date-filter-value-datepicker-popup-0']")).sendKeys("28 Feb 2019");
		WebElement ele6 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele6);
*/

		WebElement ele7 = driver.findElement(By.xpath("(//td[@class='views-field views-field-title']/a)[1]"));
		JavascriptExecutor executor7 = (JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();", ele7);
		
		WebElement ele8 = driver.findElement(By.xpath("//a[text()='Issue/Reserve']"));
		JavascriptExecutor executor8 = (JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();", ele8);

		//driver.findElement(By.xpath("//a[text()='Issue/Reserve']")).click();
		driver.findElement(By.id("edit_patient_id_chosen")).click();
		driver.findElement(By.xpath("//li[@data-option-array-index='1']")).click();
		WebElement ele71 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor71 = (JavascriptExecutor)driver;
		executor71.executeScript("arguments[0].click();", ele71);




	}
}
