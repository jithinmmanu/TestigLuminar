package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class kk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.findElement(By.id("email")).sendKeys("v");
driver.findElement(By.id("pass")).sendKeys("v");
driver.findElement(By.name("login")).click();
	}

}
