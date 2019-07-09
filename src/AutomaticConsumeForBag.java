import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomaticConsumeForBag {
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
		
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[21]")).click();
		driver.findElement(By.xpath("//a[@href='/inventory/stockreport']")).click();
		driver.findElement(By.xpath("//select[@id='edit-tid']")).click();
		driver.findElement(By.xpath("//option[text()='Blood Bags']")).click();
		driver.findElement(By.xpath("//input[@id='edit-title']")).sendKeys("jala");
		Thread.sleep(3000);
		
		WebElement ele211 = driver.findElement(By.xpath("//button[@value='Apply']"));
		JavascriptExecutor executor211 = (JavascriptExecutor)driver;
		executor211.executeScript("arguments[0].click();", ele211);
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='/node/add/donation-record']")).click();

		/*driver.findElement(By.xpath("//select[@id='edit-field-donor-entry-type-und']")).click();
		driver.findElement(By.xpath("//option[@value='Full']")).click();*/

		driver.findElement(By.xpath("//input[@class='text-full form-control form-text required']")).sendKeys("Koyal");//unique
		driver.findElement(By.xpath("//input[@id='edit-field-donor-name-und-0-value']")).sendKeys("EC07");//unique
		//driver.findElement(By.xpath("(//select[@class='form-control form-select'])[2]")).click(By.xpath("//option[@value='A1 Pos']"));

		driver.findElement(By.xpath("//select[@id='edit-field-blood-group-und']")).click();
		driver.findElement(By.xpath("//option[@value='A1 Neg']")).click();

		/*WebDriverWait wait = new WebDriverWait(driver, 10);
		WebElement Category_Body = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("edit-field-gender-und")));
		Category_Body.click();
		*/
		WebElement element = driver.findElement(By.id("edit-field-gender-und"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().perform();
		driver.findElement(By.xpath("//option[@value='Female']")).click();

		driver.findElement(By.xpath("//div[@id='edit_field_donor_occupation_und_chosen']")).click();
		driver.findElement(By.xpath("//li[@data-option-array-index='2']")).click();

		driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_country_chosen']")).click();
		driver.findElement(By.xpath("//li[@data-option-array-index='102']")).click();

		driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-thoroughfare']")).sendKeys("MG");
		driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-premise']")).sendKeys("uma hotel");

		driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_locality_chosen']")).click();
		driver.findElement(By.xpath("(//li[@data-option-array-index='44'])[2]")).click();

		driver.findElement(By.xpath("//div[@id='edit_field_address_und_0_administrative_area_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Karnataka']")).click();

		driver.findElement(By.xpath("//input[@id='edit-field-address-und-0-postal-code--2']")).sendKeys("584101");

		driver.findElement(By.xpath("//input[@id='edit-field-mobile-und-0-value']")).sendKeys("1478523690");

		driver.findElement(By.xpath("//input[@id='edit-field-email-und-0-email']")).sendKeys("adc@gmail.com");

		driver.findElement(By.xpath("//input[@id='edit-field-aadhar-pan-number-und-0-value']")).sendKeys("987654321077");

		driver.findElement(By.xpath("//select[@id='edit-field-donor-donation-location-und']")).click();
		driver.findElement(By.xpath("//option[@value='Camp']")).click();

		driver.findElement(By.xpath("//div[@id='edit_field_blood_donation_camp_und_0_nid_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='Soft Bank Private Limited 31-Jan-2019']")).click();

		driver.findElement(By.xpath("//input[@value='Yes']")).click();

		driver.findElement(By.xpath("//div[@id='edit_field_number_of_donations_und_chosen']")).click();
		driver.findElement(By.xpath("//li[text()='First Time']")).click();


		driver.findElement(By.xpath("//input[@id='edit-field-age-und-0-value']")).sendKeys("56");

		//driver.findElement(By.xpath("//input[@id='edit-field-donor-type-und-vol']")).click();


		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

		/*WebDriverWait wait= new WebDriverWait(driver,90);
		WebElement ss = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#edit-group_medical_examination']")));
		ss.click();*/

		WebElement ele1 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--2']"));
		//WebElement ele1 = driver.findElement(By.xpath("//a[@href='#edit-group_medical_examination']"));
		JavascriptExecutor executor1 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", ele1);

		driver.findElement(By.xpath("//select[@id='edit-field-donor-doctor-und']")).click();
		driver.findElement(By.xpath("//option[@value='4973']")).click();


		driver.findElement(By.xpath("//input[@id='edit-field-weight-und-0-value']")).sendKeys("45");
		driver.findElement(By.xpath("//input[@id='edit-field-bp-systolic-und-0-value']")).sendKeys("110");
		driver.findElement(By.xpath("//input[@id='edit-field-bp-diastolic-und-0-value']")).sendKeys("65");

		driver.findElement(By.xpath("//input[@id='edit-field-hemoglobin-test-und-more-than-125']")).click();

		driver.findElement(By.xpath("//input[@id='edit-field-deferral-status-und-normal']")).click();

		driver.findElement(By.xpath("//select[@id='edit-field-donor-sdp-suff-duration-und']")).click();
		driver.findElement(By.xpath("//option[@value='YES']")).click();

		driver.findElement(By.xpath("//select[@id='edit-field-donation-type-und']")).click();
		driver.findElement(By.xpath("//option[@value='WBD']")).click();

		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


		WebElement ele2 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--7']"));
		//WebElement ele2 = driver.findElement(By.xpath("//a[@href='#edit-group_blood_bag']"));
		JavascriptExecutor executor2 = (JavascriptExecutor)driver;
		executor2.executeScript("arguments[0].click();", ele2);
		/*
		WebElement ele21 = driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']"));
		JavascriptExecutor executor21 = (JavascriptExecutor)driver;
		executor21.executeScript("arguments[0].click();", ele21);
		*/
		/*WebDriverWait wait= new WebDriverWait(driver,90);
		WebElement send = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']")));
		send.click();*/


		driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']")).sendKeys("5 Mar 2019");
		driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-timeEntry-popup-1']")).sendKeys("11:50pm");

		driver.findElement(By.xpath("//input[@id='edit-field-bag-no-und-0-value']")).sendKeys("65");
		driver.findElement(By.xpath("//input[@id='edit-field-batch-no-und-0-value']")).sendKeys("65");
		driver.findElement(By.xpath("//input[@id='edit-field-donor-segment-number-und-0-value']")).sendKeys("65");

		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


		driver.findElement(By.xpath("//select[@id='edit-field-type-of-bag-und']")).click();
		driver.findElement(By.xpath("//option[@value='1884743']")).click();

		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


		driver.findElement(By.xpath("//select[@id='edit-field-components-to-be-prepared-und']")).click();
		driver.findElement(By.xpath("//option[text()='PC, FFP']")).click();

		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


		driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
		driver.findElement(By.xpath("(//option[text()='  anushka '])[2]")).click();

		WebElement ele11 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor11 = (JavascriptExecutor)driver;
		executor11.executeScript("arguments[0].click();", ele11);
		
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		


		WebElement ele21 = driver.findElement(By.xpath("//a[text()='Create Components']"));
		JavascriptExecutor executor21 = (JavascriptExecutor)driver;
		executor21.executeScript("arguments[0].click();", ele21);

		//driver.findElement(By.xpath("//a[text()='Create Components']")).click();


		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

		WebElement ele111 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor111 = (JavascriptExecutor)driver;
		executor111.executeScript("arguments[0].click();", ele111);
		
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[21]")).click();
		driver.findElement(By.xpath("//a[@href='/inventory/stockreport']")).click();
		driver.findElement(By.xpath("//select[@id='edit-tid']")).click();
		driver.findElement(By.xpath("//option[text()='Blood Bags']")).click();
		driver.findElement(By.xpath("//input[@id='edit-title']")).sendKeys("jala");
		
		
		Thread.sleep(3000);
		
		WebElement ele2111 = driver.findElement(By.xpath("//button[@value='Apply']"));
		JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
		executor2111.executeScript("arguments[0].click();", ele2111);
		
		
		
}}
