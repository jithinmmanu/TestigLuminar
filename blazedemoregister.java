package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class blazedemoregister {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://blazedemo.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"name\"]")).sendKeys("manu");
		driver.findElement(By.xpath("//*[@id=\"company\"]")).sendKeys("infotech");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("jithin@gmail.com");
	WebElement pass=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	pass.sendKeys("Jithin@123");
	
	WebElement pass1=driver.findElement(By.xpath("//*[@id=\"password-confirm\"]"));
	Actions act=new Actions(driver);
	act.keyDown(pass,Keys.CONTROL).sendKeys("a").keyUp(pass,Keys.CONTROL);
	act.keyDown(pass,Keys.CONTROL).sendKeys("c").keyUp(pass,Keys.CONTROL);
	act.keyDown(pass1,Keys.CONTROL).sendKeys("v").keyUp(pass1,Keys.CONTROL);
	act.perform();
	
driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button")).click();

	}

}
