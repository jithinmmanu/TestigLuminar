package pkg1;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname 
{
	ChromeDriver driver;

	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
	}
	
	@Test
	public void test()
	{
		List<WebElement> li= driver.findElements(By.tagName("a"));
	 	System.out.println("total no of links"+li.size());
	 	
	 	for(WebElement s:li)
	 	{
	 		//System.out.println(s);
	 		String h=s.getAttribute("href");
	 		System.out.println(h);
	 		
	 		String t=s.getText();
	 		System.out.println(t);
	 		
	 		
	 	}

	}

}
