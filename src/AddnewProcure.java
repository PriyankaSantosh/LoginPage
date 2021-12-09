import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddnewProcure {
static{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://dev.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-submit")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[21]")).click();
	driver.findElement(By.xpath("//a[@href='/node/add/procure']")).click();
	Thread.sleep(5000);	
	WebElement ele1 = driver.findElement(By.xpath("//select[@id='edit-field-procure-supplier-und']"));
	JavascriptExecutor executor=(JavascriptExecutor)driver;
	executor.executeScript("arguments[0].click();", ele1);
	driver.findElement(By.xpath("//option[@value='954072']")).click();
	Thread.sleep(8000);
	
	driver.findElement(By.xpath("//input[@id='edit-field-transaction-date-und-0-value-datepicker-popup-0']")).click();
	
	driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
	driver.findElement(By.xpath("(//option[@value='1'])[3]")).click();
	
	
	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
	driver.findElement(By.xpath("//option[@value='2019']")).click();
	
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[text()='4']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-procure-invoice-number-und-0-value']")).sendKeys("1234567");
	WebElement ww = driver.findElement(By.xpath("//div[@id='edit_field_item_und_chosen']"));
//	driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("BLOOD");
	/*String xp="//span[contains(text(),'BLOOD')]";
	List<WebElement> eee = driver.findElements(By.xpath(xp));
	System.out.println(eee.size());
	for(WebElement e:eee)
{
	System.out.println(e.getText());
}
	eee.get(0).click();*/
	
	/*Thread.sleep(8000);
	driver.findElement(By.xpath("//span[contains(text(),'BLOOD')]")).click();
	*/
	
	/*WebDriverWait wait = new WebDriverWait(driver, 500);// 1 minute 
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[contains(text(),'BLOOD')]"))).click();
	*/
	
	
	driver.findElement(By.xpath("//input[@id='edit-field-procure-quantity-fc-und-0-field-procure-batch-num-und-0-value']")).sendKeys("12345");;
	driver.findElement(By.xpath("//input[@id='edit-field-procure-quantity-fc-und-0-field-item-quantity-und-0-value']")).sendKeys("4");
	driver.findElement(By.xpath("//input[@id='edit-field-procure-quantity-fc-und-0-field-procure-make-brand-und-0-value']")).sendKeys("gsdhhg");
driver.findElement(By.xpath("//input[@id='edit-field-transaction-date-und-0-value-datepicker-popup-0']")).click();
	
	driver.findElement(By.xpath("//input[@id='edit-field-procure-quantity-fc-und-0-field-procure-exp-date-und-0-value-datepicker-popup-0']")).click();
	driver.findElement(By.xpath("(//option[@value='1'])[3]")).click();
	
	
	driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
	driver.findElement(By.xpath("//option[@value='2020']")).click();
	
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);

	driver.findElement(By.xpath("//a[text()='4']")).click();
	//driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	
	WebElement ele11 = driver.findElement(By.id("edit-submit"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele11);
	
}

}
