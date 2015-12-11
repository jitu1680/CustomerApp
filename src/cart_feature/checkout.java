package cart_feature;

import io.appium.java_client.MobileElement;

import org.testng.annotations.Test;

import test.testappandroid;

public class checkout extends testappandroid {
	
	
	// go to checkout page.
	@Test (groups = "sanity", priority=4)
	public void testcase_4()
	{
		System.out.println("Test Case 4 Executing....");
		System.out.println("click on chekcout");
		MobileElement tapchekout = driver.findElement(allid.checkoutbutton);
		tapchekout.tap(1, 200);
		
		String Titlecheckout = driver.findElement(allid.chekoutpage_title).getText();
		org.testng.Assert.assertEquals(Titlecheckout, "Checkout");
		
		String TotalamountText = driver.findElement(allid.totalamount_text).getText();
		org.testng.Assert.assertEquals(TotalamountText,"Total Amount");
		
		String DeliveryamountText = driver.findElement(allid.deliverycharges_text).getText();
		org.testng.Assert.assertEquals(DeliveryamountText, "Delivery Charges");
		
		String Amountpayable = driver.findElement(allid.amountPayable_text).getText();
		org.testng.Assert.assertEquals(Amountpayable, "Amount Payable");
		
		String Promocode = driver.findElement(allid.gotPromo_text).getText();
		org.testng.Assert.assertEquals(Promocode, "Got a promo code?");
	    
		
		
		String DeliveryaddressTitleText = driver.findElement(allid.checkout_addresstitle).getText();
		org.testng.Assert.assertEquals(DeliveryaddressTitleText, "Delivery Address");
		
		String DeliverytimeTitleText = driver.findElement(allid.checkout_timetitle).getText();
		org.testng.Assert.assertEquals(DeliverytimeTitleText, "Schedule Delivery Date & Time");
		
		
//		String Terms = driver.findElement(allid.TC_text).getText();
//		org.testng.Assert.assertEquals(Terms, "By using this application, you agree to the \n"
//				+ "Terms of Service and Privacy Policy");
		
		String  ProceedtoPaymentText =driver.findElement(allid.proceedtopayment).getText();
		org.testng.Assert.assertEquals(ProceedtoPaymentText, "Proceed to Payment");
		
		System.out.println("Test Case 4 Executed !!!");
		
	}

}
