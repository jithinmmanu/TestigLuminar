package pages;

public class fbloginbasic {
	WebDriver driver;
	fbemail=By.id("email");
	fbpass=By.id("pass");
	fblogin=By.id("login");

}
public fbloginbasic(Webdriver driver) {
	this.driver=driver;
}
public void setvalues(String email,String password){
	driver.findElement(fbemail).sendkeys(email);
	driver.findElement(fbpass).sendkeys(password);
	
	
}
pulic void login()
{
	driver.findElement(fblogin).click();
}