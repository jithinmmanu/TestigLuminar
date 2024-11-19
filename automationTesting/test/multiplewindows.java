package project;

import java.io.IOException;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class multiplewindows {
	WebDriver driver;
	@BeforeTest
	public void launch() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
	}
	@Test
	public void content()  {
		String parent=driver.getWindowHandle();
		System.out.println("parent tittle="+driver.getTitle());
		driver.findElement(By.xpath("/html/body/p/a")).click();
		Set<String> all = driver.getWindowHandles();
		
		for(String handle:all)
		{
			System.out.println(handle);
			if(!handle.equalsIgnoreCase(parent))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("haha");
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/text()")).click();
				driver.close();
				
			}
			driver.switchTo().window(parent);
			
		}
		WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		driver1.get("https://www.google.com/");
	}

}
