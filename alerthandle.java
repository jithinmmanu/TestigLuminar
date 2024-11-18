package project;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerthandle {
	ChromeDriver driver;
	@BeforeAll
	public void open()
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		
	}
	@Test
	public void alert()
	{
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		
	}

}
 