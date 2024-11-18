package project;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot 
{
	public static void main(String[] args) throws Exception{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		driver.manage().window().maximize();
		//perticular elemet
		//WebElement dr=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		//File sc=dr.getScreenshotAs(OutputType.FILE);
		//FileHandler.copy(sc,new File("./screeshot//ele.png"));
		//whole page
		
		File sd=((TakesScreeshot).driver).getScreeShotAs(OutputType,FILE);
		Files.copy(sd,new File("C:\\Users\\USER\\Downloads\\scrn"));
		
		
	}

}
