package project;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class bolen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		Boolean a=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
if(a)
{
	System.out.println("displayed");
}
else
{
	System.out.println("notdisplayed");
	
}
Boolean b=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[15]/td[2]/table/tbody/tr/td[1]/input")).isSelected();
if(b)
{
	System.out.println("selected");
}
else
{
	System.out.println("notselected");
	
}


	}

}
