package project;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class tittleverification {
	ChromeDriver driver;
	@BeforeAll
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	@Test
	public void gg()
	
	{
		String exp="Google";
		String s=driver.getTitle();
		System.out.println(s);
		if(s.equals(exp))
		{
			System.out.println("true");
		}
		
	}
	@AfterAll
	public void close()
	{
		driver.close();
	}
	

}
