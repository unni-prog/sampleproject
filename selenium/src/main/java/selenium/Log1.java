
package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Log1 {

	WebDriver driver;

	public Log1(WebDriver driver2) {
	this.driver=driver2;	// TODO Auto-generated constructor stub
	}
	public void setUserName(String username) {

		WebElement uname= driver.findElement(By.xpath("//input[@name='userId']"));

		uname.sendKeys(username);

			
	}
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		WebElement passbox=driver.findElement(By.xpath("//input[@type='password']"));

		passbox.sendKeys(password);
	}

	public void login() {
		WebElement log=driver.findElement(By.xpath("//button[@class='bg-[#32b1dc] w-2/3 rounded-xl hover:bg-[#11a5d7] active:opacity-70 text-white font-bold py-2 px-4 mt-10 h-14 text-[20px] cursor-pointer']"));
		log.click();
	}
	public void viewdetails() throws InterruptedException 
	{
		Thread.sleep(1000);
		WebElement view=driver.findElement(By.xpath("/html/body/div/div/div[4]/div/table/tbody/tr[5]/td[8]/button[1]/div/div/svg/path"));
		view.click();
	}
	public void update()
	{
	WebElement updat=driver.findElement(By.xpath("/html/body/div/div/div[4]/div/table/tbody/tr[1]/td[8]/button[3]"));
	updat.click();
}
   public void delet()
   {
	   WebElement delt=driver.findElement(By.xpath("/html/body/div/div/div[4]/div/table/tbody/tr[1]/td[8]/button[2]/div/div/svg/path"));
	   delt.click();
   }
   public void exportcsv()
   {
	   
	   WebElement csv=driver.findElement(By.xpath("/html/body/div/div/div[2]/div[2]/div/a"));
	   csv.click(); 
   }
	
     public void milestone() throws InterruptedException
     {
    	 WebElement mile=driver.findElement(By.xpath("/html/body/div/div/div/main/div[11]/div/div/div/h2"));
    	 mile.click();
    	 Thread.sleep(1000);
    	 }
     


}
