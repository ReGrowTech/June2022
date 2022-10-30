package class55;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement ee=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		ee.sendKeys("iphone 11");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		List<WebElement> ele=driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for(WebElement al:ele)
		{
			System.out.println(al.getText());
		}
	}

}
