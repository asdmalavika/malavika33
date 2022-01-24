package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  TC01_highlight {
	
	WebDriver driver;
	
	
  @Test
  public void Add_job() throws Exception {
	  
	  TC01_highlight t1=new TC01_highlight();
	  t1.OpenChromeBrowser();
	  t1.OpenOrangeHRM();
	  t1.Login();
	  t1.Add_skills();
  }
	  
	  public void OpenChromeBrowser() throws Exception{

	  System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver_win32\\\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  }  
	  
	  public void OpenOrangeHRM() throws Exception {

	  
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
	  driver.findElement(By.id("skill_name")).sendKeys("java265");
      driver.findElement(By.id("btnSave")).click();

	  }
	  
	  
  }
