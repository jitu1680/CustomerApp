package my_information_feature;

import io.appium.java_client.MobileElement;
import test.testappandroid;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import navigationdrawer.All_Elements_Navigationdrawer;
import navigationdrawer.Login;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;


import test.util;

public class login extends testappandroid {
	
	
	@Test(groups = "sanity", priority=2)
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
			    enterphone.sendKeys(util.Mob_No);
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
				 Enter_Code.sendKeys(util.Key);
				 done.click();
				 //System.out.println("out clicked");
				 //gen.c_waithere5();
				 try {
					Thread.sleep(10000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				 gen.swipeLeft();
				 System.out.println("Swiped");
				 //gen.waithere20();
			}
		gen.swipeLeft();
		System.out.println("Test Case 2 Executed !!!");
	}
}
