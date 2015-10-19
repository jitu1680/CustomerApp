package nevigationdrawer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class All_Elements_Nevigationdrawer {
  WebDriver driver;
  public All_Elements_Nevigationdrawer (WebDriver driver)
  {
             this.driver = driver;
  }


 public By Welcome_Text = By.id("com.grofers.customerapp:id/welcome_layout");
 public By User_current_location = By.id("com.grofers.customerapp:id/user_current_locality");
 public By My_info = By.className("android.widget.TextView");
 public By Login = By.id("com.grofers.customerapp:id/text_login");
 public By My_Address = By.id("com.grofers.customerapp:id/text_my_addresses");
 public By My_Order = By.id("com.grofers.customerapp:id/text_order_history");
 public  By My_cart = By.id("com.grofers.customerapp:id/my_cart[1]");
 public By Notification = By.id("com.grofers.customerapp:id/notification_center[1]");
 public By Help = By.id("com.grofers.customerapp:id/help[@text='Help'");
 public By Call_Us = By.id("com.grofers.customerapp:id/call_us[1]");
 public By Rate_us = By.id("com.grofers.customerapp:id/rate_app");  
 public By menu = By.id(("com.grofers.customerapp:id/navigation_drawer_icon"));

}
