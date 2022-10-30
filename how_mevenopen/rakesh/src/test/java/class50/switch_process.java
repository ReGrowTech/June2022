package class50;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class switch_process {
	public static void main(String rgs[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Rakesh Kumar Swain\\Downloads\\chromedriver_win32\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/links");
		String id=driver.getWindowHandle();
		driver.findElement(By.id("simpleLink")).click();
		Set<String> sr=driver.getWindowHandles();
		for(String rk:sr)
		{
			if(!(rk.equals(id)))
			{
				driver.switchTo().window(rk);
			}
		}
		String g=driver.getCurrentUrl();
		String s=driver.getTitle();
		System.out.println(g);
		System.out.println(s);
		driver.close();
		
	}

}
