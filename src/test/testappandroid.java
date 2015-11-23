package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

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

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import allpages.General;
import allpages.VerificationCode;
import nevigationdrawer.*;


import junit.framework.Assert;




public class testappandroid {
	private AndroidDriver<MobileElement> driver;
//AndroidDriver<WebElement> appiumDriver;
Login log;
All_Elements_Nevigationdrawer objlogin;
VerificationCode verify;
General gen;



@SuppressWarnings("rawtypes")
@BeforeClass
public void setUp() throws MalformedURLException{
	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME", "Android");
	capabilities.setCapability("VERSION", "5.1"); 
	capabilities.setCapability("deviceName","LGH818817f4eaf");
	capabilities.setCapability("platformName","Android");
 
   capabilities.setCapability("appPackage", "com.grofers.customerapp");
// This package name of your app (you can get it from apk info app)
	capabilities.setCapability("appActivity","com.grofers.customerapp.activities.ActivitySplashScreen"); // This is Launcher activity of your app (you can get it from apk info app)
//Create RemoteWebDriver instance and connect to the Appium server
 //It will launch the Calculator App in Android Device using the configurations specified in Desired Capabilities
   driver =  new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   //appiumDriver = new AndroidDriver<WebElement> (new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   objlogin = new All_Elements_Nevigationdrawer();
   log = new Login ();
   verify = new VerificationCode();
   gen = new General(driver);
 
}





//Welcome text on nevigation pane.
@Test
public void amen(){
	System.out.println(" Check for welcome text");
	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
     WebElement nevi=driver.findElement(objlogin.Nevigation_menu);
     nevi.click();
     WebElement wel= driver.findElement(objlogin.Nevigation_Welcome_Text);
     System.out.println("welcome text is displayed : " + wel.isDisplayed());	
}





//login button and login page opening
@Test
public void bloginbutton(){
	System.out.println("login button and login page opening");
	WebElement loginbutton= driver.findElement(objlogin.Nevigation_Login);
	System.out.println("Is login button is displayed : " +loginbutton.isDisplayed());
	loginbutton.click();
	}



//login page items
@Test
public void cloginpageitems(){
	System.out.println("Login page contents");
	
	WebElement title= driver.findElement(log.Login_Titletext);
    System.out.println("Title text =" +title.getText());
    
    WebElement subtext= driver.findElement(log.Login_Subtext);
    System.out.println("Sub text : " +subtext.getText());
    
    WebElement nextbutton= driver.findElement(log.Login_ButtonLogin);
    System.out.println("Text over button : " +nextbutton.getText());
    System.out.println("Next button is displayed : " +nextbutton.isDisplayed());
    System.out.println("Next button is enabled : " +nextbutton.isEnabled());
    
    
    WebElement enterphone = driver.findElement(log.Login_Enterphoneno);
    System.out.println("Text over enterphone number :" +enterphone.getText());
    System.out.println("Click the enterphone no ");
    enterphone.sendKeys("8826611401");
    nextbutton.click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

//Verification page 
@Test 
public void eVerify(){
	//Title
	System.out.println("Verification page function");
	WebElement title = driver.findElement(verify.Verification_titletext);
	System.out.println("Title text = " +title.getText());
	
	//subtitle
	WebElement subtext = driver.findElement(verify.Verification_subtext);
	System.out.println("Sub Text =" +subtext.getText());
	
	//Loader
	WebElement load = driver.findElement(verify.Verification_progressbar);
	System.out.println("Is progressbar present =" +load.isDisplayed());
	
	// Again sub text over verification code
	 WebElement text = driver.findElement(verify.Verification_textmanually);
	 System.out.println("Text for manually entering code = " +text.getText());
	 
	 //Entering verification code
	 WebElement Enter_Code = driver.findElement(verify.Verification_Entercode);
	 WebElement done = driver.findElement(verify.Verification_Donebutton);
	 System.out.println("Displayed text = " +Enter_Code.getText());
	 Enter_Code.click();
	 Enter_Code.sendKeys("9314");
	 done.click();
	 System.out.println("out clicked");
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 gen.swipeLeft();
	 System.out.println("Swiped");
	 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	 
	
}


}


	


