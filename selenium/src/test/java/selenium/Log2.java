/**
 * 
 */
package selenium;

import org.testng.annotations.Test;

/**
 * 
 */

	public class Log2 extends Log3 {
		Log1 logobj;
		@Test
		public void posLogin() throws InterruptedException
		{
		logobj=new Log1(driver);
		//parameterized constructor
		logobj.setUserName(prop.getProperty("username"));
		logobj.setPassword(prop.getProperty("password"));
		logobj.login();	
	    logobj.viewdetails();
	    logobj.update();
	    logobj.delet();
	    logobj.exportcsv();
	    logobj.milestone();
	    
	
		}
}
