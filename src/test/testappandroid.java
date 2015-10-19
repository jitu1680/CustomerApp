package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import nevigationdrawer.*;
import nevigationdrawer.All_Elements_Nevigationdrawer;
import org.openqa.selenium.interactions.touch.ScrollAction;
import org.openqa.selenium.interactions.touch.TouchActions;

import junit.framework.Assert;

import java.io.File;


public class testappandroid {
WebDriver driver;
Login log;
All_Elements_Nevigationdrawer objlogin;


@BeforeClass
public void setUp() throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME", "Android");
	capabilities.setCapability("VERSION", "4.4.4"); 
	capabilities.setCapability("deviceName","97d0e1a6");
	capabilities.setCapability("platformName","Android");
 
   capabilities.setCapability("appPackage", "com.grofers.customerapp");
// This package name of your app (you can get it from apk info app)
	capabilities.setCapability("appActivity","com.grofers.customerapp.activities.ActivitySplashScreen"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
   driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   objlogin = new All_Elements_Nevigationdrawer(driver);
   log = new Login (driver);
}





//Welcome text on nevigation pane.
@Test
public void amen(){
	System.out.println(" Check for welcome text");
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     WebElement nevi=driver.findElement(objlogin.menu);
     nevi.click();
     WebElement wel= driver.findElement(objlogin.Welcome_Text);
     System.out.println("welcome text is displayed : " + wel.isDisplayed());	
}





//login button and login page opening
@Test
public void bloginbutton(){
	System.out.println("login button and login page opening");
	WebElement loginbutton= driver.findElement(log.ButtonLogin);
	System.out.println("Is login button is displayed : " +loginbutton.isDisplayed());
	loginbutton.click();
	}



//login page items
@Test
public void loginpageitems(){
	System.out.println("Login page contents");
	
	WebElement title= driver.findElement(log.Titletext);
    System.out.println("Title text =" +title.getText());
    
    WebElement subtext= driver.findElement(log.Subtext);
    System.out.println("Sub text : " +subtext.getText());
    
    WebElement nextbutton= driver.findElement(log.ButtonLogin);
    System.out.println("Text over button : " +nextbutton.getText());
    System.out.println("Next button is displayed : " +nextbutton.isDisplayed());
    System.out.println("Next button is enabled : " +nextbutton.isEnabled());
    
    
    WebElement enterphone = driver.findElement(log.Enterphoneno);
    enterphone.click();
    System.out.println("Color of the next button : " +nextbutton.getCssValue("background-color"));
    enterphone.sendKeys("8826611401");
    System.out.println("Color of the next button : " +nextbutton.getCssValue("background-color"));
    
}


@Test
public void log(){
	System.out.println("inside log function");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
List<WebElement> li =  driver.findElements(log.alllogintext);
int nuber = li.size();
System.out.println(nuber);
for (WebElement el :li){
	System.out.println(el.getText());
}

}


	


}
