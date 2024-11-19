package pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	ChromeDriver driver;
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("email")).sendKeys("toma58@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Karukaparambil@1236");
		driver.findElement(By.name("login")).click();
	}

}
