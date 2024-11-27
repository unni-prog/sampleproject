/**
 * 
 */
package selenium;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

/**
 * 
 */
public class Log3 {
	WebDriver driver;
	Properties prop;
	public void readprop() throws IOException
	{
		prop=new Properties ();
		FileInputStream fileinp=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\cucumber\\selenium\\src\\test\\resources\\config.properties");
		prop.load(fileinp);
		
	}
@BeforeTest
public void setConfig() throws IOException
{
	readprop();

	driver=new ChromeDriver();
    driver.get(prop.getProperty("url"));
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

}


}
