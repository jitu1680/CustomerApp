package test;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadUtil;

import com.google.common.base.Verify;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import allpages.Addressitems;
import allpages.Allpage_id;
import allpages.General;
import allpages.VerificationCode;
import allpages.orderitems;
import navigationdrawer.*;
import junit.framework.Assert;




public class main_class {
		private AndroidDriver<MobileElement> driver;
		//AndroidDriver<WebElement> appiumDriver;
		Login log;
		All_Elements_Navigationdrawer objlogin;
		VerificationCode verify;
		General gen;
		Allpage_id allid;
		Addressitems address;
		orderitems orderobj;



@SuppressWarnings("rawtypes")
@BeforeClass
public void setUp() throws MalformedURLException{

	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME", "Android");
	capabilities.setCapability("VERSION", "5.1"); 
	capabilities.setCapability("deviceName","F4AZFG103235");
	capabilities.setCapability("platformName","Android");
    capabilities.setCapability("appPackage", "com.grofers.customerapp");
    // This package name of your app (you can get it from apk info app)
	capabilities.setCapability("appActivity","com.grofers.customerapp.activities.ActivitySplashScreen"); 

	//Create RemoteWebDriver instance and connect to the Appium server
	//It will launch the Grofers App in Android Device using the configurations specified in Desired Capabilities
	driver =  new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
   
	objlogin = new All_Elements_Navigationdrawer();
	log = new Login ();
	verify = new VerificationCode();
	gen = new General(driver,objlogin);
	allid = new Allpage_id();
	address = new Addressitems(driver,gen,objlogin);
	orderobj = new orderitems(driver, objlogin);
 
	}

public class testappandroid extends main_class {}

}