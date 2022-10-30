package class51;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh Kumar Swain\\Downloads\\chromedriver_win32\\chromedriver_106.exe");
		driver =new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Wait wait=new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
//		wait.until(ExpectedConditions.alertIsPresent());
//		
		
		
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("next")));
//		driver.findElement(By.name("nex"));
		driver.close();

}}
