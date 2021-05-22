package week2.day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningXpath {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		//using id 
		driver.findElementByXPath("//input[@name='USERNAME']").sendKeys("DemoSalesManager");
		//using class name 
		driver.findElementByXPath("//input[@name='PASSWORD']").sendKeys("crmsfa");
		//click login -- partial 
		driver.findElementByXPath("//input[contains(@class,'Submit')]").click();
		//click on link
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//a[text()='Leads']").click();
		Thread.sleep(1000);
		driver.findElementByXPath("//a[text()='Create Lead']").click();
		Thread.sleep(1000);
		
			
		
		driver.findElementByXPath("//input[contains(@id,'companyName')]").sendKeys("HoneyBee");
		Thread.sleep(1000);
		driver.findElementByXPath("(//input[contains(@id,'createLeadForm_lastName')])[1]").sendKeys("NEON");;
		Thread.sleep(1000);
		driver.findElementByXPath("(//input[contains(@id,'first')])[1]").sendKeys("MAHITH");;
		Thread.sleep(1000);
		driver.findElementByXPath("//input[@value='Create Lead']").click();
		Thread.sleep(1000);
		
		WebElement verify = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");
		System.out.println(verify.getText());
		if(verify.equals("MAHITH")) {
			System.out.println("Name is Verified");
		} else {
			System.out.println("name is Not Verified");
		}
		
		
		/*
		 * Advance Xpaths
		 * 
		 * Leads - Find Lead -> xpath for 1st value
		 * 
		 * (//td[@class='x-grid3-col x-grid3-cell x-grid3-td-partyId x-grid3-cell-first
		 * ']/div)[1]
		 * 
		 * 
		 * //merge leads - from lead and To lead (//img[@alt='Lookup'])[1]
		 * (//img[@alt='Lookup'])[2]
		 * 
		 * http://leafground.com/pages/Dropdown.html //option[text()='Select your
		 * programs']/..
		 */


		
		
		
	}

}
