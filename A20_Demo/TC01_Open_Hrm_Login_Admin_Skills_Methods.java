package A20_Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TC01_Open_Hrm_Login_Admin_Skills_Methods {
	
	WebDriver driver;
	
	
  @Test
  public void Open_orange_hrm() throws Exception {
	  
	  TC01_Open_Hrm_Login_Admin_Skills_Methods t1=new TC01_Open_Hrm_Login_Admin_Skills_Methods();
	  t1.Openchromebrowser();
	  t1.Openorangehrm();
	  t1.Login();
	  t1.Add_skills();
	 t1.Closebrowser();
  }
  public void Openchromebrowser() throws Exception {
 
	  System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver_win32\\\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }
  public void Openorangehrm() throws Exception {
	  
	  driver.get("https://opensource-demo.orangehrmlive.com/");
  }
	  
	  
	  public void Login() throws Exception {
	  
	  driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	  driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  }
	  
	  public void Add_skills() throws Exception {
		  

	  driver.findElement(By.id("menu_admin_viewAdminModule")).click();
	  driver.findElement(By.id("menu_admin_Qualifications")).click();
	  driver.findElement(By.id("menu_admin_viewSkills")).click();
	  driver.findElement(By.id("btnAdd")).click();
	  driver.findElement(By.id("skill_name")).sendKeys("Java73");
	  driver.findElement(By.id("skill_description")).sendKeys("Java73 desc");
	  driver.findElement(By.id("btnSave")).click();
	  }	

	  public void Closebrowser() throws Exception {

	 driver.quit();
	  }
}
