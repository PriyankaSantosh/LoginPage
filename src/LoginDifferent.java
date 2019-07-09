import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginDifferent
{
static{
		
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://dev.ebloodbanking.com/");
	driver.manage().window().maximize();
	try
    {
      WebElement a1 = driver.findElement(By.id("edit-name"));
      System.out.println("---------userid exists --------------\n-----------------------");
      a1.sendKeys("test_admin");
     }
catch(Throwable e)
     {
     System.out.println("userid not found: " + e.getMessage());
     }

//Check whether Password field exists or not
 try
    {
 WebElement password = driver.findElement(By.id("edit-pass"));
     password.sendKeys("test_admin");
     System.out.println("----------Passwordd exits ------------\n-----------------------");

    }
catch(Throwable e)
    {
 System.out.println("Password not found: " + e.getMessage());
    }
 driver.findElement(By.id("edit-submit")).click();
	
}

}
