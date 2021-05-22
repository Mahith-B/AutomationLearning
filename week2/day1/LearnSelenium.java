package week2.day1;

import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		// pre-condition : Set up the driver path
		WebDriverManager.chromedriver().setup();
		//WebDriverManager.firefoxdriver().setup();
		//WebDriverManager.iedriver().setup();
		
		//Step 1: to open Chrome browser 
		ChromeDriver driver = new ChromeDriver();
		
		//Step 2: launch URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Step 3: To window maximize
		//three lines of code for windows maximize
		//Options manage = driver.manage();
		//Window window = manage.window();
		//window.maximize();
		
		driver.manage().window().maximize();
		
		//to wait
		Thread.sleep(10000);
		
		//to close the driver
		driver.close();
		
		
		
		
		

	}

}
