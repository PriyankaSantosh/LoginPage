import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreatCrossMatch {
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
		driver.findElement(By.xpath("//option[@value='PC']")).click();
		driver.findElement(By.xpath("//option[@value='Test Awaited']")).click();
		driver.findElement(By.xpath("//option[@value='O']")).click();
		/*driver.findElement(By.xpath("//select[@id='edit-field-rh-value']")).click();
		driver.findElement(By.xpath("//option[@value='Pos']")).click();*/
		driver.findElement(By.xpath("//button[@id='edit-submit-bloodstockposition']")).click();
	driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	
	WebElement ele1 = driver.findElement(By.xpath("//a[@href='/node/1823760"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);

driver.findElement(By.xpath("//a[@href='/node/add/crossmatch/1823760?destination=node/1823760']")).click();	

/*WebDriverWait wait = new WebDriverWait(driver, 90);
WebElement  = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'- Select a value -')]")));
element.click();*/

//driver.findElement(By.xpath("//span[contains(text(),'- Select a value -')]/../../..//select[@id='edit-field-crossmatch-patient-und']")).click();
//driver.findElement(By.xpath("//option[@value='1823775']")).click();

/*WebDriverWait wait = new WebDriverWait(driver,100);
WebElement patientList = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'- Select a value -')]/../../..//select//option[@value='1823775']")));
patientList.click()*/;


//driver.findElement(By.xpath("//span[contains(text(),'- Select a value -')]/../../..//select//option[@value='1823775']")).click();

driver.findElement(By.xpath("//div[@id='edit_field_crossmatch_patient_und_chosen']")).click();
driver.findElement(By.xpath("//li[@data-option-array-index='15']")).click();
driver.findElement(By.xpath("//select[@id='edit-field-compatibility-und']")).click();
driver.findElement(By.xpath("//option[@value='Yes']")).click();

driver.findElement(By.xpath("//select[@id='edit-field-er-technician-und']")).click();
driver.findElement(By.xpath("//option[@value='9764']")).click();

WebElement ele2 = driver.findElement(By.id("edit-submit"));
JavascriptExecutor executor2 = (JavascriptExecutor)driver;
executor1.executeScript("arguments[0].click();", ele2);
driver.findElement(By.xpath("//a[@href='/issue-or-reserve-component-to-patient/1823760?destination=node/1823760'] ")).click();


WebElement ele3 = driver.findElement(By.id("edit-submit"));
JavascriptExecutor executor3 = (JavascriptExecutor)driver;
executor3.executeScript("arguments[0].click();", ele3);



}}

