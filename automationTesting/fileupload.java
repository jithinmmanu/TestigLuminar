package project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class fileupload {
	WebDriver driver;
	@BeforeTest
	public void launch() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url() {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
		@Test
		public void gg()  throws  Exception {
		
	

WebElement v= driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span"));
v.click();
		
		fileuploads("C:\\Users\\USER\\Downloads\\hhh.pdf");
		}
		public void fileuploads(String p) throws AWTException {
			// TODO Auto-z method stub
			
		
	
			
		
		StringSelection str=new StringSelection(p);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		Robot robot=new Robot();
		robot.delay(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
		}}


