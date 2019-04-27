/**
 * 
 */
package SprintImplementation;

import org.testng.annotations.Test;

import Utilities.coreutil;

/**
 * @author Russe
 * This class will contain all testng test annotations where we will conduct our test cases.
 */
public class smoketest extends coreutil{
	
	@Test
	public void baaltest(){
		
		openBrowser();
		goToWebApp();
		closeBrowser();
		
	}

}
