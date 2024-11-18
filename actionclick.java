package project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionclick {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		WebElement a=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(a).perform();
		 driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]")).click();
		 driver.switchTo().alert().accept();
		WebElement x= driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		 Actions ac=new Actions(driver);
		 ac.doubleClick(x).perform();
		 Alert c=driver.switchTo().alert();
		 System.out.println(c.getText());
		 c.accept(); 
		
		 
		
		
	}

}
