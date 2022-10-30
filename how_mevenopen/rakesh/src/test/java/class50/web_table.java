package class50;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class web_table {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rakesh Kumar Swain\\Downloads\\chromedriver_win32\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/webtables");
		List<WebElement> ele=driver.findElements(By.xpath("(//div[@role='row']/div[6])[text()]"));
		int count =0;
		for(WebElement ar:ele)
		{
			count++;
			if(count%2!=0)
			{
				System.out.println(ar.getText());
			}
		}
		driver.close();
	}

}
