package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		/*driver.get("https://facebook.com");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Nehal");
		//driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("Hasnain");
		
		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Nehal");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Hasnain");*/

		driver.get("https://login.salesforce.com/?locale=ca");
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("salesforce");
		//driver.findElement(By.xpath("//*[@type='password']")).sendKeys("salesforcepassword");
		
		driver.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("salesforce");
		driver.findElement(By.xpath("//input[contains(@name,'pw')]")).sendKeys("salesforcepasssword");
	}

}
