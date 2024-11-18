package project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class totalnooflinksandimg {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> l=driver.findElements(By.tagName("a"));
		//List<WebElement> images=driver.findElements(By.tagName("img"));
	
		for(WebElement S:l)
		{
			String link=S.getAttribute("href");
		String text=S.getText();
			 

			
			System.out.println(link+"----------"+text);
	
}
		System.out.println("size="+l.size());
	} }


