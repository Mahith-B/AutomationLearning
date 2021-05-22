package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium2 {

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
		//click on link
		driver.findElementByLinkText("CRM/SFA").click();
		Thread.sleep(3000);
		driver.findElementByLinkText("Leads").click();
		Thread.sleep(1000);
		driver.findElementByLinkText("Create Lead").click();
		Thread.sleep(1000);
		
		
		
		driver.findElementById("createLeadForm_companyName").sendKeys("HoneyBee");
		Thread.sleep(1000);
		driver.findElementById("createLeadForm_firstName").sendKeys("NEON");
		Thread.sleep(1000);
		driver.findElementById("createLeadForm_lastName").sendKeys("Mahith");
		Thread.sleep(1000);
		
		//DropDowns
		
		WebElement sourceDropDown = driver.findElementById("createLeadForm_dataSourceId");
		Select dropdown = new Select(sourceDropDown);
		dropdown.selectByIndex(1);
		//dropdown.deselectByValue("LEAD_EMPLOYEE");
		//dropdown.selectByVisibleText("Partner");
		Thread.sleep(1000);
		
		//select healthcare from Industry dropdown
		WebElement sourceDropDown2 = driver.findElementById("createLeadForm_industryEnumId");
		Select dropdown2 = new Select(sourceDropDown2);
		dropdown2.selectByVisibleText("Health Care");
		Thread.sleep(1000);
		
		
		
		driver.findElementByClassName("smallSubmit").click();
		
		
		
		
		
	}

}
