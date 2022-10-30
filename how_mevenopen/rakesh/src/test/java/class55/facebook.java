package class55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {
	public static void main(String argss[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\\\driver\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='pass']//ancestor::div[@class='_6luv _52jv']/following-sibling::div"));
		

	}

}
