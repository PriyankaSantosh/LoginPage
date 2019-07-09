import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DonorToBill {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}
		public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://dev.ebloodbanking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("vamsy");
		driver.findElement(By.id("edit-pass")).sendKeys("vamsy");
		driver.findElement(By.id("edit-submit")).click();
		driver.findElement(By.xpath("//a[text()='Welcome Vamsy']")).click();
		driver.findElement(By.xpath("(//a[text()='Test Blood Bank'])[1]")).click();
		driver.findElement(By.xpath("(//a[text()='Edit'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='#edit-group_centre_misc_manage']")).click();
	
		WebElement check = driver.findElement(By.xpath("//input[@value='Blood Group Non Mandatory in Donation Record']"));
		if (check.isSelected()) {
			
			WebElement check1 = driver.findElement(By.xpath("//input[@value='Blood Group Non Mandatory in Donation Record']"));
			 JavascriptExecutor executor211 = (JavascriptExecutor)driver;
				executor211.executeScript("arguments[0].click();", check1);
			
			
			WebElement ele21 = driver.findElement(By.id("edit-submit"));
			JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
			executor2111.executeScript("arguments[0].click();", ele21);


	 } else {
		 
			
	          WebElement ele21 = driver.findElement(By.id("edit-submit"));
				JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
				executor2111.executeScript("arguments[0].click();", ele21);
	          
	 }
		driver.findElement(By.xpath("(//a[text()='Edit'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='#edit-group_centre_misc_manage']")).click();
		
		
		
		
		WebElement checking = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-mandatory-blood-group-verification']"));
		if (checking.isSelected()) {
			WebElement check1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-mandatory-blood-group-verification']"));
			 JavascriptExecutor executor211 = (JavascriptExecutor)driver;
				executor211.executeScript("arguments[0].click();", check1);
				
			WebElement ele21 = driver.findElement(By.id("edit-submit"));
			JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
			executor2111.executeScript("arguments[0].click();", ele21);


	 } else {
		 
			
	          WebElement ele21 = driver.findElement(By.id("edit-submit"));
				JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
				executor2111.executeScript("arguments[0].click();", ele21);
	          
	 }
		
		
		
		driver.findElement(By.xpath("(//a[text()='Edit'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='#edit-group_centre_misc_manage']")).click();
		
		
		WebElement checking1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-mandatory-serology-verification']"));
		if (checking1.isSelected()) {
			
			 WebElement check1 = driver.findElement(By.xpath("//input[@id='edit-field-centre-custom-settings-und-mandatory-serology-verification']"));
			 JavascriptExecutor executor211 = (JavascriptExecutor)driver;
				executor211.executeScript("arguments[0].click();", check1);
				
			WebElement ele21 = driver.findElement(By.id("edit-submit"));
			JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
			executor2111.executeScript("arguments[0].click();", ele21);


	 } else {
		
			
	          WebElement ele21 = driver.findElement(By.id("edit-submit"));
				JavascriptExecutor executor2111 = (JavascriptExecutor)driver;
				executor2111.executeScript("arguments[0].click();", ele21);
				
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.findElement(By.id("edit-name")).sendKeys("test_admin");
		driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
		driver.findElement(By.id("edit-submit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='/node/add/donation-record']")).click();DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
        
        //get current date time with Date()
        
        Date date = new Date();
        
      String  dd=dateFormat.format(date);
      System.out.println(dd);
      
      DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        //get current date time with Date()
        
        Date date1 = new Date();
        
      String  dd1=dateFormat1.format(date1);
      System.out.println(dd1);
      
	          

		driver.findElement(By.xpath("//input[@class='text-full form-control form-text required']")).sendKeys(dd1);

		

		//driver.findElement(By.xpath("//input[@class='text-full form-control form-text required']")).sendKeys("test1555223");
		driver.findElement(By.xpath("//input[@id='edit-field-donor-name-und-0-value']")).sendKeys("testing");
		
		driver.findElement(By.xpath("//select[@id='edit-field-blood-group-und']")).click();
		driver.findElement(By.xpath("//option[@value='A1 Neg']")).click();

		
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
		driver.findElement(By.xpath("//li[text()='bannergattastg1 08-May-2019']")).click();


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


		driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']")).sendKeys("20 Jun 2019");
		driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-timeEntry-popup-1']")).sendKeys("11:50pm");

		driver.findElement(By.xpath("//input[@id='edit-field-bag-no-und-0-value']")).sendKeys("65");
		driver.findElement(By.xpath("//input[@id='edit-field-batch-no-und-0-value']")).sendKeys("65");
		driver.findElement(By.xpath("//input[@id='edit-field-donor-segment-number-und-0-value']")).sendKeys("65");

		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


		driver.findElement(By.xpath("//select[@id='edit-field-type-of-bag-und']")).click();
		driver.findElement(By.xpath("//option[@value='5074']")).click();

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
		


		WebElement ele211 = driver.findElement(By.xpath("//a[text()='Create Components']"));
		JavascriptExecutor executor21 = (JavascriptExecutor)driver;
		executor21.executeScript("arguments[0].click();", ele211);

		//driver.findElement(By.xpath("//a[text()='Create Components']")).click();


		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

		WebElement ele111 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor111 = (JavascriptExecutor)driver;
		executor111.executeScript("arguments[0].click();", ele111);

		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


		try {
			WebElement ele2111 = driver.findElement(By.xpath("//a[text()=' Add New Serology Tests']"));
			JavascriptExecutor executor211 = (JavascriptExecutor)driver;
			executor211.executeScript("arguments[0].click();", ele2111);

		}
		catch(org.openqa.selenium.StaleElementReferenceException ex)
		{
		            WebElement ele23 = driver.findElement(By.xpath("//a[text()=' Add New Serology Tests']"));
		        	JavascriptExecutor executor23 = (JavascriptExecutor)driver;
		        	executor23.executeScript("arguments[0].click();", ele23);
		}


		/*WebElement ele211 = driver.findElement(By.xpath("//a[text()=' Add New Serology Tests']"));
		JavascriptExecutor executor211 = (JavascriptExecutor)driver;
		executor21.executeScript("arguments[0].click();", ele21);*/


		//driver.findElement(By.xpath("//a[text()=' Add New Serology Tests']")).click();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


		driver.findElement(By.xpath("//div[@id='edit_field_tests_technician_und_chosen']")).click();
		driver.findElement(By.xpath("//li[@data-option-array-index='1']")).click();


		WebElement ele1111 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor1111 = (JavascriptExecutor)driver;
		executor1111.executeScript("arguments[0].click();", ele1111);

		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

		driver.navigate().back();

		driver.navigate().back();

		driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		
		WebElement ele3 = driver.findElement(By.xpath("(//a[text()='view'])[1]"));
		JavascriptExecutor executor3 = (JavascriptExecutor)driver;
		executor1.executeScript("arguments[0].click();", ele3);
		
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

		
		WebElement ele4 = driver.findElement(By.xpath("//a[text()='Create Crossmatch Report']"));
		JavascriptExecutor executor4 = (JavascriptExecutor)driver;
		executor4.executeScript("arguments[0].click();", ele4);	
		
		driver.findElement(By.xpath("//div[@id='edit_field_crossmatch_patient_und_chosen']")).click();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
		
		/*WebElement ele66 = driver.findElement(By.xpath("(//li[contains(text(), ' 1231111 A1 Pos @ bala ')]"));
		JavascriptExecutor executor66 = (JavascriptExecutor)driver;
		executor66.executeScript("arguments[0].click();", ele66);*/
		
		driver.findElement(By.xpath(" //li[text()=' bnbcbn A1 Neg @ hfgsgfh ']")).click();
		
		
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
		
		
		
		WebElement ele8 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor8 = (JavascriptExecutor)driver;
		executor8.executeScript("arguments[0].click();", ele8);
		
		driver.navigate().to("http://dev.ebloodbanking.com/node/1743424");
		driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
		
		driver.navigate().to("http://dev.ebloodbanking.com/node/add/patient-bill?field_patient_bill_patient=1743424");
		
		WebElement ele9 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor9 = (JavascriptExecutor)driver;
		executor9.executeScript("arguments[0].click();", ele9);
		
		driver.findElement(By.xpath("//a[text()='Add New  Bill Item']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-patient-bill-type-und']")).click();
		driver.findElement(By.xpath("//option[@value='Item']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-bill-unit-item-und']")).click();
		driver.findElement(By.xpath("//option[@value='116297']")).click();
		//driver.findElement(By.xpath("//input[@id='edit-field-unit-quantity-und-0-value']")).sendKeys("1");
		
		WebElement ele10 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor10 = (JavascriptExecutor)driver;
		executor10.executeScript("arguments[0].click();", ele10);
		
		driver.findElement(By.xpath("//a[text()='Close Patient Bill']")).click();
		
		WebElement ele31 = driver.findElement(By.id("edit-submit"));
		JavascriptExecutor executor31 = (JavascriptExecutor)driver;
		executor31.executeScript("arguments[0].click();", ele31);
		driver.findElement(By.xpath("//a[@class='btn btn-info btn-sm']")).click();
		
		
		

		
		
		

	


		}}
		}
