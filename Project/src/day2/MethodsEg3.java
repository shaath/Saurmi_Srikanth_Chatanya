package day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodsEg3 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.bing.com/");
		driver.manage().window().maximize();
		
//		System.out.println(driver.getTitle());
//		
//		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getPageSource());
		
	}

}
