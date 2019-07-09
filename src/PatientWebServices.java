import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PatientWebServices {
static{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		}
	
		public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://devhl7.bmtplus.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("Priyanka");
		driver.findElement(By.id("edit-pass")).sendKeys("Priyanka");
		driver.findElement(By.id("edit-submit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[text()='Add content'])[2]")).click();
		driver.findElement(By.xpath("(//a[@href='/node/add/patient_blood_requirement'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-patient-name-0-value']")).sendKeys("QAruna");//mandatory unique
		driver.findElement(By.xpath("//input[@id='edit-field-hospital-0-value']")).sendKeys("Test Private Hospital");
		driver.findElement(By.xpath("//input[@id='edit-field-uhid-0-value']")).sendKeys("0981");  //mandatory unique
		driver.findElement(By.xpath("//input[@id='edit-field-ip-number-0-value']")).sendKeys("0981");  //mandatory unique
		driver.findElement(By.xpath("//input[@id='edit-field-indication-for-transfusion-0-value']")).sendKeys("no blood");
		driver.findElement(By.xpath("//select[@id='edit-field-gender']")).click();
		driver.findElement(By.xpath("//option[@value='Female']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-age-0-value']")).sendKeys("45");
		driver.findElement(By.xpath("//select[@id='edit-field-abo']")).click();
		driver.findElement(By.xpath("//option[@value='A2']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-rh']")).click();
		driver.findElement(By.xpath("//option[@value='Pos']")).click();
		driver.findElement(By.xpath("//input[@id='edit-field-patient-hb-0-value']")).sendKeys("369");
		driver.findElement(By.xpath("//input[@id='edit-field-nature-of-request-0-value']")).sendKeys("369");
		driver.findElement(By.xpath("//input[@id='edit-field-phone-number-0-value']")).sendKeys("1234567891");
		driver.findElement(By.xpath("//input[@id='edit-field-email-id-0-value']")).sendKeys("asd@gmail.com");
		driver.findElement(By.xpath("//input[@id='edit-field-order-id-0-value']")).sendKeys("14");
		driver.findElement(By.xpath("//input[@id='edit-field-address-line-1-0-value']")).sendKeys("AB nagar");
		driver.findElement(By.xpath("//input[@id='edit-field-address-line-2-0-value']")).sendKeys("CD nagar");
		driver.findElement(By.xpath("//input[@id='edit-field-address-city-0-value']")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//input[@id='edit-field-address-state-0-value']")).sendKeys("karnataka");
		driver.findElement(By.xpath("//input[@id='edit-field-address-pin-code-0-value']")).sendKeys("584101");
		driver.findElement(By.xpath("//input[@id='edit-field-blood-requirement-0-value']")).sendKeys("A");
		driver.findElement(By.xpath("//textarea[@id='edit-field-additional-information-0-value']")).sendKeys("asdfghjkl");
		driver.findElement(By.xpath("//input[@id='edit-field-bmtplus-id-0-value']")).sendKeys("sdfghjkl");
		
		WebElement ele5= driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor5 = (JavascriptExecutor)driver;
		executor5.executeScript("arguments[0].click();", ele5);
		
		driver.get("http://dev.ebloodbanking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("test_admin");
		driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
		driver.findElement(By.id("edit-submit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[11]")).click();
		driver.findElement(By.xpath("//a[@href='/create-patient-blood-requirement']")).click();
		driver.findElement(By.xpath("//input[@id='edit-patient-uhid']")).sendKeys("0981");   //mandatory same UHID as Above UHID
		
		WebElement ele2= driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele2);
		
		
		}		
}
