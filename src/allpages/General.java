package allpages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import nevigationdrawer.objlogin;


import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;
import java.util.function.ObjLongConsumer;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import navigationdrawer.*;



public class General 
{

	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	All_Elements_Navigationdrawer objlogin;
	
   public General (AndroidDriver<MobileElement> driver, All_Elements_Navigationdrawer objlogin){
    this.driver = driver;	
    this.objlogin=objlogin;
   }
   
   
   
   
   //Swipe left
@Test   
public void a_swipeLeft()
{
	driver.context("NATIVE_APP"); 
	Dimension size = driver.manage().window().getSize(); 
	int startx = (int) (size.width * 0.8); 
	int endx = (int) (size.width * 0.20); 
	int starty = size.height / 2; 
	driver.swipe(startx, starty, endx, starty, 2000);
	System.out.println("swiiped");

}

// 20 Seconds wait
@Test
public void b_waithere20()
{
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}


//5 second wait
@Test
public void c_waithere5()
{
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}


//Opening nevigation page.
@Test
public void d_opennavigationPane(){
	 WebElement nevi= driver.findElement(objlogin.Nevigation_menu);
	 nevi.click();
		 
 }

}

