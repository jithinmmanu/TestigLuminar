package project;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class crossbrwsertest {
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) {
		if(browser.equalsIgnoreCase("firefox"));
		{
			driver=new FirefoxDriver();
			
		}
		
	}
		@Test
		public void fb()
		{
			driver.get("https://www.facebook.com/");
			
		}
	}
	


