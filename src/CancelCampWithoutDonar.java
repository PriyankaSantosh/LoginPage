import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CancelCampWithoutDonar {
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
	driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
	driver.findElement(By.xpath("//a[text()='Camp List']")).click();
	driver.get("http://dev.ebloodbanking.com/node/1304203");
	
	WebElement ele6=driver.findElement(By.xpath("//a[text()='Cancel Camp']"));
JavascriptExecutor executor6 = (JavascriptExecutor)driver;
	executor6.executeScript("arguments[0].click();", ele6);
	
	
	//driver.findElement(By.xpath("//a[text()='Cancel Camp']")).click();
	WebElement ele5= driver.findElement(By.id("edit-submit"));
	JavascriptExecutor executor5 = (JavascriptExecutor)driver;
	executor5.executeScript("arguments[0].click();", ele5);
	if(By.xpath("//div[@class='alert alert-block alert-dismissible alert-success messages status']") != null)
	{
		System.out.println("camp has been successfully cancelled.");
	}
	else
	{
		System.out.println("cannot cancel the camp ");
		
		
		
		
	}
}
}


