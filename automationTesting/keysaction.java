package project;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keysaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
WebElement name=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
name.sendKeys("abc");
WebElement name2=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]"));
Actions copy=new Actions(driver);
copy.keyDown(name,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
copy.keyDown(name,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
copy.keyDown(name2,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
copy.perform();
	}

}
