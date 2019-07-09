import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DEEmo {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.get("http://dev.bmtplus.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
	driver.findElement(By.id("edit-submit")).click();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://dev.bmtplus.com/patients?=&tid%5B%5D=10");
	driver.findElement(By.xpath("//a[@href='/content/tsa18123'] ")).click();
	JavascriptExecutor j=(JavascriptExecutor)driver;

	for(int i=1;i<=10;i++)
	{
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(300);
	}
	
		
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	WebElement ele5 = driver.findElement(By.xpath("//a[@href='/node/add/clinical-course/349855']"));
	JavascriptExecutor executor5 = (JavascriptExecutor)driver;
	executor5.executeScript("arguments[0].click();", ele5);

	
	}


	}

