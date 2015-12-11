package locality_feature;

import navigationdrawer.All_Elements_Navigationdrawer;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class test_location {
	
	@SuppressWarnings("rawtypes")
	AndroidDriver driver;
	All_Elements_Navigationdrawer objlogin;
	
	public test_location (AndroidDriver<MobileElement> driver, All_Elements_Navigationdrawer objlogin){
    this.driver = driver;	
    this.objlogin=objlogin;
	}
	
	public void pick_location(){
		 
		//Pick Locality
	     MobileElement pick_loc_btn =(MobileElement) driver.findElement(objlogin.Navigation_Pick_Locality_BTN);
	     pick_loc_btn.click();
	     MobileElement pick_loc_fld =(MobileElement) driver.findElement(objlogin.Navigation_Pick_Locality_Field);
	     pick_loc_fld.sendKeys("Sector 41, Gurgaon");
	     MobileElement pick_loc_opt =(MobileElement) driver.findElement(objlogin.Navigation_Pick_Locality_Opt);
	     pick_loc_opt.click();
		
	}

}
