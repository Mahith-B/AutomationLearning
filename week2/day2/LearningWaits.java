package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningWaits {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub


			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
					
			driver.get("http://leaftaps.com/opentaps/control/login");
			driver.manage().window().maximize();
			Thread.sleep(10000); // by default it will wait for 10 seconds
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // will only wait till the element to be responded.
		
		
	}

}
