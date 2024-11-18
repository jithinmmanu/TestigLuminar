package project;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenlink {

	
	public static void main(String[] args) throws MalformedURLException, Exception {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://Google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		
	
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(WebElement s:links)
		{
			String cs=s.getAttribute("href");
			HttpURLConnection co= (HttpURLConnection) new URL(cs).openConnection();
			co.setRequestMethod("HEAD");
			co.connect();
			int responsecode=co.getResponseCode();
			if(responsecode>=400)
			{
				System.out.println("link text:"+s.getText()+"resposecode:"+responsecode);
			}
			  
		}

}}
