package class50;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class displyed_Enabel {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh Kumar Swain\\Downloads\\chromedriver_win32\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		boolean er=driver.findElement(By.xpath("//input[@type='text']")).isDisplayed();
		if(er==true)
		{
			System.out.println("site is loaded");
		}
		else
		{
			System.out.println("site is not loaded");
		}
		
			driver.close();
			
		
	}

}
