package nevigationdrawer;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	WebDriver driver;
	public Login (WebDriver driver)
	{
		this.driver = driver;
	}
	
	
	public By Enterphoneno = By.id("com.grofers.customerapp:id/et_enter_phone");
	public By ButtonLogin = By.id("com.grofers.customerapp:id/next_button");
	public By Titletext = By.id("com.grofers.customerapp:id/tv_get_started");
	public By Subtext = By.id("com.grofers.customerapp:id/tv_enter_phone");
	public By alllogintext = By.xpath("//android.widget.LinearLayout//android.widget.TextView");
	

}