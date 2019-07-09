import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IssuingExpiredComponents
{
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
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[11]")).click();
		driver.findElement(By.xpath("//a[@href='/BloodStockPosition']")).click();
		driver.findElement(By.xpath("//option[@value='Plt']")).click();
		driver.findElement(By.xpath("//option[@value='Ready for Issue']")).click();
		//driver.findElement(By.xpath("//option[@value='O']")).click();
	//	driver.findElement(By.xpath("//select[@id='edit-field-rh-value']")).click();
	//	driver.findElement(By.xpath("//option[@value='Pos']")).click();
		
		driver.findElement(By.id("edit-items-per-page")).click();
		driver.findElement(By.xpath("//option[@value='100']")).click();
		driver.findElement(By.xpath("//button[@id='edit-submit-bloodstockposition']")).click();
		
		WebElement ele7 = driver.findElement(By.xpath("(//td[@class='views-field views-field-title'])[1]/a"));
		JavascriptExecutor executor7 = (JavascriptExecutor)driver;
		executor7.executeScript("arguments[0].click();", ele7);
		
		
		
		/*WebElement ele4 = driver.findElement(By.xpath("(//td[@class='views-field views-field-title']/a)[86]"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", ele4);*/
		
		
		//driver.findElement(By.xpath((//td[@class='views-field views-field-title'])[36]/a).click();
		driver.findElement(By.xpath("//a[text()='Issue/Reserve']")).click();
		driver.findElement(By.xpath("//div[@id='edit_patient_id_chosen']")).click();
		driver.findElement(By.xpath("(//li[@class='active-result'])[1]")).click();
		WebElement ele5 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", ele5);
		if(By.xpath("//span[@class='highlight highlight-red']") != null)
		{
			System.out.println("Kindly update the volume of the component prior to issue to the patient.");
			System.out.println("The component has already expired. Kindly update the component status as Discard with reason as Expiry.");

		}
		else
		{
			System.out.println("components are not expired");

		}

		
		/*WebElement ele41 = driver.findElement(By.xpath("//a[@href='/node/1883999']"));
		JavascriptExecutor executor41 = (JavascriptExecutor)driver;
		executor41.executeScript("arguments[0].click();", ele41);	
		
		//driver.findElement(By.xpath("//a[@href='/node/1883999']")).click();
		WebElement ele4 = driver.findElement(By.xpath("//a[text()='Create Crossmatch Report']"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", ele4);	
		
		driver.findElement(By.xpath("//div[@id='edit_field_crossmatch_patient_und_chosen']")).click();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		
driver.findElement(By.xpath("//li[text()=' 55554 O Pos @ anu ']")).click();
		
		
		driver.findElement(By.xpath("//select[@id='edit-field-compatibility-und']")).click();
		
		driver.findElement(By.xpath("//option[@value='Yes']")).click();
		
		driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
		driver.findElement(By.xpath("//option[@value='4973']")).click();
		
		WebElement ele5 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", ele5);
		
		WebElement ele6 = driver.findElement(By.xpath("//a[text()='Issue/Reserve']"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele6);
		
		WebElement ele7 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor7 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele7);
		

	*/
		
		
		
		}
		
}
