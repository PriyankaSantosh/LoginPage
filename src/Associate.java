import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Associate {
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
	driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
	driver.findElement(By.xpath("//a[@href='/node/add/associate']")).click();
	driver.findElement(By.xpath("//input[@id='edit-title']")).sendKeys("SSRG");
	driver.findElement(By.xpath("//textarea[@id='edit-body-und-0-value']")).sendKeys("cnbanbdnba");
	driver.findElement(By.xpath("//button[@id='edit-submit']")).click();
}
}
