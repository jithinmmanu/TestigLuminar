package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {
	public static void main(String[] args) {

	
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebElement g=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/div/div/div/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/img"));
Actions m=new Actions(driver);
m.moveToElement(g).perform();
driver.findElement(By.xpath("/html/body/div[4]/div[1]/object/a[3]")).click();
Boolean n=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[1]/div/div/h1")).isDisplayed();
if(n)
{
	System.out.println("displayed");
}
else
{
	System.out.println("not displayed");
	
}
}}
