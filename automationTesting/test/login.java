package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class login {
WebDriver driver;
@BeforeTest
public void setup() {
	ChromeOptions options=new ChromeOptions();
	options.addArguments("--remote-allow-origins=*/");
	driver= new ChromeDriver();
	
	
}
@BeforeMethod
public void url()
{
	driver.get("https://www.facebook.com/");
}


}
