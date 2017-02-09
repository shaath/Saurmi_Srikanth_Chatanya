package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLogin {

	public static void main(String[] args)
	{
		//Launching the browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launching gmail 
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying the email textbox
		WebElement email=driver.findElement(By.id("Email"));
		//Send the text into email textbox
		email.sendKeys("sharathqedge449");
//		Sleeper.sleepTightInSeconds(10);
		//Delete the text in the textbox
//		email.clear();
		//Clicking on next button
		driver.findElement(By.name("signIn")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		
		//Entering the password in the password textbox
		driver.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("123456789");
		//Clicking on sign in button
		driver.findElement(By.cssSelector("#signIn")).click();
		
	}

}
