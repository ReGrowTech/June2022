package class54;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class amazon_account {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions action=new Actions(driver);
		driver.get("https://www.amazon.in/");
		WebElement ele=driver.findElement(By.id("nav-link-accountList"));
		action.moveToElement(ele).perform();
		
	}

}
