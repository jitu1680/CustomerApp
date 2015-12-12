package my_information_feature;

import io.appium.java_client.MobileElement;
import test.testappandroid;

public class my_addresses extends testappandroid {
	
	//Add New Address Function
	public void add_new_address(){
	MobileElement tapchekout1 = driver.findElement(objlogin.Navigation_My_Addresses);
	tapchekout1.tap(1, 200);
	}
}
