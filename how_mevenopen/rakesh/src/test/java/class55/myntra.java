package class55;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntra {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.findElement(By.xpath("//a[@data-reactid='16']//parent::div/following-sibling::div[@data-reactid='906']//input"));
		driver.close();
		
	}

}
