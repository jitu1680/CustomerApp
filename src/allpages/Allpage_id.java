package allpages;

import org.openqa.selenium.By;

public class Allpage_id {
	//Search feed page.
	public By feedsearch = By.id("com.grofers.customerapp:id/dummy_merchant_search_bar");
	
	//Search after taping search on feed page
  public By search = By.id("com.grofers.customerapp:id/edit_text_search");
	
	//add button "+" button after searching items.
	public By addbutton_searched = By.id("com.grofers.customerapp:id/add_to_cart");
	
	
	//Cart button at bottom
	public By taketocart = By.id("com.grofers.customerapp:id/checkout_button");
	
	//logout 
	public By logoutbutton = By.id("com.grofers.customerapp:id/text_logout");
	public By logout_text = By.id("com.grofers.customerapp:id/dialog_delivery_desc");
	public By logout_yes = By.id("com.grofers.customerapp:id/dialog_button3");
	public By logout_no = By.id("com.grofers.customerapp:id/dialog_button1");
	public By logout_title = By.id("com.grofers.customerapp:id/dialog_delivery_title");
	
	//My cart elements
	public By checkoutbutton = By.id("com.grofers.customerapp:id/checkout_cart_button");
	public By cart_checkout_price = By.id("com.grofers.customerapp:id/cart_checkout_price");
	public By cart_rupee_symbol = By.id("com.grofers.customerapp:id/cart_rupee");
	
	//Checkout page
	public By proceedtopayment = By.id("com.grofers.customerapp:id/btn_groferIt");
	public By checkout_address_text = By.id("com.grofers.customerapp:id/checkout_address_text");
	public By delivery_time = By.id("com.grofers.customerapp:id/tv_time_picker");


    //payment option page
    public By payment_option = By.id("com.grofers.customerapp:id/paymentOption_title");
    public By total_amount_paymentoptionpage = By.id("com.grofers.customerapp:id/payable_amount");
    public By pamentoption_backbutton = By.xpath("//android.widget.ImageButton[@content-desc= 'Navigate up']");
    
    
}