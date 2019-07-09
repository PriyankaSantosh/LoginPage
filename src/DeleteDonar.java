import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteDonar {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
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
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='/enrolled-donors']")).click();
		driver.findElement(By.xpath("(//td[@class='views-field views-field-title'])[1]/a")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//button[@value='Delete']"));
		JavascriptExecutor executor1=(JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", ele1);
		
		WebElement ele2= driver.findElement(By.xpath("//button[@value='Delete']"));
		JavascriptExecutor executor2=(JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele2);
		
		//driver.findElement(By.xpath("//button[@value='Delete']")).click();
		}
		
}
