package class53;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select_class {
	public static void main(String ars[])
	{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Rakesh Kumar Swain\\\\Downloads\\\\chromedriver_win32\\\\chromedriver_106.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		WebElement ele=driver.findElement(By.xpath("//select[@id='oldSelectMenu']"));
		Select dd=new Select(ele);
		dd.selectByIndex(3);
		dd.selectByValue("4");
		dd.selectByVisibleText("White");
		WebElement at=dd.getFirstSelectedOption();
		System.out.println(at.getText());
//		List<WebElement> all=dd.getOptions();
//		for(WebElement ar:all)
//		{
//			System.out.println(ar.getText());
//		}
		
	}

}
