package cart_feature;

import io.appium.java_client.MobileElement;

import org.testng.annotations.Test;

import test.testappandroid;

public class my_cart extends testappandroid {
	
	
	//Search and add item and go to My cart.

	@Test(priority=4)
	public void testcase_3()  
	      { 
			System.out.println("Test Case 3 Executing....");
			gen.waithere20();
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

}
