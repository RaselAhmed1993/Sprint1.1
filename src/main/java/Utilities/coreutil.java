/**
 * 
 */
package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Russell
 * This class will contain all methods for generic utilities.
 */
public class coreutil implements coremethods{

	WebDriver driver;
	//String webapp = "https://www.servicenow.com/";
	
	public void openBrowser() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Russe\\OneDrive\\Documents\\Workspace_04272019\\Sprint1.1\\src\\main\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//implicit wait coming wait class. Implicit wait is used to give webpage enough time to load all web elements.
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	public void goToWebApp() {
		// TODO Auto-generated method stub
		driver.get("https://www.servicenow.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	public void closeBrowser() {
		// TODO Auto-generated method stub
		
		if(driver != null) {
			driver.close();   //closes the tab
			driver.quit();	  //close the browser session / browser instance.
		}

		
	}
	
	/* We are implementing the interface coremethods in this class.
*/
	
	

}
