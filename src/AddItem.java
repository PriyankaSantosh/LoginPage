import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddItem {
static{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://dev.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("edit-name")).sendKeys("test_admin");
	driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
	driver.findElement(By.id("edit-submit")).click();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[21]")).click();
	driver.findElement(By.xpath("(//a[@href='/node/add/item'])[1]")).click();
	driver.findElement(By.xpath("//input[@id='edit-title']")).sendKeys("bagggg");
	driver.findElement(By.xpath("//input[@id='edit-field-threshold-und-0-value']")).sendKeys("55");
	driver.findElement(By.xpath("//select[@id='edit-field-item-type-und']")).click();
	driver.findElement(By.xpath("//option[@value='Consumable']")).click();
	driver.findElement(By.xpath("//select[@id='edit-field-item-category-und']")).click();
	driver.findElement(By.xpath("//option[@value='22']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-volume-und-0-value']")).sendKeys("500");
	driver.findElement(By.xpath("//select[@id='edit-field-type-of-blood-bag-und']")).click();
	driver.findElement(By.xpath("//option[@value='Triple']")).click();
	driver.findElement(By.xpath("//input[@id='edit-field-supplier-poc-und-0-value']")).sendKeys("lila");
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
	
}

}
