package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TC01_Add_Skills_parameters {
	
     WebDriver driver;
	
	//step1 declaring global varaibles
	String Testurl="https://opensource-demo.orangehrmlive.com/";
	String Username="Admin",password="admin123";
	String Skillname="java268";
	
  @Test
  public void Addskills_parameters() throws Exception {
	  
	  TC01_Add_Skills_parameters t1=new TC01_Add_Skills_parameters();
	  t1.OpenChromeBrowser();
	  t1.OpenOrangeHRM(Testurl);
	  t1.Login(Username,password);
	  t1.Add_skills(Skillname);
  }
  
  public  WebElement findElement(By by) throws Exception 
	{

		WebElement elem = driver.findElement(by);  
		
		if (driver instanceof JavascriptExecutor) 
		{
		 ((JavascriptExecutor)driver).executeScript("arguments[0].style.border='3px solid red'", elem);
	 
		}
		return elem;
	}


	  
	  
	  public void OpenChromeBrowser() throws Exception{

		  System.setProperty("webdriver.chrome.driver","C:\\\\chromedriver_win32\\\\chromedriver.exe");
		  driver =new ChromeDriver();
		  driver.manage().window().maximize();
		  
		  }  
		  
		  public void OpenOrangeHRM(String testurl1) throws Exception {

		  
		  driver.get(testurl1);
		  
		  }
		  
		  
		  public void Login(String Username1,String password1 ) throws Exception {
		  
		  findElement(By.id("txtUsername")).sendKeys(Username1);
		  findElement(By.id("txtPassword")).sendKeys(password1);
		  findElement(By.id("btnLogin")).click();
		  }
		  
		  public void Add_skills(String skillname1) throws Exception {

		  findElement(By.id("menu_admin_viewAdminModule")).click();
		  findElement(By.id("menu_admin_Qualifications")).click();
		  findElement(By.id("menu_admin_viewSkills")).click();
		  findElement(By.id("btnAdd")).click();
		  findElement(By.id("skill_name")).sendKeys(Skillname);
		  findElement(By.id("btnSave")).click();
	  
  }
}
