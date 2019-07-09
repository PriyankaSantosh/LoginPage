import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Organisation {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");}
	
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("http://dev.ebloodbanking.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("edit-name")).sendKeys("test_admin");
		driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
		driver.findElement(By.id("edit-submit")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[1]")).click();
		driver.findElement(By.xpath("//a[@href='/node/add/organisation']" )).click();
		driver.findElement(By.xpath("//input[@id='edit-title']")).sendKeys("BTM");
		driver.findElement(By.xpath("//select[@id='edit-field-organisation-type-und']")).click();
		driver.findElement(By.xpath("//option[@value='College: Degree']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-initiated-by-und']")).click();
		driver.findElement(By.xpath("//option[@value='Organisation']")).click();
		driver.findElement(By.xpath("//select[@id='edit-field-organisation-associates-und']")).click();
		
		driver.findElement(By.xpath("//option[@value='1353555']")).click();
	driver.findElement(By.xpath("//textarea[@id='edit-field-organisation-address-und-0-value']")).sendKeys("bnsbfsdfmsnmd");
	driver.findElement(By.xpath("//input[@id='edit-field-contact-person-und-0-value']")).sendKeys("Bhavya");
	driver.findElement(By.xpath("//input[@id='edit-field-contact-number-und-0-value']")).sendKeys("0123456789");
	driver.findElement(By.xpath("//input[@id='edit-field-contact-email-und-0-email']")).sendKeys("abc@gmail.com");
	driver.findElement(By.xpath("//select[@id='edit-field-organisation-status-und']")).click();
	driver.findElement(By.xpath("//option[@value='New']")).click();
	driver.findElement(By.xpath("//textarea[@id='edit-body-und-0-value']")).sendKeys("snskKS");
	WebElement ele1 = driver.findElement(By.id("edit-submit"));
	JavascriptExecutor executor1 = (JavascriptExecutor)driver;
	executor1.executeScript("arguments[0].click();", ele1);
	//driver.findElement(By.xpath("//button[@id='edit-submit']")).click();

}
}
