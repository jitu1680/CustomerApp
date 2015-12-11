package basic_actions;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;

import navigationdrawer.All_Elements_Navigationdrawer;

public class basic_actions {
	@SuppressWarnings("rawtypes")
	DesiredCapabilities capabilities = new DesiredCapabilities();
	
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	
   public basic_actions (AndroidDriver<MobileElement> driver){
    this.driver = driver;	
   }

	//Function to launch application
@Test(groups= {"launch_app"})  
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
}
