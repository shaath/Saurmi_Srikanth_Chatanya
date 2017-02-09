package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

public class RadioButtonsEg2 
{
	public static void main(String[] args) 
	{
		ProfilesIni pr=new ProfilesIni();
		FirefoxProfile fp=pr.getProfile("MyProfile");
		WebDriver driver=new FirefoxDriver(fp);
//		WebDriver driver=new FirefoxDriver();
		driver.get("http://echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		
		WebElement block=driver.findElement(By.xpath("html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
//		List<WebElement> list=block.findElements(By.tagName("input"));
//		
//		System.out.println(list.size());
//		
//		for (int i = 0; i < list.size(); i++)
//		{
//			String text=list.get(i).getAttribute("value");
//			System.out.println(text);
//			if (text.equalsIgnoreCase("milk"))
//			{
//				list.get(i).click();
//			}
//			else if (text.equalsIgnoreCase("beer"))
//			{
//				list.get(i).click();
//			}
//		}
		
		List<WebElement> g1=block.findElements(By.name("group1"));
		System.out.println(g1.size());
		for (int i = 0; i < g1.size(); i++) 
		{
			String text=g1.get(i).getAttribute("value");
			if (text.equalsIgnoreCase("milk"))
			{
				g1.get(i).click();
				break;
			}
			
		}
	}

}