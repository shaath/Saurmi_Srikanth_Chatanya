package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg2
{

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(5);
//		driver.get("http://opensource.demo.orangehrmlive.com");
		//Redirecting to the orangehrm app
		driver.navigate().to("http://opensource.demo.orangehrmlive.com");
		Sleeper.sleepTightInSeconds(5);
		//Go back to the google page
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(5);
		//Go forward to orangehrm app
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(5);
		//It will refresh the page
		driver.navigate().refresh();
	}
}