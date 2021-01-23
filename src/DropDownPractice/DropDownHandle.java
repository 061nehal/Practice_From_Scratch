package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		/*SuperTech Website
		driver.get("file:///D:/ITTraining/WebSite/SuperTech.html");
		
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"form5\"]/select[1]")));
		
		s.selectByValue("orange");
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Mango");
		driver.findElement(By.xpath("//*[@id=\"form5\"]/select[1]")).getText();
		
		Thread.sleep(2000);
		*/
		
		
		
		/* qaacademy practice
		driver.get("http://qaclickacademy.com/practice.php#top");
		
		Select s=new Select(driver.findElement(By.id("dropdown-class-example")));
		
		s.selectByValue("option1");
		
		Thread.sleep(2000);
		
		s.selectByVisibleText("Option3");
		
		*/
		
		// spicejet
		driver.get("https://www.spicejet.com/Default.aspx");
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).getText());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		Select s=new Select(driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_Adult\"]")));
		s.selectByVisibleText("8");
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"divpaxinfo\"]")).getText());
		
		Thread.sleep(2000);
		
		
		
		driver.close();
		
	}

}
