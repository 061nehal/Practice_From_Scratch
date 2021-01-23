package DropDownPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestDrpoBoxAndCheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nehal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		
		WebElement from=driver.findElement(By.xpath("//*[@id='fromCity']"));
		from.sendKeys("DAC");
		Thread.sleep(6000);
		
		//have to check as arrow is not navigating down
		from.sendKeys(Keys.ARROW_DOWN);
		
		
		driver.close();

	}

}
