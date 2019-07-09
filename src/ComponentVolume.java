import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ComponentVolume {
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
	driver.get("http://dev.ebloodbanking.com/node/1883462");
	WebElement ele4 = driver.findElement(By.xpath("//a[text()='Create Crossmatch Report']"));
	JavascriptExecutor executor4 = (JavascriptExecutor)driver;
	executor4.executeScript("arguments[0].click();", ele4);	
	driver.findElement(By.id("edit_field_crossmatch_patient_und_chosen")).click();
	driver.findElement(By.xpath("//li[text()=' 321321 A1 Pos @ 20190219 ']")).click();
	driver.findElement(By.xpath("//select[@id='edit-field-compatibility-und']")).click();
	
	driver.findElement(By.xpath("//option[@value='Yes']")).click();
	
	driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
	driver.findElement(By.xpath("//option[@value='4973']")).click();
	
	WebElement ele5 = driver.findElement(By.id("edit-submit"));
	JavascriptExecutor executor5 = (JavascriptExecutor)driver;
	executor5.executeScript("arguments[0].click();", ele5);
	System.out.println("Component volume not present");
	
	
	
}

}
