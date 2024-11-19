package project;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
	Alert a=driver.switchTo().alert();
	String t=a.getText();
	System.out.println(t);

	String e="b";
	if(t.equals(e))
	{
		System.out.println("true");
	}
	else {
		System.out.println("false");
	}
	a.dismiss();
		
	}

	}


