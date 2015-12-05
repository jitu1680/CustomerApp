package allpages;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
//import junit.framework.Assert;
import nevigationdrawer.All_Elements_Nevigationdrawer;

public class Addressitems {
	
	
	AndroidDriver<MobileElement> driver;
	General gen;
	All_Elements_Nevigationdrawer objlogin;
	
	public Addressitems(AndroidDriver<MobileElement> driver, General gen, All_Elements_Nevigationdrawer objlogin) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		this.gen = gen;
		this.objlogin =objlogin;
	}
	
	//Address items
	


	public By Add_address = By.id("com.grofers.customerapp:id/add_address_cell");
	public By Address_option_button = By.id("com.grofers.customerapp:id/tv_popup");
	public By Address_back_button = By.xpath("//android.widget.FrameLayout//android.widget.ImageButton");
	public By Address_edit_button = By.xpath("//android.widget.TextView[@text='Edit']");
	public By Address_delete_button = By.xpath("//android.widget.TextView[@text='Delete']");
	public By Address_addTitle = By.id("com.grofers.customerapp:id/title_verify_phone");
	public By EditAddress_title = By.id("com.grofers.customerapp:id/title_verify_phone");
	public By update_Address = By.id("com.grofers.customerapp:id/verify_upload_text");
	public By EditAddress_Name =By.id("com.grofers.customerapp:id/address_name_text");
	public By editAddress_line1 =By.id("com.grofers.customerapp:id/address_house_text");
	public By editAddress_line2 = By.id("com.grofers.customerapp:id/address_society_text");
	public By editAddress_locality = By.id("com.grofers.customerapp:id/address_locality_text");
	public By AddAddress_title = By.id("com.grofers.customerapp:id/title_verify_phone");
	public By addaddress_addbutton = By.id("com.grofers.customerapp:id/verify_upload_text");
	public By invalid_address = By.id("android.widget.TextView[Text ='Address is invalid']");
	public By delete_yes = By.id("com.grofers.customerapp:id/dialog_button3");
	public By delete_no = By.id("com.grofers.customerapp:id/dialog_button1");
	public By delete_dialogbox_content =By.id("com.grofers.customerapp:id/dialog_delivery_desc");
	public By delete_dialogbox_heading =By.id("com.grofers.customerapp:id/dialog_delivery_title");
	public By Editaddress_backbutton = By.xpath("//com.grofers.customerapp[@content-desc='Navigate up']");
	public By Label_home = By.id("com.grofers.customerapp:id/address_radio_button_home");
	public By label_office =By.id("com.grofers.customerapp:id/address_radio_button_office");
	public By label_other = By.id("com.grofers.customerapp:id/address_radio_button_others");
	public By Label_text = By.id("com.grofers.customerapp:id/label_text_view");
	
	
	



public void Newaddress_addision()
{
  gen.b_waithere20();
  gen.d_opennevigationPane();
  MobileElement Address = driver.findElement(objlogin.Nevigation_My_Address);
  Address.tap(1, 200);
  MobileElement Address_add = driver.findElement(Add_address);
  Address_add.tap(1, 200);
  String addaddress_title = driver.findElement(AddAddress_title).getText();
  Assert.assertEquals(addaddress_title, "Add Address");
  //MobileElement backbutton = driver.findElement(Editaddress_backbutton);
  //backbutton.isDisplayed();
  MobileElement  addressline1 = driver.findElement(editAddress_line1);
  addressline1.tap(1, 200);
  addressline1.sendKeys("house.no 1103");
  MobileElement addressline2 = driver.findElement(editAddress_line2);
  addressline2.tap(1, 200);
  addressline2.sendKeys("Sector 46 gurgaon");
  MobileElement Add_AddressButton = driver.findElement(addaddress_addbutton);
  Add_AddressButton.tap(1, 200);
  }




public void Address_modification()
{
	gen.b_waithere20();
	MobileElement modifyoption = driver.findElement(Address_option_button);
	modifyoption.tap(1, 200);
	System.out.println("Address option button clicked");
	MobileElement modifybutton= driver.findElement(Address_edit_button);
	modifybutton.tap(1,200);
	Address_labels_home();
	String edittitle = driver.findElement(EditAddress_title).getText();
	Assert.assertEquals(edittitle, "Edit Address");
	//MobileElement backbutton = driver.findElement(Editaddress_backbutton);
	//backbutton.isDisplayed();
	MobileElement  addressline1 = driver.findElement(editAddress_line1);
	addressline1.tap(1, 200);
	addressline1.sendKeys("Modifyed");
	MobileElement addressline2 = driver.findElement(editAddress_line2);
	addressline2.tap(1, 200);
	addressline2.sendKeys("Address modifyed ");
	MobileElement update = driver.findElement(update_Address);
	update.tap(1, 200);
	
	
}



public void Address_delete()
{
	gen.b_waithere20();
	MobileElement modifyoption = driver.findElement(Address_option_button);
	modifyoption.tap(1, 200);
	MobileElement delete = driver.findElement(Address_delete_button);
	delete.tap(1, 200);
	String Del_heaing= driver.findElement(delete_dialogbox_heading).getText();
	Assert.assertEquals(Del_heaing, "Delete Address?");
	String del_content = driver.findElement(delete_dialogbox_content).getText();
	Assert.assertEquals(del_content, "Are you sure you want to delete this address?");
	MobileElement del_yes = driver.findElement(delete_yes);
	del_yes.tap(1, 200);
	System.out.println("Address_Deleted");
 	
}

//Check weather lable home is selected .

public void Address_labels_home()
{
	MobileElement homelabel = driver.findElement(Label_home);
	homelabel.tap(1, 200);
	String labletext = homelabel.getText();
	Assert.assertEquals(labletext, "Home");
	boolean home = Boolean.valueOf(homelabel.getAttribute("checked"));
	Assert.assertEquals(home, true);
	
	}



}