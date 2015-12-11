package others_feature_test;

import io.appium.java_client.MobileElement;
import test.testappandroid;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.TestNG;


public class test_help extends testappandroid {
	//Open help
	
@Test
public void help_test(){
	MobileElement lets_get_started =(MobileElement) driver.findElement(objlogin.Navigation_help);
	}
}
