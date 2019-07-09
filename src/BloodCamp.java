import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BloodCamp {
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
	driver.findElement(By.xpath("//a[@href='/node/add/blood-donation-camp']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-organisation-und']")).click();
		driver.findElement(By.xpath("//option[text()='BTM']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-date-of-camp-und-0-value-datepicker-popup-0']")).sendKeys("13 Feb 2019");
		driver.findElement(By.xpath("//div[@id='edit_field_bdc_initiated_by_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='  deepan ']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-contact-person-und-0-value']")).sendKeys("Annu");
		driver.findElement(By.xpath("//input[@id='edit-field-contact-number-und-0-value']")).sendKeys("0123456789");
		driver.findElement(By.xpath("//input[@id='edit-field-contact-email-und-0-email']")).sendKeys("xyz@gmail.com");
		driver.findElement(By.xpath("//textarea[@id='edit-field-organisation-address-und-0-value']")).sendKeys("qwertyuiop");
		driver.findElement(By.xpath("//input[@id='edit-field-timing-und-0-value']")).sendKeys("11:30 am");
		WebElement ele5= driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", ele5);

		
		/*WebElement ele2 = driver.findElement((By.xpath("//div[@id='edit_field_bdc_medical_officer_und_chosen']")));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele2);
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		
		WebElement ele3 = driver.findElement(By.xpath("(//li[@data-option-array-index='1'])[2]"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele3);*/
		
		//driver.findElement(By.xpath("(//li[@data-option-array-index='1'])[2]")).click();
		
		
				
		

				
				
		//driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

				
				/*WebElement ele2 = driver.findElement(By.xpath("//div[@id='edit_field_bdc_staff_nurses_und_chosen']"));
				JavascriptExecutor executor2 = (JavascriptExecutor)driver;
				executor2.executeScript("arguments[0].click();", ele2);
				
				driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

				driver.findElement(By.xpath("(//li[@data-option-array-index='2'])[2]")).click();*/
				
				/*driver.findElement(By.xpath("//div[@id='edit_field_bdc_staff_nurses_und_chosen']")).sendKeys("bhanu");
				driver.findElement(By.xpath("//div[@id='edit_field_bdc_technicians_und_chosen']")).sendKeys("chitti");
				driver.findElement(By.xpath("//div[@id='edit_field_bdc_social_worker_und_chosen']")).sendKeys("chaitra");
				driver.findElement(By.xpath("//div[@id='edit_field_dbc_co_ordinator_und_chosen']")).sendKeys("pooja");
				driver.findElement(By.xpath("//div[@id='edit_field_bdc_counsellors_und_chosen']")).sendKeys("Amruthra");
				driver.findElement(By.xpath("//div[@id='edit_field_bdc_attenders_und_chosen']")).sendKeys("riya");
				driver.findElement(By.xpath("//div[@id='edit_field_bdc_driver_und_chosen']")).sendKeys("kola");
				driver.findElement(By.xpath("//button[@id='edit-submit']")).click();*/
				
				
				
				

		
		}
		
}
