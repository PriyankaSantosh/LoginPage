import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReferenceOfPatient {
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
		driver.findElement(By.xpath("//a[@href='/create-patient-blood-requirement']")).click();
		
		driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("neena1");//unique
		driver.findElement(By.xpath("//input[@name='field_patient_id[und][0][value]']")).sendKeys("50051");//unique
		driver.findElement(By.xpath("//select[@id='edit-field-patient-billing-type-und']")).click();
		driver.findElement(By.xpath("//option[@value='Free']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-patient-free-concession-id-und-0-value']")).sendKeys("5000");
		driver.findElement(By.xpath("//select[@id='edit-field-hospital-id-und']")).click();
		driver.findElement(By.xpath("//option[@value='6143']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-ip-number-und-0-value']")).sendKeys("1505");
		driver.findElement(By.xpath("//div[@id='edit_field_indication_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Anemia']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-gender-und']")).click();
		driver.findElement(By.xpath("//option[@value='Male']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-age-und']")).click();
		driver.findElement(By.xpath("//option[@value='60']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-abo-und']")).click();
		driver.findElement(By.xpath("//option[@value='A1']")).click();
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		//driver.findElement(By.xpath("//select[@id='edit-field-rh-und']")).click();
		
		WebElement ele = driver.findElement(By.xpath("//select[@id='edit-field-rh-und']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);
		
		driver.findElement(By.xpath("//option[@value='Pos']")).click();
		
		
		WebElement ele1 = driver.findElement(By.xpath("//select[@id='edit-field-patient-request-nature-und']"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", ele1);
		
		driver.findElement(By.xpath("(//option[@value='Normal'])[2]")).click();
		
		driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_country_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();

		driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-thoroughfare']")).sendKeys("station");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-premise']")).sendKeys("uma hotel");

		driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_locality_chosen']")).click();

		//driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		WebElement ele2 = driver.findElement(By.xpath("//li[text()='Bagalkot']"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele2);

		driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_administrative_area_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Karnataka']")).click();

		driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-postal-code--2']")).sendKeys("584101");
		
		
		
//	driver.findElement(By.xpath("//select[@id='edit-field-rh-und']")).click();
				
		
		/*WebElement ele3 = driver.findElement(By.xpath("//option[@value='Neg']"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", ele);*/

		//driver.findElement(By.xpath("//option[@value='Neg']")).click();
		Thread.sleep(2000);
		
		/*driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-thoroughfare--2']")).sendKeys("Gottigere");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-premise--2']")).sendKeys("South Avenue");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-locality--2']")).sendKeys("bangalore");*/
		
		driver.findElement(By.xpath("//input[@id='edit-field-patient-phone-und-0-value']")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id='edit-field-patient-email-und-0-value']")).sendKeys("abc@gmaail.com");
		driver.findElement(By.xpath("//input[@id='edit-field-requirement-und-0-value']")).sendKeys("Wc");
		
		
		//driver.findElement(By.xpath("//select[@id='edit-field-request-status-und']")).click();
		WebElement ele3 = driver.findElement(By.xpath("//select[@id='edit-field-request-status-und']"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", ele3);
		
		
		
		driver.findElement(By.xpath("//option[@value='Open']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-time-of-request-und-0-value-datepicker-popup-0']")).click();
		
		driver.findElement(By.xpath("(//a[@class='ui-state-default'])[12]")).click();
		driver.findElement(By.xpath("//input[@name='field_time_of_request[und][0][value][time]']")).sendKeys("3:00pm");
		
		WebElement ele4 = driver.findElement(By.xpath("//select[@id='edit-field-mode-of-enquiry-und']"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor3.executeScript("arguments[0].click();", ele3);
		
		//driver.findElement(By.xpath("//select[@id='edit-field-mode-of-enquiry-und']")).click();
		driver.findElement(By.xpath("//option[@value='Personal']")).click();
		driver.findElement(By.xpath("//textarea[@id='edit-field-crossmatch-remarks-und-0-value']")).sendKeys("abc");
		/*WebDriverWait issue=new WebDriverWait(driver,70);
		issue.until(ExpectedConditions.elementToBeClickable(By.id("edit-submit"))).click();
		
*/
		//driver.findElement(By.id("edit-submit")).click();
		/*WebElement sendIssue =(WebElement)new WebDriverWait(driver,110).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@value='Save']")));
		sendIssue.click();*/
		
		
		WebElement ele5= driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", ele5);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[11]")).click();
		driver.findElement(By.xpath("//a[@href='/enrolled-patients']")).click();
		driver.findElement(By.xpath("//select[@id='edit-search-type']")).click();
		driver.findElement(By.xpath("//option[@value='patient_name']")).click();
		driver.findElement(By.id("edit-search-text")).sendKeys("neena1");//unique
		
		
		WebElement ele6= driver.findElement(By.xpath("//button[@id='edit-submit']"));
		JavascriptExecutor executor6 = (JavascriptExecutor)driver;
		executor6.executeScript("arguments[0].click();", ele6);
		
		}

}
