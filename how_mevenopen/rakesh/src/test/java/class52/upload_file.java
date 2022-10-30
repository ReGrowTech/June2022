package class52;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class upload_file {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh Kumar Swain\\Downloads\\chromedriver_win32\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/upload-download");
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Rakesh Kumar Swain\\Desktop\\practice 2.txt");
		
	}

}
