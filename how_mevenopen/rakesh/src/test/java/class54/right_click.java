package class54;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class right_click {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "E:\\New folder (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/");
		Actions action=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("(//div[@class='avatar mx-auto white']/*[name()='svg'])[1]"));
		action.contextClick(ele).perform();
		driver.close();
	}

}
