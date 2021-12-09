import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Billing {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

	
		// TODO Auto-generated method stub
	
	
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://dev.ebloodbanking.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("edit-name")).sendKeys("test_admin");
			driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
			driver.findElement(By.id("edit-submit")).click();
			driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[11]")).click();
			driver.findElement(By.xpath("//a[@href='/create-patient-blood-requirement']")).click();
			driver.findElement(By.xpath("//input[@id='edit-field-patient-name-und-0-value']")).sendKeys("test");
			DateFormat dateFormat1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            
            //get current date time with Date()
            
            Date date1 = new Date();
            
          String  dd1=dateFormat1.format(date1);
          System.out.println(dd1);
			driver.findElement(By.xpath("//input[@id='edit-field-patient-id-und-0-value']")).sendKeys(dd1);
			
			driver.findElement(By.xpath("//select[@id='edit-field-hospital-id-und']")).click();
			driver.findElement(By.xpath("//option[text()='Test Private Hospital']")).click();
			driver.findElement(By.xpath("//input[@id='edit-field-ip-number-und-0-value']")).sendKeys("12358");
			driver.findElement(By.xpath("//div[@id='edit_field_indication_und_chosen']")).click();
			driver.findElement(By.xpath("//li[text()='Aplastic anemia']")).click();
			driver.findElement(By.xpath("//select[@id='edit-field-patient-gender-und']")).click();
			driver.findElement(By.xpath("//option[@value='Male']")).click();
			
			driver.findElement(By.xpath("//select[@id='edit-field-patient-age-und']")).click();
			driver.findElement(By.xpath("//option[@value='27']")).click();
			driver.findElement(By.xpath("//select[@id='edit-field-abo-und']")).click();
			driver.findElement(By.xpath("//option[@value='A1']")).click();
			driver.findElement(By.xpath("//select[@id='edit-field-rh-und']")).click();
			driver.findElement(By.xpath("//option[@value='Neg']")).click();
			driver.findElement(By.xpath("//select[@id='edit-field-patient-request-nature-und']")).click();
			driver.findElement(By.xpath("(//option[@value='Normal'])[2]")).click();
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			/*WebElement ele8 = driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_country_chosen']"));
	    	JavascriptExecutor executor8 = (JavascriptExecutor)driver;
	    	executor8.executeScript("arguments[0].click();", ele8);
			Thread.sleep(5000);																																							
			driver.findElement(By.xpath("//li[text()='India']")).click();*/
			
			driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-thoroughfare']")).sendKeys("near uma hotel");
			driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-premise']")).sendKeys("MG road");
			driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_locality_chosen']")).click();
			
			WebElement element = driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_locality_chosen']"));
			 
	        Actions action1 = new Actions(driver);	 
	        action1.moveToElement(element).build().perform();
	 
	        driver.findElement(By.xpath("//li[@data-option-array-index='467']")).click();
	     driver.findElement(By.xpath("//div[@id='edit_field_patient_address_und_0_administrative_area_chosen']")).click();
	     driver.findElement(By.xpath("//li[text()='Karnataka']")).click();
	        
	        
	        
	        
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	        driver.findElement(By.xpath("//input[@id='edit-field-patient-address-und-0-postal-code--2']")).sendKeys("584101");
	        
	        driver.findElement(By.xpath("//input[@id='edit-field-patient-phone-und-0-value']")).sendKeys("1234567895");
	        driver.findElement(By.xpath("//input[@id='edit-field-patient-email-und-0-value']")).sendKeys("test@gmail.com");
	        driver.findElement(By.xpath("//input[@id='edit-field-requirement-und-0-value']")).sendKeys("3WB");
	        driver.findElement(By.xpath("//select[@id='edit-field-request-status-und']")).click();
	        driver.findElement(By.xpath("//option[@value='Open']")).click();
	        WebElement ele81 = driver.findElement(By.id("edit-submit"));
	    	JavascriptExecutor executor81 = (JavascriptExecutor)driver;
	    	executor81.executeScript("arguments[0].click();", ele81);
	    
	   //String text = driver.findElement(By.xpath("//div[@class='alert alert-block alert-dismissible alert-success messages status']/em")).getText();
		//System.out.println(text);
driver.findElement(By.xpath("//a[text()='Logout']")).click();

		// TODO Auto-generated method stub
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http://dev.ebloodbanking.com/");
			driver.manage().window().maximize();
			driver.findElement(By.id("edit-name")).sendKeys("PriyankaGK");
			driver.findElement(By.id("edit-pass")).sendKeys("PriyankaGK");
			driver.findElement(By.id("edit-submit")).click();
			driver.findElement(By.xpath("//a[text()='Welcome PriyankaGK']")).click();
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
		          
		 }
			
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
						driver.findElement(By.id("edit-name")).sendKeys("test_admin");
						driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
						driver.findElement(By.id("edit-submit")).click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
						driver.findElement(By.xpath("//a[@href='/node/add/donation-record']")).click();
						 
						DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy");
			            
			            //get current date time with Date()
			            
			            Date date = new Date();
			            
			          String  dd=dateFormat.format(date);
			          System.out.println(dd);
			          
			          DateFormat dateFormat11 = new SimpleDateFormat("dd/MM/yyyyHH:mm:ss");
			            
			            //get current date time with Date()
			            
			            Date date11 = new Date();
			            
			          String  rr=dateFormat11.format(date11);
			          System.out.println(rr);
			          
					          

						driver.findElement(By.xpath("//input[@class='text-full form-control form-text required']")).sendKeys(dd1);
						driver.findElement(By.xpath("//input[@id='edit-field-donor-name-und-0-value']")).sendKeys("test44444");
						
						driver.findElement(By.xpath("//select[@id='edit-field-blood-group-und']")).click();
						driver.findElement(By.xpath("//option[@value='A1 Neg']")).click();

						
						WebElement element1 = driver.findElement(By.id("edit-field-gender-und"));
						Actions action = new Actions(driver);
						action.moveToElement(element1).click().perform();
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



						driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

						

						WebElement ele1 = driver.findElement(By.xpath("//a[@href='#bootstrap-panel--2']"));
						JavascriptExecutor executor1 = (JavascriptExecutor)driver;
						executor1.executeScript("arguments[0].click();", ele1);

						driver.findElement(By.xpath("//select[@id='edit-field-donor-doctor-und']")).click();
						driver.findElement(By.xpath("//option[@value='277']")).click();


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
						JavascriptExecutor executor2 = (JavascriptExecutor)driver;
						executor2.executeScript("arguments[0].click();", ele2);
						
						driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']")).click();
						driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

						 WebElement we = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[3]/a"));

						Actions action11=new Actions(driver);
						action11.moveToElement( we).click().perform();
						
						

					//	driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-datepicker-popup-0']")).sendKeys(dd);
						driver.findElement(By.xpath("//input[@id='edit-field-date-of-collection-und-0-value-timeEntry-popup-1']")).sendKeys("11:50am");

						driver.findElement(By.xpath("//input[@id='edit-field-bag-no-und-0-value']")).sendKeys("65");
						driver.findElement(By.xpath("//input[@id='edit-field-batch-no-und-0-value']")).sendKeys("65");
						driver.findElement(By.xpath("//input[@id='edit-field-donor-segment-number-und-0-value']")).sendKeys("retest65");

						driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


						driver.findElement(By.xpath("//div[@id='edit_field_type_of_bag_und_chosen']")).click();
						driver.findElement(By.xpath("//li[text()='  Triple CPDA SAGM 450ml ']")).click();
						driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

						
						WebElement we1 = driver.findElement(By.xpath("//select[@id='edit-field-components-to-be-prepared-und--2']"));

						Actions b=new Actions(driver);
						b.moveToElement( we1).click().perform();


						//driver.findElement(By.xpath("//select[@id='edit-field-components-to-be-prepared-und']")).click();
						driver.findElement(By.xpath("//option[text()='PC, FFP']")).click();

						driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


						driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
						driver.findElement(By.xpath("(//option[text()='  serology '])[1]")).click();

						WebElement ele11 = driver.findElement(By.id("edit-submit"));
						JavascriptExecutor executor11 = (JavascriptExecutor)driver;
						executor11.executeScript("arguments[0].click();", ele11);
						
						WebElement ele21 = driver.findElement(By.xpath("//a[text()='Create Components']"));
						JavascriptExecutor executor21 = (JavascriptExecutor)driver;
						executor21.executeScript("arguments[0].click();", ele21);

						//driver.findElement(By.xpath("//a[text()='Create Components']")).click();


						driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

						WebElement ele111 = driver.findElement(By.id("edit-submit"));
						JavascriptExecutor executor111 = (JavascriptExecutor)driver;
						executor111.executeScript("arguments[0].click();", ele111);
						
						try {
							WebElement ele211 = driver.findElement(By.xpath("//a[text()=' Add New Serology Tests']"));
							JavascriptExecutor executor211 = (JavascriptExecutor)driver;
							executor211.executeScript("arguments[0].click();", ele211);

						}
						catch(org.openqa.selenium.StaleElementReferenceException ex)
						{
						            WebElement ele23 = driver.findElement(By.xpath("//a[text()=' Add New Serology Tests']"));
						        	JavascriptExecutor executor23 = (JavascriptExecutor)driver;
						        	executor23.executeScript("arguments[0].click();", ele23);
						}
						
						driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);


						driver.findElement(By.xpath("//div[@id='edit_field_tests_technician_und_chosen']")).click();
						driver.findElement(By.xpath("//li[@data-option-array-index='1']")).click();


						WebElement ele11111 = driver.findElement(By.id("edit-submit"));
						JavascriptExecutor executor11111 = (JavascriptExecutor)driver;
						executor11111.executeScript("arguments[0].click();", ele11111);
						Thread.sleep(2000);
						
					driver.findElement(By.xpath("//div[@class='field-item even']/a")).click();
						
						driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);
						
						
						WebElement ele111111 = driver.findElement(By.xpath("(//td[@class='views-field views-field-view-node']/a)[1]"));
						JavascriptExecutor executor111111 = (JavascriptExecutor)driver;
						executor111111.executeScript("arguments[0].click();", ele111111);
						
						driver.findElement(By.xpath("//a[text()='Create Crossmatch Report']")).click();
						
						driver.findElement(By.xpath("//div[@id='edit_field_crossmatch_patient_und_chosen']")).click();
						
						
						
						
						DateFormat dateFormat111 = new SimpleDateFormat("dd/MM/yyyy");
			            
			            //get current date time with Date()
			            
			            Date date111 = new Date();
			            
			          String  dd11=dateFormat111.format(date111);
			          System.out.println(dd11);
			          
		              driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys(dd11);
		              
		          
		          
				           List<WebElement> ad = driver.findElements(By.xpath("//ul[@class='chosen-results']//li/em"));
				           System.out.println("number of elements:"+ad.size());
				         
				           WebElement qq = ad.get(ad.size()-1);
				           qq.click();
		
 			          driver.findElement(By.xpath("//select[@id='edit-field-compatibility-und']")).click();
			          driver.findElement(By.xpath("//option[@value='Yes']")).click();
			          driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
			          driver.findElement(By.xpath("//option[@value='4973']")).click();
			          
			          WebElement ele1111111 = driver.findElement(By.id("edit-submit"));
						JavascriptExecutor executor1111111 = (JavascriptExecutor)driver;
						executor1111111.executeScript("arguments[0].click();", ele1111111);
						
						driver.findElement(By.xpath("//a[text()='Issue/Reserve']")).click();
						
						driver.findElement(By.xpath("//select[@id='edit-issued-by']")).click();
						driver.findElement(By.xpath("//option[@value='2508']")).click();
						
						WebElement aq = driver.findElement(By.id("edit-submit"));
						JavascriptExecutor ww = (JavascriptExecutor)driver;
						ww.executeScript("arguments[0].click();", aq);
						
						driver.findElement(By.xpath("//*[@id=\"block-views-component-crossmatch-block\"]/div/div/div/table/tbody/tr/td[4]/a")).click();
						
						WebElement ab = driver.findElement(By.xpath("//*[@id=\"block-ji-custom-print-link-block\"]/a[1]"));
						JavascriptExecutor qq1=(JavascriptExecutor)driver;
						qq1.executeScript("arguments[0].click();", ab);
						
						
						ArrayList tabs = new ArrayList (driver.getWindowHandles());
					    System.out.println(tabs.size());
					    driver.switchTo().window((String) tabs.get(1));
					    
						driver.findElement(By.xpath("//textarea[@id='edit-field-notes-und-0-value']")).sendKeys("na");
						
						WebElement aq1 = driver.findElement(By.id("edit-submit"));
						JavascriptExecutor ww1 = (JavascriptExecutor)driver;
						ww1.executeScript("arguments[0].click();", aq1);
						
						driver.findElement(By.xpath("//a[text()='Add New  Bill Item']")).click();
						driver.findElement(By.xpath("//select[@id='edit-field-patient-bill-type-und']")).click();
						driver.findElement(By.xpath("//option[@value='Item']")).click();
						driver.findElement(By.xpath("//select[@id='edit-field-bill-unit-item-und']")).click();
						driver.findElement(By.xpath("//option[@value='116297']")).click();
						
						WebElement ele10 = driver.findElement(By.id("edit-submit"));
						JavascriptExecutor executor10 = (JavascriptExecutor)driver;
						executor10.executeScript("arguments[0].click();", ele10);
						
						driver.findElement(By.xpath("//a[text()='Close Patient Bill']")).click();
						
						WebElement ele31 = driver.findElement(By.id("edit-submit"));
						JavascriptExecutor executor31 = (JavascriptExecutor)driver;
						executor31.executeScript("arguments[0].click();", ele31);
						
						driver.findElement(By.xpath("(//div[@class='field-items'])[3]/div/a")).click();
						
						

			          
		}
}
