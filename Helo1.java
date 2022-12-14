package Cure_MD;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sample2333.Object_Class;

public class Helo1 {
	
	WebDriver driver=new ChromeDriver();
	Helo2 object=new Helo2(driver);
	
	@BeforeTest
	public void Before_method() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\4391\\Desktop\\chromedriver_win32\\chromedriver.exe");
		driver.get("http://release01.curemd.com/curemdy/datlogin.asp");
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		}
	@Test(priority=0)
	public void Case0() throws InterruptedException, IOException {
		object.login();
		
		
	}
	@Test(priority=1)
	public void Case1() throws InterruptedException, IOException {
		object.pateintclick();
		object.Enterdetails();
		object.primaryinsurance();
		object.Notes();
		
		
		
		
		
	}

}
