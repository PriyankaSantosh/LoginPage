import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddNewConsume {
static{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://dev.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("edit-name")).sendKeys("test_technician");
	driver.findElement(By.id("edit-pass")).sendKeys("test_technician");
	driver.findElement(By.id("edit-submit")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[21]")).click();
	driver.findElement(By.xpath("//a[text()='Add New Consume']")).click();
	/*driver.findElement(By.xpath("//input[@id='edit-field-transaction-date-und-0-value-datepicker-popup-0']")).click();
	driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
	driver.findElement(By.xpath("//option[@value='1']")).click();
	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
	driver.findElement(By.xpath("//option[@value='2019']")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 500);// 1 minute 
	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[ui-state-default ui-state-highlight]"))).click();*/
	
	driver.findElement(By.xpath("//div[@id='edit_field_item_und_chosen']")).click();
	WebElement element = driver.findElement(By.xpath("//span[contains(text(),'BLOOD')]"));
	Actions action = new Actions(driver);
	action.moveToElement(element).click().perform();
	//driver.findElement(By.xpath("//span[contains(text(),'BLOOD')]")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-item-quantity-und-0-value']")).sendKeys("8");
	//driver.findElement(By.xpath(""));

	
}

}
