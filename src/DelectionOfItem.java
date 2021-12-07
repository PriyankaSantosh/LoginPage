
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DelectionOfItem {
static{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("http://dev.ebloodbanking.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("edit-name")).sendKeys("test_admin");
	driver.findElement(By.id("edit-pass")).sendKeys("test_admin6767!");
	driver.findElement(By.id("edit-submit")).click();
	driver.findElement(By.xpath("(//a[@class='specialmenuitem'])[21]")).click();
	driver.findElement(By.xpath("(//a[@href='/item-list'])[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//td[@class='views-field views-field-title']/a)[1]")).click();
	driver.findElement(By.xpath("//a[text()='Edit']")).click();
	
	/*if(By.xpath("//button[@id='edit-delete']"))
	{
	//	driver.findElement(By.xpath("//button[@id='edit-delete']")).click();
		//driver.findElement(By.xpath("//button[@value='Delete']")).click();
		System.out.println("cannot delete the item as there is a node for consume or procure");

	}
	else
	{
		//System.out.println("cannot");
		driver.findElement(By.xpath("//button[@id='edit-delete']")).click();
		driver.findElement(By.xpath("//button[@value='Delete']")).click();
		
	}*/
	
	try 
	{
	     if(driver.findElement(By.xpath("//button[@id='edit-delete']")).isDisplayed()) 
	     {
	          driver.findElement(By.xpath("//button[@id='edit-delete']")).click();
	          driver.findElement(By.xpath("//button[@value='Delete']")).click();
	     }
	}
	catch (Exception e)
	
	{
		System.out.println("cannot delete the item as there is a node for consume or procure");
	}
	
	
}
}
