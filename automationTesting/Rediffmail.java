package pkg1;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffmail 
{

	ChromeDriver driver;
	@Before
	public void start()
	{
		driver=new ChromeDriver();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void test()
	{
		Boolean i=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(i)
		{
			System.out.println("Displayed");
		}
		else
		{
			System.out.println("Not Displayed");
		}
		
		Boolean c=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
		if(c)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		
		Boolean m=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isEnabled();
		if(m)
		{
			System.out.println("Selected");
		}
		else
		{
			System.out.println("Not Selected");
		}
		

	}

}
