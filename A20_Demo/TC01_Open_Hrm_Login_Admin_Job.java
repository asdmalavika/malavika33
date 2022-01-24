package A20_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Open_Hrm_Login_Admin_Job {
	
	WebDriver driver;
	
	
  @Test
  public void Open_orange_hrm() {
	  
	  
	  System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver_win32\\\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  driver.findElement(By.id("menu_admin_Job")).click();
	  driver.findElement(By.id("menu_admin_viewJobTitleList")).click();
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("jobTitle_jobTitle")).sendKeys("Python3");
	  driver.findElement(By.id("jobTitle_jobDescription")).sendKeys("Python3 desc");
	  driver.findElement(By.id("btnSave")).click();
	  driver.quit();
	 
  }
  
}
