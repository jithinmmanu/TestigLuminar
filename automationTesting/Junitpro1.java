package pkg1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitpro1 
{
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void titleverification()
	{
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		
		String expected="Google";
		if(actualtitle.equals(expected))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
	@After
	public void browserclose()
	{
		driver.close();
	}
}
