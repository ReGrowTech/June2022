package class54;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class click_controla {

	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","E:\\New folder (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		Actions action =new Actions(driver);
		driver.get("https://www.facebook.com/");
		WebElement ele=driver.findElement(By.xpath("//input[@type='text']"));
	    ele.sendKeys("rakeshkumar7789@gmail.com");
	    ele.sendKeys(Keys.CONTROL+"A");
	    driver.close();
	    
	    
	}

}
