package Function;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class BasePage {
	
	public static WebDriver driver;
	
	public static void launchbrowser()
	{
		 String ChromeexePath = "C:\\Users\\shegde2\\eclipse-workspace\\Penfed\\chrome\\chromedriver.exe";
		 System.setProperty("webdriver.chrome.driver", ChromeexePath);
		  driver = new ChromeDriver();
		  driver.get("http://powercash-static.d.epsilon.com/");
		  
	}
	
	public static void clickbycss(String element)
	
	{ 
		
		
		driver.findElement(By.cssSelector(element)).click();
		
	}
	
public static void clickbyxpath(String element)
	
	{ 
		
		
		driver.findElement(By.xpath(element)).click();
		
	}

 public static void quit()
 {
	 driver.quit();
 }
 
 public static void implicitwait (int value)
 {
	 driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);
	 
	 
 }
 
 public static void  waitforcss(String element)
 {
	 WebDriverWait wait=new WebDriverWait(driver, 20);
	 WebElement condition;
	 condition= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
	 }
 public static void  waitforxpath(String element)
 {
	 WebDriverWait wait=new WebDriverWait(driver, 20);
	 WebElement condition;
	 condition= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(element)));
	 }
 
 
}

