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
   
	objlogin = new All_Elements_Nevigationdrawer();
	log = new Login ();
	verify = new VerificationCode();
	gen = new General(driver,objlogin);
	allid = new Allpage_id();
	address = new Addressitems(driver,gen,objlogin);
	orderobj = new orderitems(driver, objlogin);
 
}





//Welcome text on navigation pane

@Test(groups ="sanity")
public void testcase_1(){
		System.out.println("Test Case 1 Executing....");
		gen.c_waithere5(); // wait for 5 sec
		 MobileElement nevi=driver.findElement(objlogin.Nevigation_menu);
         nevi.click();
     if(!driver.findElements(objlogin.Nevigation_Welcome_Text).isEmpty()) { 	//Added by Faizan
    	
         System.out.println("Check if function calls when No Welcome text.."); 		//Added by Faizan	
         WebElement wel= driver.findElement(objlogin.Nevigation_Welcome_Text);
         System.out.println("welcome text is displayed : " + wel.isDisplayed());	
     }
     System.out.println("Test Case 1 Executed !!!");
}																				//Added by Faizan






@Test(groups = "sanity")
public void testcase_2(){
	System.out.println("Test Case 2 Executing....");
	//login button and login page opening
	if(!driver.findElements(objlogin.Nevigation_Login).isEmpty()) 
	{					
			System.out.println("login button and login page opening");
			System.out.println("Check if function calls when No Login button..");		//Added by Faizan
			WebElement loginbutton= driver.findElement(objlogin.Nevigation_Login);
			System.out.println("Is login button is displayed : " +loginbutton.isDisplayed());
			loginbutton.click();
			
			// Check login function megerd by Faizan
			
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

	
		  
		    //Verification function merged by Faizan
			System.out.println("Verification page function");
			WebElement title1 = driver.findElement(verify.Verification_titletext);
			System.out.println("Title text = " +title1.getText());
			
			//subtitle
			WebElement subtext2 = driver.findElement(verify.Verification_subtext);
			System.out.println("Sub Text =" +subtext2.getText());
			
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
	System.out.println("Test Case 2 Executed !!!");
}





//Search and add item and go to My cart.

@Test(groups="sanity")
public void testcase_3()  
      { 
		System.out.println("Test Case 3 Executing....");
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
	      System.out.println("Test Case 3 Executed !!!");
    }


// go to checkout page.
@Test (groups="sanity")
public void testcase_4()
{
	System.out.println("Test Case 4 Executing....");
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
	
	System.out.println("Test Case 4 Executed !!!");
	
}

// payment option page
@Test (groups = "sanity")
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
	
	
}
//deleting an address

@Test
public void k_deleteAddres()
{
	address.Address_delete();
}

// label assertions and going back
@Test
public void l_labels()
{
address.click_addAddress();
address.Address_labels_home();
address.Address_label_office();
address.Address_label_other();
address.go_back();
}

//Order status
@Test 
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
//}
}