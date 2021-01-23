package Calender;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MonthandDayHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companions");
		Thread.sleep(12000);
		driver.findElement(By.id("travel_date")).click();
		
		
		//month select
		while (!driver.findElement(By.cssSelector("[class=' table-condensed'] [class='datepicker-switch']")).getText().contains("March 2021"));
		{
			driver.findElement(By.cssSelector("[class=' table-condensed'] [class='next']")).click();
		}
		
		
		
		//day select
		List<WebElement>days=driver.findElements(By.cssSelector(".day"));
		int count=driver.findElements(By.cssSelector(".day")).size();
		for(int i=0; i<count; i=i+1)
		{
			String text=driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(text.equalsIgnoreCase("26"))
				{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				break;
				}
		}
		
		
		
		

	}

	private static void While(boolean contains) {
		// TODO Auto-generated method stub
		
	}

}
