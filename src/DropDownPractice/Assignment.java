package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		//driver.close();

	}

}
