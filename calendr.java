package project;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendr {

	public static void main(String[] args)  throws InterruptedException{
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.booking.com/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
		
		driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[2]/div/div[1]/button[1]/span")).click();
		Thread.sleep(2000);
		
		
		
	
			while(true)
			{
				String month=driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/h3")).getText();
				
			
		String months="july 2023";
		if(months.equals(month))
		{
			System.out.println(month);
			break;
		}
		else
			
		{
			driver.findElement(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/button/span/span/svg")).click();
			
		}
		List<WebElement> ad= driver.findElements(By.xpath("//*[@id=\"calendar-searchboxdatepicker\"]/div/div[1]/div/div[1]/table/tbody/tr/td/span/span"));
		for(WebElement d:ad)
		{
			String date=d.getText();
			if(date.equals("18"))
			{
				d.click();
				System.out.println("date selected");
				
				
				
			}
		}}}}
			
		
		
		
		

	


