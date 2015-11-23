package allpages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebDriverException;


import org.openqa.selenium.Dimension;

import com.thoughtworks.selenium.condition.ConditionRunner.Context;


public class General 
{

	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	
   public General (AndroidDriver<MobileElement> driver){
    this.driver = driver;	
   }
public void swipeLeft()
{
//	//driver.findElement(By.id("com.grofers.customerapp:id/text_login"));
//	driver.context("NATIVE_APP"); 
//	Dimension size = driver.manage().window().getSize(); 
//	int startx = (int) (size.width * 0.8); 
//	int endx = (int) (size.width * 0.20); 
//	int starty = size.height / 2; 
////	driver.tap(1, startx, starty, 200);
//     driver.swipe(startx, starty, endx, starty, 1000);
////	int startx = 1285;
////	int starty = 896;
////	int endx = 23;
////	int endy = 896;
////	int duration = 1000;
////	driver.swipe(startx, starty, endx, endy, duration);
 driver.context("NATIVE_APP");
Dimension size = driver.manage().window().getSize();
System.out.println(size);
System.out.println(driver.getContext());
int x =(size.width - 5);
System.out.println("width =" +x);
int y =(size.height/2);
System.out.println("height = " + y);
driver.tap(1, x, y, 1000);
System.out.println("tapped");
	
}
}

