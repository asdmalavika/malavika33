package A20_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Open_Hrm_Login_Admin_Job_static_Methods {
	
	static WebDriver driver;
	
	
  @Test
  public static void Open_orange_hrm() throws Exception {
	  
	  TC01_Open_Hrm_Login_Admin_Job_static_Methods.OpenChromeBrowser();
	  TC01_Open_Hrm_Login_Admin_Job_static_Methods.Openorangehrm();
	  TC01_Open_Hrm_Login_Admin_Job_static_Methods.Login();
	  TC01_Open_Hrm_Login_Admin_Job_static_Methods.Addjobs();
	  TC01_Open_Hrm_Login_Admin_Job_static_Methods.Closebrowser();

	  
  }
  
  public static WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		
		return elem;
	}
	  
	  public static void OpenChromeBrowser() throws Exception {
		  
	 
	  System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver_win32\\\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  }
	  public static void Openorangehrm() throws Exception {

	  driver.get("https://opensource-demo.orangehrmlive.com/");
	  
	  }
	  public  static void Login() throws Exception {

	  findElement(By.id("txtUsername")).sendKeys("Admin");
	  findElement(By.id("txtPassword")).sendKeys("admin123");
	  findElement(By.id("btnLogin")).click();
	  
	  }
	  public static void Addjobs() throws Exception {
		  
	  findElement(By.id("menu_admin_viewAdminModule")).click();
	  findElement(By.id("menu_admin_Job")).click();
	  findElement(By.id("menu_admin_viewJobTitleList")).click();
	  findElement(By.id("btnAdd")).click();
	  findElement(By.id("jobTitle_jobTitle")).sendKeys("Python63");
	  findElement(By.id("jobTitle_jobDescription")).sendKeys("Python63 desc");
	  findElement(By.id("btnSave")).click();
	  }
	  
	 public static void Closebrowser() throws Exception {
		  
      driver.quit();
	 
  }
  
}
