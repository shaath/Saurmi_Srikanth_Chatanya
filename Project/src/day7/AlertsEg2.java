package day7;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertsEg2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath(".//*[@id='demon_content']/div[2]/input")).click();
		
		driver.findElement(By.id("loginbutton")).click();
		Sleeper.sleepTightInSeconds(3);
		Alert alt=driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		alt.accept();
	}

}
