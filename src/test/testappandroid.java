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
import org.testng.annotations.BeforeSuite;
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
import locality_feature.test_location;
import basic_actions.basic_actions;

public class  testappandroid {
		public static AndroidDriver<MobileElement> driver;
		//AndroidDriver<WebElement> appiumDriver;
		public Login log;
		public All_Elements_Navigationdrawer objlogin;
		public VerificationCode verify;
		public General gen;
		public Allpage_id allid;
		public Addressitems address;
		public orderitems orderobj;
		public test_location locality;
		public basic_actions basic_actions;
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
@BeforeSuite
	public void launch_app()  throws MalformedURLException{
		System.out.println("Setup1 called....");
		capabilities.setCapability("BROWSER_NAME", "Android");
		capabilities.setCapability("VERSION", "5.1"); 
		capabilities.setCapability("deviceName","F4AZFG103235");
		capabilities.setCapability("platformName","Android");
		capabilities.setCapability("appPackage", "com.grofers.customerapp");
		// This package name of your app (you can get it from apk info app)
		capabilities.setCapability("appActivity","com.grofers.customerapp.activities.ActivitySplashScreen"); 
		driver =  new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		}
	
		
@BeforeClass
public void setUp() throws MalformedURLException{
	
	System.out.println("Setup called....");

	//Set up desired capabilities and pass the Android app-activity and app-package to Appium
	

	//Create RemoteWebDriver instance and connect to the Appium server
	//It will launch the Grofers App in Android Device using the configurations specified in Desired Capabilities
	
	objlogin = new All_Elements_Navigationdrawer();
	log = new Login ();
	verify = new VerificationCode();
	gen = new General(driver,objlogin);
	allid = new Allpage_id();
	address = new Addressitems(driver,gen,objlogin);
	orderobj = new orderitems(driver, objlogin);
	locality = new test_location(driver, objlogin);
	//basic_actions = new basic_actions(driver);
}









// payment option page -----------BLOCKED FOR NOW---------------
/*@Test (priority=5)
public void g_paymentoption()
{
	MobileElement paymentproceed = driver.findElement(allid.proceedtopayment);
	paymentproceed.tap(1, 200);
	
	
}

//paying amount
@Test (priority=6)
public void h_paymoney()
{
	driver.scrollTo("Cash on Delivery");
	MobileElement paymenttype =driver.findElement(allid.payment_option_cod);
	paymenttype.tap(1, 200);
	MobileElement yesbtn = driver.findElement(allid.placeorder_yes);
	yesbtn.tap(1, 200);
	gen.b_waithere20();
	MobileElement continueshopping = driver.findElement(allid.continueshopping_button);
	continueshopping.tap(1, 200);
}


// Adding address when already have address.
@Test (groups = "sanity", priority=5)
public void i_AddAddress()
{
address.Newaddress_addision();	
}

//Modifying an address
@Test (groups = "sanity", priority=6)
public void j_modifyaddress()
{
	
	
}
//deleting an address

@Test (groups = "sanity", priority=7)
public void k_deleteAddres()
{
	address.Address_delete();
}

// label assertions and going back
@Test (groups = "sanity", priority=8)
public void l_labels()
{
address.click_addAddress();
address.Address_labels_home();
address.Address_label_office();
address.Address_label_other();
address.go_back();
}

//Order status
@Test  (groups = "sanity", priority=9)
public void m_ordertestcases()
{
	orderobj.openOrder();
	orderobj.orderpageverify();
	orderobj.orderdetailpage();
	orderobj.callUs();
	orderobj.email();
	address.go_back();
}




//@AfterTest
//public void tearDown() {
//    if (driver != null) {
//        driver.quit();
//    }
//
//}*/
}