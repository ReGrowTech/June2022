package class51;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wat {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh Kumar Swain\\Downloads\\chromedriver_win32\\chromedriver_106.exe");
		driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("nex"));
		
		
		
	}

}
