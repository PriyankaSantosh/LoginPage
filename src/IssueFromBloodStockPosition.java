import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IssueFromBloodStockPosition {
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
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[11]")).click();
		
		driver.findElement(By.xpath("//a[@href='/BloodStockPosition']")).click();
		driver.findElement(By.xpath("//option[@value='FFP']")).click();
		driver.findElement(By.xpath("//option[@value='Ready for Issue']")).click();
		driver.findElement(By.xpath("//option[@value='A1']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-rh-value']")).click();
		driver.findElement(By.xpath("//option[@value='Pos']")).click();
		driver.findElement(By.xpath("//button[@value='Apply']")).click();
		
		WebElement ele5= driver.findElement(By.xpath("(//td[@class='views-field views-field-title']/a)[1]"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", ele5);
		
		/*WebElement ele41 = driver.findElement(By.xpath("//a[@href='/node/1883999']"));
		JavascriptExecutor executor41 = (JavascriptExecutor)driver;
		executor41.executeScript("arguments[0].click();", ele41);	*/
		
		//driver.findElement(By.xpath("//a[@href='/node/1883999']")).click();
		WebElement ele4 = driver.findElement(By.xpath("//a[text()='Create Crossmatch Report']"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", ele4);	
		
		driver.findElement(By.xpath("//div[@id='edit_field_crossmatch_patient_und_chosen']")).click();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		
driver.findElement(By.xpath("//li[text()=' 12222 A1 Pos @ meena ']")).click();
		
		
		driver.findElement(By.xpath("//select[@id='edit-field-compatibility-und']")).click();
		
		driver.findElement(By.xpath("//option[@value='Yes']")).click();
		
		driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
		driver.findElement(By.xpath("//option[@value='4973']")).click();
		
		WebElement ele51 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor51 = (JavascriptExecutor)driver;
		executor51.executeScript("arguments[0].click();", ele51);
		
		WebElement ele6 = driver.findElement(By.xpath("//a[text()='Issue/Reserve']"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele6);
		
		WebElement ele7 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor7 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele7);
		

	
		
		
		

		}
}
