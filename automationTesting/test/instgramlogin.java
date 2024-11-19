package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class instgramlogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver(); 
		driver.get("https://www.instagram.com/accounts/login/?hl=en");
		driver.manage().window().maximize();
//		driver.findElement(By.name("username")).sendKeys("jithin.m7");
		WebElement day=driver.findElement(By.name("username"));
		day.sendKeys("jithin.m7");
		WebElement pass=driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[2]/div/label/input"));
		pass.sendKeys("jithu");
		
		 
		
	
//		 Actions ac=new Actions(driver);
		 WebElement log= driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div/div[3]"));
		 log.click();
//		 ac.doubleClick(log).perform();
	}

}
