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
import nevigationdrawer.*;



import junit.framework.Assert;




public class testappandroid {
	private AndroidDriver<MobileElement> driver;
//AndroidDriver<WebElement> appiumDriver;
Login log;
All_Elements_Nevigationdrawer objlogin;
VerificationCode verify;
General gen;
Allpage_id allid;
Addressitems address;



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
   gen = new General(driver,objlogin);
   allid = new Allpage_id();
   address = new Addressitems(driver,gen,objlogin);
 
}





//Welcome text on nevigation pane.
@Test(groups ="sanity")
public void a_men(){
	System.out.println(" Check for welcome text");
	//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
	gen.b_waithere20();
     MobileElement nevi=driver.findElement(objlogin.Nevigation_menu);
     nevi.click();
     WebElement wel= driver.findElement(objlogin.Nevigation_Welcome_Text);
     System.out.println("welcome text is displayed : " + wel.isDisplayed());	
}





//login button and login page opening
@Test(groups = "sanity")
public void b_loginbutton(){
	System.out.println("login button and login page opening");
	WebElement loginbutton= driver.findElement(objlogin.Nevigation_Login);
	System.out.println("Is login button is displayed : " +loginbutton.isDisplayed());
	loginbutton.click();
	}



//login page items
@Test(groups ="sanity")
public void c_loginpageitems(){
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
@Test (groups="sanity")
public void d_Verify(){
	//Title
	System.out.println("Verification page function");
	WebElement title = driver.findElement(verify.Verification_titletext);
	System.out.println("Title text = " +title.getText());
	
	//subtitle
	WebElement subtext = driver.findElement(verify.Verification_subtext);
	System.out.println("Sub Text =" +subtext.getText());
	
	//Loader
	try{
	WebElement load = driver.findElement(verify.Verification_progressbar);
	System.out.println("Is progressbar present =" +load.isDisplayed());
	
	// Again sub text over verification code
	 WebElement text = driver.findElement(verify.Verification_textmanually);
	 System.out.println("Text for manually entering code = " +text.getText());
	}
	catch (NoSuchElementException e){
		Reporter.log("no such element");
	}
	 //Entering verification code
	 MobileElement Enter_Code = driver.findElement(verify.Verification_Entercode);
	 WebElement done = driver.findElement(verify.Verification_Donebutton);
	 System.out.println("Displayed text = " +Enter_Code.getText());
	 Enter_Code.tap(1, 200);
	 Enter_Code.sendKeys("9314");
	 done.click();
	 //System.out.println("out clicked");
	 //gen.c_waithere5();
	 try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 gen.a_swipeLeft();
	 System.out.println("Swiped");
	 //gen.waithere20();
	 
	
}




//Search and add item and go to My cart.

@Test(groups="sanity")
public void e_serach()  
      { 
	   gen.c_waithere5();
       MobileElement search= driver.findElement(allid.feedsearch);
       search.tap(1, 200);
       MobileElement search2 = driver.findElement(allid.search);
       search2.tap(1, 200);
       search2.sendKeys("aquafina");
//key code for search button is 66 on keyboard
      driver.pressKeyCode(66);
      MobileElement add = driver.findElement(allid.addbutton_searched);
      add.tap(1, 100);
      MobileElement tapcart = driver.findElement(allid.taketocart);
      tapcart.tap(1, 200);
    }


// go to checkout page.
@Test (groups="sanity")
public void f_checkout()
{
	System.out.println("click on chekcout");
	MobileElement tapchekout = driver.findElement(allid.checkoutbutton);
	tapchekout.tap(1, 200);
	
	String Titlecheckout = driver.findElement(allid.chekoutpage_title).getText();
	org.testng.Assert.assertEquals(Titlecheckout, "Checkout");
	
	String TotalamountText = driver.findElement(allid.totalamount_text).getText();
	org.testng.Assert.assertEquals(TotalamountText,"Total Amount");
	
	String DeliveryamountText = driver.findElement(allid.deliverycharges_text).getText();
	org.testng.Assert.assertEquals(DeliveryamountText, "Delivery Charges");
	
	String Amountpayable = driver.findElement(allid.amountPayable_text).getText();
	org.testng.Assert.assertEquals(Amountpayable, "Amount Payable");
	
	String Promocode = driver.findElement(allid.gotPromo_text).getText();
	org.testng.Assert.assertEquals(Promocode, "Got a promo code?");
    
	
	
	String DeliveryaddressTitleText = driver.findElement(allid.checkout_addresstitle).getText();
	org.testng.Assert.assertEquals(DeliveryaddressTitleText, "Delivery Address");
	
	String DeliverytimeTitleText = driver.findElement(allid.checkout_timetitle).getText();
	org.testng.Assert.assertEquals(DeliverytimeTitleText, "Schedule Delivery Date & Time");
	
	
//	String Terms = driver.findElement(allid.TC_text).getText();
//	org.testng.Assert.assertEquals(Terms, "By using this application, you agree to the \n"
//			+ "Terms of Service and Privacy Policy");
	
	String  ProceedtoPaymentText =driver.findElement(allid.proceedtopayment).getText();
	org.testng.Assert.assertEquals(ProceedtoPaymentText, "Proceed to Payment");
	
	
	
}

// payment option page
@Test (groups = "snity")
public void g_paymentoption()
{
	MobileElement paymentproceed = driver.findElement(allid.proceedtopayment);
	paymentproceed.tap(1, 200);
	
	
}

//paying amount
@Test (groups ="sanity")
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
@Test
public void i_AddAddress()
{
address.Newaddress_addision();	
}

//Modifying an address
@Test
public void j_modifyaddress()
{
	address.Address_modification();
	
}
//deleting an address

@Test
public void k_deleteAddres()
{
	address.Address_delete();
}
	








//@AfterTest
//public void tearDown() {
//    if (driver != null) {
//        driver.quit();
//    }
//
//}
}


	



