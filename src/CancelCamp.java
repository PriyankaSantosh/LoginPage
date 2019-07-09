import java.util.concurrent.TimeUnit;

import javax.print.DocFlavor.BYTE_ARRAY;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelCamp {
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
		driver.findElement(By.xpath("//a[text()='Camp List']")).click();
		driver.findElement(By.xpath("(//td[@class='views-field views-field-title']/a)[3]")).click();
		
		WebElement ele6=driver.findElement(By.xpath("//a[text()='Cancel Camp']"));
        JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele6);
		
		
		//driver.findElement(By.xpath("//a[text()='Cancel Camp']")).click();
		WebElement ele5= driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", ele5);
		if(By.xpath("//div[@class='alert alert-block alert-dismissible alert-success messages status']") != null)
		{
			System.out.println("The following donors have been added to this camp");
			System.out.println("Please update records to ensure that no donors have this camp listed before cancelling.");
		
		}
		else
		{
			System.out.println("camp has been successfully cancelled.");
		}
}
}

