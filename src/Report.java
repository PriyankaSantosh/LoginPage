import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Report {
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
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[16]")).click();
		driver.findElement(By.xpath("//a[@href='/Reports/MasterRegister']")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		WebElement ele6 = driver.findElement(By.xpath("//img[@src='http://dev.ebloodbanking.com/sites/all/modules/views_data_export/images/xls.png']"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele6);
		

		//driver.findElement(By.xpath("//img[@src='http://dev.ebloodbanking.com/sites/all/modules/views_data_export/images/xls.png']")).click();

		}
		
}
