package allpages;

import java.util.function.ObjLongConsumer;

import org.openqa.selenium.By;
import org.testng.Assert;


import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import nevigationdrawer.All_Elements_Nevigationdrawer;

public class orderitems {
	AndroidDriver<MobileElement> driver;
	All_Elements_Nevigationdrawer objlogin;
	
	public orderitems(AndroidDriver<MobileElement> driver, All_Elements_Nevigationdrawer objlogin) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.objlogin = objlogin;
		
	}

	public By Myorders_title = By.id("com.grofers.customerapp:id/common_action_bar_title");  //title of order history page
	public By order_history_title =By.id("com.grofers.customerapp:id/common_action_bar_title"); //title of orders
	public By order_history_storename =By.id("com.grofers.customerapp:id/history_store_name"); //store name
	public By order_history_id = By.id("com.grofers.customerapp:id/history_order_id");  // GR id
	public By order_history_processed =By.id("com.grofers.customerapp:id/history_processed_text"); //order cancelled.
	public By order_subtotal =By.id("com.grofers.customerapp:id/history_text_sub_total"); //Text only
	public By order_deliverycharge =By.id("com.grofers.customerapp:id/history_text_delivery_charges");//Text only
	public By order_totalamount_text = By.id("com.grofers.customerapp:id/history_text_total_amount"); //text only
	public By order_subtotal_value =By.id("com.grofers.customerapp:id/history_value_sub_total"); //value sub total
	public By order_delivery_value =By.id("com.grofers.customerapp:id/history_value_delivery_charges"); //value total amount
	public By order_total_amount_value = By.id("com.grofers.customerapp:id/history_value_total_amount"); //total amount value
	public By order_history_scheduletime = By.id("com.grofers.customerapp:id/history_scheduled_time"); //schedule time
	public By order_detail_title = By.id("com.grofers.customerapp:id/common_action_bar_title"); //order detail title
	public By order_detail_scheduletime =By.id("com.grofers.customerapp:id/history_detail_scheduled_time"); //detail schedule time
	public By order_detail_storename =By.id("com.grofers.customerapp:id/history_detail_store_name"); //store name
	public By order_detail_orderid = By.id("com.grofers.customerapp:id/history_detail_order_id"); //Detail GR id
	public By order_detail_processed = By.id("com.grofers.customerapp:id/history_detail_order_id"); //Cancelled
	public By order_detail_Paymentmode = By.id("com.grofers.customerapp:id/history_detail_text_payment_status");  //payment mode text
	public By order_detail_payableamount =By.id("com.grofers.customerapp:id/history_detail_footer_total_amount"); //total payable amount text
	public By order_detail_payableamount_value = By.id("com.grofers.customerapp:id/history_detail_footer_total_amount_value"); //payable amunt
	public By order_detail_deliveraddress = By.id("//android.widget.TextView[@text = 'Delivery Address']"); //deliver address
	public By order_detail_subtotal = By.id("com.grofers.customerapp:id/history_detail_footer_subtotal");//detail page sub total
	public By order_detail_subtotal_value =By.id("com.grofers.customerapp:id/history_detail_footer_subtotal_value"); //subtotal value
	public By order_detail_deliverycharge =By.id("com.grofers.customerapp:id/history_detail_footer_delivery_charges"); //text
	public By order_detail_deliverycharge_Value =By.id("com.grofers.customerapp:id/history_detail_footer_delivery_charges_value"); 
	public By backbutton = By.xpath("//android.widget.ImageButton[@content-desc = 'Navigate up']"); //back button
	public By neextbutton = By.id("com.grofers.customerapp:id/history_next"); //next button order history
	public By call_us = By.id("com.grofers.customerapp:id/order_history_call_button"); //callus
	public By emaildetail = By.id("com.grofers.customerapp:id/order_history_email_button"); //email detial
	
	public By calldialogtitle = By.id("com.grofers.customerapp:id/dialog_delivery_title"); //call title
	public By call_subtext =By.id("com.grofers.customerapp:id/dialog_delivery_desc");  //subtext
	public By call_yes_button  = By.id("com.grofers.customerapp:id/dialog_button3");  //yes button
	public By call_no_button =By.id("com.grofers.customerapp:id/dialog_button1"); //no button
	
	public By email_title =By.id("com.grofers.customerapp:id/dialog_delivery_title");  //title
	public By email_subtext =By.id("com.grofers.customerapp:id/dialog_delivery_desc"); //desc sub text
	public By email_id =By.id("com.grofers.customerapp:id/dialog_delivery_desc"); //eamil id box
	public By email_emailme_button = By.id("com.grofers.customerapp:id/dialog_button3");  //email me button
	public By email_cancelbutton =By.id("com.grofers.customerapp:id/dialog_button3"); //Cancel button





//Opening of my order page



public void openOrder()
{
	MobileElement orderopen = driver.findElement(objlogin.Nevigation_My_Order);
	orderopen.tap(1, 200);
	
}



//verifying items available on my order page
public void orderpageverify()
{
	
String orderhistorypagetitle = driver.findElement(Myorders_title).getText();
Assert.assertEquals(orderhistorypagetitle, "My Orders");
 
 String lastorderplaced = driver.findElement(order_history_title).getText();
 System.out.println("last order placed ="+lastorderplaced);
 
 String merchantname = driver.findElement(order_history_storename).getText();
 System.out.println("Merchant name =" +merchantname);
 
 String GR_ID = driver.findElement(order_history_id).getText();
 System.out.println("Grid =" +GR_ID);
 
 
 String process_status = driver.findElement(order_history_processed).getText();
 System.out.println("Process_status" +process_status);

 String subtotal = driver.findElement(order_subtotal).getText();
 Assert.assertEquals(subtotal, "Sub Total");
 
 String Delivery_charges = driver.findElement(order_deliverycharge).getText();
 Assert.assertEquals(Delivery_charges, "Delivery Charges");
 
 String totalamount = driver.findElement(order_totalamount_text).getText();
 Assert.assertEquals(totalamount, "Total Amount");
 
  String subtotal_value = driver.findElement(order_subtotal_value).getText();
  System.out.println("Subtotal amount =" +subtotal_value);
  
  String Deliverycharge_value = driver.findElement(order_delivery_value).getText();
  System.out.println("Delivery charge amount =" +Deliverycharge_value);

 String Totalamount_value =driver.findElement(order_total_amount_value).getText();
 System.out.println("Total amount value =" +Totalamount_value);
  
 MobileElement nextbutton = driver.findElement(neextbutton);
 nextbutton.tap(1, 200);

}




//Verify order details page.
public void orderdetailpage()
{	
	
 String orderdetail_title = driver.findElement(order_detail_title).getText();
 Assert.assertEquals(orderdetail_title, "Order Details");
 
 String scheduletime = driver.findElement(order_detail_scheduletime).getText();
 System.out.println("Schedule time =" +scheduletime);
 
 String storename = driver.findElement(order_detail_storename).getText();
 System.out.println("Store name ="+storename);
 
 String orderdetail_GRID = driver.findElement(order_detail_orderid).getText();
 System.out.println("Order detail GRID ="+orderdetail_GRID);
 
 String orderdetail_process = driver.findElement(order_detail_processed).getText();
 System.out.println("Process state ="+orderdetail_process);
 
 String orderdetail_subtotal = driver.findElement(order_detail_subtotal).getText();
 System.out.println("Subtotal amount = "+orderdetail_subtotal);
 
 String orderdetail_subtotalvalue = driver.findElement(order_detail_subtotal_value).getText();
 System.out.println("Subtotal amount ="+orderdetail_subtotalvalue);
 
 String payableamount =driver.findElement(order_detail_payableamount).getText();
 System.out.println("Payable amount ="+payableamount);
 
 String payableamout_value =driver.findElement(order_detail_payableamount_value).getText();
 System.out.println("Payable amunt =" + payableamount +"=" +payableamout_value);
 
 driver.scrollTo("Delivery Address");
 String payment_mode =driver.findElement(order_detail_Paymentmode).getText();
 System.out.println("Paymentmode =" +payment_mode);


}

//Callus dialog

public void callUs()
{
MobileElement callus_button = driver.findElement(call_us);
String  callustext = callus_button.getText();
Assert.assertEquals(callustext, "Call Us");
callus_button.tap(1, 200);
String callUstitle = driver.findElement(calldialogtitle).getText();
Assert.assertEquals(callUstitle, "Contact Grofers");
String callussubtext = driver.findElement(call_subtext).getText();
Assert.assertEquals(callussubtext, "Do you want to call the Grofers helpline?");
MobileElement yesbutton = driver.findElement(call_yes_button);
String yesbuttontext =yesbutton.getText();
Assert.assertEquals(yesbuttontext, "Yes");
MobileElement nobutton = driver.findElement(call_no_button);
String nobuttontext =nobutton.getText();
Assert.assertEquals(nobuttontext, "No");
nobutton.tap(1, 200);

}

//Email me
public void email()
{
MobileElement emailbutton =driver.findElement(emaildetail);
String emailbuttontext = emailbutton.getText();
Assert.assertEquals(emailbuttontext, "Email Details");
emailbutton.tap(1, 200);

String emailtitletext = driver.findElement(email_title).getText();
Assert.assertEquals(emailtitletext, "Email Details");

String emailsubtext = driver.findElement(email_subtext).getText();
Assert.assertEquals(emailsubtext, "Get your order details emailed to");

String emailid =driver.findElement(email_id).getText();
System.out.println("Email id = " +emailid);

MobileElement emailmebutton = driver.findElement(email_emailme_button);
String emailmebutton_text = emailmebutton.getText();
Assert.assertEquals(emailmebutton_text, "Email Me");

MobileElement emailcancel =driver.findElement(email_cancelbutton);
String emailcancelbuttontext = emailcancel.getText();
Assert.assertEquals(emailcancelbuttontext, "Cancel");

emailcancel.tap(1, 200);


}

}





