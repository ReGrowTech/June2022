package class54;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class actions_class {
	public static void main(String args[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Rakesh Kumar Swain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
//		driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer']/*[name()='svg'])[1]")).click();
//		driver.findElement(By.xpath("//*[text()='Group 1, option 2']")).click();
		
		
//		WebElement ele=driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer']/*[name()='svg'])[3]"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
//		ele.click();
//		driver.findElement(By.xpath("//div[text()='Green']")).click();
		
		
//		WebElement ele=driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer']/*[name()='svg'])[3]"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
//		ele.click();
//		List<WebElement> ar=driver.findElements(By.xpath("//*[text()='Green']"));
//		for(WebElement at:ar)
//		{
//			System.out.println(at.getTagName());
//		}
		
		
		WebElement ele=driver.findElement(By.xpath("(//div[@class=' css-tlfecz-indicatorContainer']/*[name()='svg'])[3]"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		ele.click();
		driver.findElement(By.xpath("//div[text()='Green']")).click();
		driver.findElement(By.xpath("//div[text()='Red']")).click();
		List<WebElement> ar=driver.findElements(By.xpath("//div[@class='css-1rhbuit-multiValue']/div[text()]"));
		List<WebElement> ag=driver.findElements(By.xpath("//div[@class='css-12jo7m5']"));
		System.out.println(ar.size());
		for(WebElement at:ar)
		{
			System.out.println(at.getText());
		}
		
		
		
		
		
		
		
		
	}
}
