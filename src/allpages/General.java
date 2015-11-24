package allpages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.Dimension;



public class General 
{

	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	
   public General (AndroidDriver<MobileElement> driver){
    this.driver = driver;	
   }
   
@Test   
public void swipeLeft()
{
	driver.context("NATIVE_APP"); 
	Dimension size = driver.manage().window().getSize(); 
	int startx = (int) (size.width * 0.8); 
	int endx = (int) (size.width * 0.20); 
	int starty = size.height / 2; 
	driver.swipe(startx, starty, endx, starty, 4000);
	System.out.println("swiiped");

}
 }

