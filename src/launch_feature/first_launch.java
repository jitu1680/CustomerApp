package launch_feature;

import java.net.URL;
import java.lang.*;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import navigationdrawer.All_Elements_Navigationdrawer;
import navigationdrawer.Login;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.TestNG;

import allpages.Addressitems;
import allpages.Allpage_id;
import allpages.General;
import allpages.VerificationCode;
import allpages.orderitems;
import test.testappandroid;
import basic_actions.basic_actions;



public class first_launch extends testappandroid {
	
@Test(groups = {"sanity"}, priority=1)
	public void testcase_1_1(){
				
			System.out.println("Test Case 1_1 Executing....");
			gen.waithere10(); // wait for 20 sec
			if(!driver.findElements(objlogin.Navigation_First_Launch_Image).isEmpty())
			{
				System.out.println("icon found....");
				gen.swipeLeft();
				gen.swipeLeft();
				gen.swipeLeft();
			MobileElement lets_get_started =(MobileElement) driver.findElement(objlogin.Navigation_Lets_Get_Started_BTN);
			lets_get_started.click();
	     
	     //Pick Location Called
			locality.pick_location();
		}
			System.out.println("Test Case 1_1 Executed !!!");
		}	

	
@Test(priority=2)
	public void testcase_1_2(){
				
			System.out.println("Test Case 1_2 Executing....");
			System.out.println(gen);System.out.println(driver);
			gen.waithere5(); // wait for 5 sec
			System.out.println("Test Case 1 Executing nxt line....");
			 MobileElement nevi=(MobileElement) driver.findElement(objlogin.Nevigation_menu);
	         nevi.click();
	     if(!driver.findElements(objlogin.Nevigation_Welcome_Text).isEmpty()) { 	//Added by Faizan
	    	
	         System.out.println("Check if function calls when No Welcome text.."); 		//Added by Faizan	
	         WebElement wel= driver.findElement(objlogin.Nevigation_Welcome_Text);
	         System.out.println("welcome text is displayed : " + wel.isDisplayed());	
	     }
	     System.out.println("Test Case 1_2 Executed !!!");
	}	

}
