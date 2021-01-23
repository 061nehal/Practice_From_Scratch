package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DayHandle {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		
		driver.findElement(By.id("travel_date")).click();
		List<WebElement> days=driver.findElements(By.cssSelector(".day"));
		
		int count=driver.findElements(By.cssSelector(".day")).size();
		
		for(int i=0; i<count; i=i+1)
		{
			String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("23"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
			}
		}
		
		
		

	}

}
