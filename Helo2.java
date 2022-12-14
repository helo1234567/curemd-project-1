package Cure_MD;
import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
public class Helo2 {
	
	Logger log=Logger.getLogger("Helo2");
	WebDriver driver;
		
		
	@FindBy(xpath="//button[@type='button']")
	WebElement login1;

	@FindBy(xpath="//input[@name='vchLogin_Name']")
	WebElement username;

	@FindBy(xpath="//input[@name='vchPassword']")
	WebElement password;
		

	@FindBy(xpath="//i[@class='icon icon-patient']")
	WebElement patient;

	@FindBy(xpath="//iframe[@id='fra_Menu_CureMD']")
	WebElement frame1;


	@FindBy(id="txtFirst_Name")
	WebElement firstname;

	@FindBy(id="txtLast_Name")
	WebElement lastname;

	@FindBy(xpath="//input[@id='txtDOB']")
	WebElement dob;
		
	@FindBy(xpath="//td[@title='Search Patient']")
	WebElement search1;

	@FindBy(xpath="//iframe[@id='fraCureMD_Body']")
	WebElement frame2;


	@FindBy(xpath="//a[contains(text(),'Aaa, ZIXHEENOQK  ')]")
	WebElement click1;

	@FindBy(id="ddlCountry")
	WebElement dropdown;

	@FindBy(xpath="//select[@id='cmbvstatus']")
	WebElement dropdown1;
	
	@FindBy(xpath="//td[@class='ButtonItem' and @title='Add Patient']")
	WebElement addpatient1;
	
	
	@FindBy(xpath="//select[@class='w102P' and @id='cmbVTitle']")
	WebElement title;
	
	@FindBy(xpath="//input[@id='txtVFNAME']")
	WebElement firstname1;
	
	@FindBy(xpath="//input[@id='txtVLNAME' and @type='text']")
	WebElement lastname1;
	
	@FindBy(xpath="//select[@id='cmbVSEX' and @class='w102P']")
	WebElement gender;
	
	@FindBy(xpath="//input[@id='txtDDOB' and @class='w75P']")
	WebElement date;
	
	@FindBy(xpath="//span[@class='select2-selection__arrow']")
	WebElement location;
	
	@FindBy(xpath="//input[@id='txtvcity' and @class='w100P']")
	WebElement city;
	
	@FindBy(xpath="//input[@id='txtVZIP' and @class='w44 fl']")
	WebElement zip;
	
	@FindBy(xpath="//input[@id='txtVEMAIL' and @class='w100P']")
	WebElement email;
	
	
	@FindBy(xpath="//input[@id='txtVSTATE' and @class='fl w30']")
	WebElement state;
	
	@FindBy(xpath="//input[@class='select2-search__field']")
	WebElement location1;
	
	
	@FindBy(id="imgpInsurance")
	WebElement primaryinsurance;
	
	@FindBy(id="cmbIPLANID")
	WebElement plan;
	
	@FindBy(xpath="//select[@id='cmbPlanAdd']")
	WebElement address;
	
	
	@FindBy(id="cmbSECPLANID")
	WebElement secPlan;
	
	@FindBy(id="cmbSecPlanAdd")
	WebElement secInsAddress;
	
	
	@FindBy (xpath="//input[@name='txtSecDSIGNONFILE']")
	WebElement sSignOnFileField;

	@FindBy(id="tdsave")
	WebElement save;
	
	@FindBy(xpath="//img[@id='imgSInsurance']")
	WebElement secondaryInsuranceExpand;
	
	@FindBy (xpath="//select[@name='cmbSECPLANID']")
	WebElement sPlanField;
	
	@FindBy (id="//select[@na")
	WebElement sAddressField;
	
	@FindBy (xpath="//img[@id='imgSInsurance']")
	WebElement sInsuranceIcon;
	
	@FindBy (xpath="//a[@id='Provider_Notes_anchor']")
	WebElement providernote;
	
	@FindBy (xpath="//iframe[@id='fraCureMD_Patient_Menu']")
	WebElement frame5;
	
	@FindBy (xpath="//a[@id='Provider_Notes_New_Case_anchor']")
	WebElement newcase;
	
	@FindBy (xpath="//input[@id='txtVCNAME']")
	WebElement name;
	
	@FindBy (xpath="//input[@name='txtDSTART']")
	WebElement newCaseDOB;
	
	@FindBy (xpath="//td[@id='cmdSubmit']")
	WebElement newCaseSaveButton;
	
	@FindBy(id="imgpInsurance")
	WebElement primaryInsurance;
		@FindBy(id="imgSInsurance")
		WebElement secondaryInsurance;
		@FindBy(id="cmbIPLANID")
		WebElement planDropdown1;
		@FindBy(id="cmbPlanAdd")
		WebElement addressDropdown1;
		@FindBy(id="txtDSIGNONFILE")
		WebElement signoutFile1;
		@FindBy(id="cmbSECPLANID")
		WebElement planDropdown2;
		@FindBy(id="cmbSecPlanAdd")
		WebElement addressDropdown2;
		@FindBy(id="txtSecDSIGNONFILE")
		WebElement signoutFile2;
		@FindBy(id="tdsave")
		WebElement saveButton;
		@FindBy(id="DynamicBHdialogbox")
		WebElement frame4;
		@FindBy(id="saveAsNewButton")
		WebElement saveAsNewButton;

	
	
	Helo2(WebDriver d){
		this.driver=d;
		PageFactory.initElements(d,this);
	}

	public void login() throws InterruptedException { 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(username));
		log.info("enter username");
		username.sendKeys("ChargeFinancial");
		log.info("enter password");
		password.sendKeys("SuPPort.2014");
		log.info("click login");
		login1.click();
		log.info("enter login details and press login");
		//Assert.assertEquals(driver.getTitle(), " Welcome to CureMD");
		
		
	   }
	
	public void pateintclick() throws InterruptedException { 
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		String parenthandle = driver.getWindowHandle();
		java.util.Set<String> handles1=driver.getWindowHandles();								
		for(String handle:handles1) {															
			if(!handle.equals(parenthandle)) {												
				driver.switchTo().window(handle);
				wait.until(ExpectedConditions.visibilityOf(frame1));
				log.info("switch to frame");
				driver.switchTo().frame(frame1);   
				patient.click();
				log.info("click on patient tab");
				driver.switchTo().defaultContent();	
				driver.switchTo().frame(frame2); 
				wait.until(ExpectedConditions.visibilityOf(addpatient1));
				addpatient1.click();
				
			}
			
		}}
			
			public void Enterdetails() throws InterruptedException { 
				
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
				wait.until(ExpectedConditions.visibilityOf(title));
				Select select1= new Select(title);
				select1.selectByIndex(0);;
				Thread.sleep(2000);
				firstname1.sendKeys("asad");
				Thread.sleep(2000);
				lastname1.sendKeys("raza");
				Thread.sleep(3000);
				Select select2= new Select(gender);
				select2.selectByIndex(0);;
				Thread.sleep(2000);
				date.sendKeys("12/08/2022");
				Thread.sleep(3000);
				location.click();
				location1.sendKeys("HOSPITAL",Keys.ENTER);
				city.sendKeys("New York");
				zip.sendKeys("10009");
				email.sendKeys("gasadraza@gmail.com");
				state.sendKeys("pakistan");
				
			}
			
			public void primaryinsurance() throws InterruptedException { 

						
				Select select;
				Actions actions;
				primaryInsurance.click();
				select = new Select(planDropdown1);
				select.selectByVisibleText("AARP");
				Thread.sleep(1000);
				select = new Select(addressDropdown1);
				select.selectByVisibleText("P O BOX 1017");
				signoutFile1.sendKeys("12/14/2022");
				secondaryInsurance.click();
				select = new Select(planDropdown2);
				select.selectByVisibleText("AETNA");
				Thread.sleep(1000);
				select = new Select(addressDropdown2);
				select.selectByVisibleText("P.O. BOX 981106");
				signoutFile2.sendKeys("12/13/2022");
				actions = new Actions(driver);
				actions.sendKeys(Keys.PAGE_UP).build().perform();
				actions.sendKeys(Keys.PAGE_UP).build().perform();
				saveButton.click();
				Thread.sleep(1000);
				
				if(frame4.isDisplayed()) {
					
					
					driver.switchTo().frame(frame4);
					saveAsNewButton.click();
					
					
				}
				
			}
			
				public void Notes() throws InterruptedException { 
				WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
					
				
				driver.switchTo().defaultContent();
				driver.switchTo().frame(frame5);
				wait.until(ExpectedConditions.visibilityOf(providernote));
				providernote.click();
				wait.until(ExpectedConditions.visibilityOf(newcase));	
				newcase.click();
				driver.switchTo().defaultContent();
				driver.switchTo().frame(frame2);
				wait.until(ExpectedConditions.visibilityOf(name));	
				
				name.sendKeys("ahmad");
				newCaseDOB.sendKeys("12/12/2022");
				Thread.sleep(3000);
				newCaseSaveButton.click();
				
				}
				
				
				
				
				

		
			

			
			
		

}
