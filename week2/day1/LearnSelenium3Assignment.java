package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium3Assignment {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//using id 
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//using class name 
		driver.findElementById("password").sendKeys("crmsfa");
		//click login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//get Title and Verify it
		String title = driver.getTitle();
		System.out.println("The title in the page is :  "+title);
		if(title.contains("Leaftaps")) {
			System.out.println("title is verified");
		} else {
			System.out.println("Title does not have word LeafTaps");
		}
		
		//click on CRM/SFA link
		 driver.findElementByLinkText("CRM/SFA").click(); Thread.sleep(3000);
		 
		 //click on Leads button
		 driver.findElementByLinkText("Leads").click(); Thread.sleep(1000);
		 
		 //click on create lead button
		 driver.findElementByLinkText("Create Lead").click(); Thread.sleep(1000);
		 driver.findElementById("createLeadForm_companyName").sendKeys("HoneyBee");
		 Thread.sleep(1000);
		 driver.findElementById("createLeadForm_firstName").sendKeys("NEON");
		 Thread.sleep(1000);
		 driver.findElementById("createLeadForm_lastName").sendKeys("Mahith");
		 Thread.sleep(1000);
		 driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Test1");
		 driver.findElementById("createLeadForm_lastNameLocal").sendKeys("Test1");
		 driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Test1");
		 driver.findElementById("createLeadForm_birthDate").sendKeys("04/21/94");
		 driver.findElementById("createLeadForm_sicCode").sendKeys("21041994");
		 WebElement sourceDropDown = driver.findElementById("createLeadForm_dataSourceId"); 
		 Select dropdown = new  Select(sourceDropDown);
		 dropdown.selectByIndex(1);
		 
		 WebElement sourceDropDown1 = driver.findElementById("createLeadForm_marketingCampaignId"); 
		 Select dropdown1 = new  Select(sourceDropDown1);
		 dropdown1.selectByIndex(1);
		  
		 WebElement sourceDropDown2 = driver.findElementById("createLeadForm_industryEnumId"); 
		 Select dropdown2 = new  Select(sourceDropDown2);
		 dropdown2.selectByIndex(1);
		 
		 WebElement sourceDropDown3 = driver.findElementById("createLeadForm_industryEnumId"); 
		 Select dropdown3 = new  Select(sourceDropDown3);
		 dropdown3.selectByValue("IND_SOFTWARE");
		 
		 WebElement sourceDropDown4 = driver.findElementById("createLeadForm_currencyUomId"); 
		 Select dropdown4 = new  Select(sourceDropDown4);
		 dropdown4.selectByIndex(1);
		 
		 //Contact Info
		 driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("7708640245");
		 driver.findElementById("createLeadForm_primaryEmail").sendKeys("mahi.india1994@gmail.com");
		 driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Mahith");
		 
		 //PrimaryAddress
		 driver.findElementById("createLeadForm_generalToName").sendKeys("Mahith");
		 driver.findElementById("createLeadForm_generalAddress1").sendKeys("No123");
		 driver.findElementById("createLeadForm_generalCity").sendKeys("XYZ");
		 driver.findElementById("createLeadForm_generalCity").sendKeys("XYZ");
		 driver.findElementByName("generalPostalCode").sendKeys("324102988");
		 driver.findElementByName("generalPostalCodeExt").sendKeys("210");
		 
		 
		 WebElement primaryAddress_State = driver.findElementById("createLeadForm_generalStateProvinceGeoId"); 
		 Select dropdown5 = new  Select(primaryAddress_State);
		 dropdown5.selectByVisibleText("California");
		 WebElement primaryAddress_Country = driver.findElementById("createLeadForm_generalCountryGeoId"); 
		 Select dropdown6 = new  Select(primaryAddress_Country);
		 dropdown6.selectByVisibleText("United States");
		 
		 //click create Lead 
		 driver.findElementByClassName("smallSubmit").click();
		  
		 //click Duplicate Lead
		 driver.findElementByLinkText("Duplicate Lead").click();
		 Thread.sleep(2000);
		 //clear the company name
		 driver.findElementById("createLeadForm_companyName").clear();
		 driver.findElementById("createLeadForm_companyName").sendKeys("TurtleWine");
		 //click create Lead 
		 driver.findElementByClassName("smallSubmit").click();
		 
		 //get the duplicate company name and Verify
		 WebElement getCompanyName = driver.findElementById("viewLead_companyName_sp");
		 System.out.println(getCompanyName.getText());
		 String S = getCompanyName.getText();
		 if(S.contains("TurtleWine")) {
			 System.out.println("Duplicate value Company name TurtleWine is verified");
		 } else {
			 System.out.println("Duplicate value Company name is NOT TurtleWine ");
		 }
		 
		 driver.close();
		 
		

	}

}
