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


@Test
public void amen(){
	System.out.println("men function");
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     WebElement nevi=driver.findElement(objlogin.menu);
     nevi.click();
     WebElement wel= driver.findElement(objlogin.Welcome_Text);
     System.out.println("welcome text is displayed :" + wel.isDisplayed());	
}



@Test
public void balltext(){
	System.out.println("all text");
	List<WebElement> no = driver.findElements(By.xpath("//android.widget.ScrollView//android.widget.TextView"));
	int number = no.size();
	System.out.println(number);
	for (WebElement element : no) {
        System.out.println(element.getText());
    }
}

@Test
public void clogin(){
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//All_Elements_Nevigationdrawer objlogin = new All_Elements_Nevigationdrawer(driver);
//Login obj = new Login(driver);
((WebElement) objlogin.Login).click();   //why this is not taking without typing webelement.
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
