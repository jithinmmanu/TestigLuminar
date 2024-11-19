package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class withoutgettext {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		WebElement b=driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String bt=b.getAttribute("value");
		System.out.println(bt);
		

	}

}

