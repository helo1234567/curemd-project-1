package lab3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lab3 {
WebDriver driver;
	
	@BeforeMethod
	public void Step0() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}
	
	@Test()
public void Step1() throws InterruptedException {
	
	
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4));
		WebElement fieldone=driver.findElement(By.xpath("//textarea[@id='ta1']"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@id='ta1']")));
		fieldone.sendKeys("Haroon Butt");
		WebElement description =driver.findElement(By.xpath("//textarea[contains(text(), 'The cat was playing in the garden.')]"));
		description.clear();
		description.sendKeys("hii there.. I'm Haroon");
		Assert.assertNotNull(fieldone);
}
	
	@Test()
	
	public void Step2() throws InterruptedException {

		WebElement table=driver.findElement(By.xpath("//*[@id='table1']"));
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		List<WebElement> heads=table.findElements(By.tagName("th"));
		for(int i=0;i<heads.size();i++) {
			System.out.print(heads.get(i).getText() + "      ");
		}
		Thread.sleep(2000);
		
		for(int r=0;r<rows.size();r++) {
			List<WebElement>  columns= rows.get(r).findElements(By.tagName("td"));
			for(int c=0;c<columns.size();c++) {
				System.out.print(columns.get(c).getText() + "    ");
			}
			System.out.println("  ");
		}
		driver.findElement(By.xpath("//form[contains(text(),'Username: ')]//child::input[@type='text']")).sendKeys("Haroon BUTT");
		driver.findElement(By.xpath("//form[contains(text(),'Username: ')]//child::input[@type='password']")).sendKeys("@@@@***###");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='LogIn']")).click();
		
		
	}
	
	@Test
	public void Step3() throws InterruptedException {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		String currentwindow=driver.getWindowHandle();
		WebElement frameOne=driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		driver.switchTo().frame(frameOne);
		driver.switchTo().window(currentwindow);
		WebElement frameTwo=driver.findElement(By.xpath("//iframe[@id='iframe2']"));
		driver.switchTo().frame(frameTwo);
		driver.switchTo().window(currentwindow);
		driver.findElement(By.xpath("//input[@name='userid' ]")).sendKeys("Haroon Butt ");
		driver.findElement(By.xpath("//input[@name='pswrd' ]")).sendKeys("12345678");
		driver.findElement(By.xpath("//input[@value='Login' ]")).click();
		Thread.sleep(4000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
		
}
	
	@Test
	
public void Step4() throws InterruptedException {
		
		
		String currentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("//option[@value='Hyundaix']")).click();
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='drop1']"));
		Select option= new Select(dropdown);
		Thread.sleep(3000);
		option.selectByVisibleText("doc 3");
		Thread.sleep(2000);
		WebElement text=driver.findElement(By.xpath("//input[@name='fname']"));
		text.clear();
		text.sendKeys("Selenium");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='but2']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[contains(text(),'Register')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='alert2']")).click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//a[contains(text(),'Open a popup window')]")).click();
		java.util.Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			if(!handle.equals(currentwindow)) {
				driver.switchTo().window(handle);
				String popedtext=driver.findElement(By.xpath("//body")).getText();
				System.out.println(popedtext);
				driver.close();
			}
			
		}
		driver.switchTo().window(currentwindow);
		driver.findElement(By.xpath("//button[contains(text(),'Try it')]")).click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		WebElement doubleclick = driver.findElement(By.xpath("//button[contains(text(),'Double click Here')]")); 
		Thread.sleep(2000);
		action.doubleClick(doubleclick).perform();
		Thread.sleep(2000);
		Alert newalert=driver.switchTo().alert();
		newalert.accept();
		driver.findElement(By.xpath("//button[contains(text(),'Check this')]")).click();
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[@id='dte']")).click();
		
	}
	@Test
	
public void Step5() throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='radio1']")).click();
		driver.findElement(By.xpath("//input[@id='alert1']")).click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		Thread.sleep(2000);
		String str=driver.findElement(By.xpath("//input[@id='rotb']")).getText();
		System.out.println(str);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='prompt']")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Cure MD");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("//input[@id='confirm']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		driver.findElement(By.xpath("//div[@id='HTML24']/child::div/input[@class='classone']")).sendKeys(" Cure MD");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@id='HTML28']/child::div/input[@class='classone']")).sendKeys("Haroon Butt");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='Car']")).click();
		//select bag
		driver.findElement(By.xpath("//input[@value='Bag']")).click(); 
		//select book
		driver.findElement(By.xpath("//input[@value='Book']")).click();
		//deselect book
		driver.findElement(By.xpath("//input[@value='Book']")).click();
		//dropdown
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		//Facebook
		Thread.sleep(6000);
		driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();
		
		
		
		driver.close();
		
	}

	
	
	
	

}
