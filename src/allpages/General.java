package allpages;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import	org.openqa.selenium.*;

public class General {
	WebDriver driver;
	
	public By Click_outside = By.id("com.grofers.customerapp:id/category_name");
	
	public General (WebDriver driver){
	this.driver =driver;

}

public void click_out(){
WebElement out = driver.findElement(Click_outside);
out.click();

}
public void waitfor(){
	driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
}
}