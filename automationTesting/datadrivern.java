package project;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class datadrivern {
	WebDriver driver;
	@BeforeTest

	public  void chorm() {
		
	
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
	}
	@BeforeMethod
		public void urlloading() {
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		}
		@Test
		public void  main() throws IOException{
		
File f=new File("C:\\Users\\USER\\Documents\\da.xlsx");
FileInputStream fi=new FileInputStream(f);
XSSFWorkbook wb=new XSSFWorkbook(fi);
XSSFSheet sh=wb.getSheet("Sheet1");
System.out.println(sh.getLastRowNum());
for(int i=1;i<=sh.getLastRowNum();i++)
{
	
	String username=sh.getRow(i).getCell(0).getStringCellValue();
	System.out.println("username="+username);
	String password=sh.getRow(i).getCell(1).getStringCellValue();
	System.out.println(password);
	driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
	
	driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
	driver.findElement(By.id("pass")).clear();
	driver.findElement(By.id("pass")).sendKeys(password);
	driver.findElement(By.name("login")).click();
	String acturl=  driver.getCurrentUrl();
	System.out.println(acturl);
	String exp="https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzE5OTIyNDg2LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D&next";
		if(acturl.equals(exp))	 
		{
			System.out.println("not logind");
		}
		else
		{

			System.out.println(" logind");
		
		}
	
	
	
}


	}

}
