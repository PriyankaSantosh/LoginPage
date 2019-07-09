import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddSupplier {
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
	driver.findElement(By.xpath("//a[@href='/node/add/supplier']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-supplier-poc-und-0-value']")).sendKeys("Aman");
	driver.findElement(By.xpath("//input[@id='edit-field-supplier-email-und-0-email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//textarea[@id='edit-field-supplier-address-und-0-value']")).sendKeys("yduayduyuays");
	driver.findElement(By.xpath("//textarea[@id='edit-field-product-summary-und-0-value']")).sendKeys("dfgfghg");
	WebElement ele1 = driver.findElement(By.id("edit-submit"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
}


}
