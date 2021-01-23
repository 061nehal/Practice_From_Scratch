package AutoSuggestiveDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascrpitExecutor {
	//enter BENG
	// get the title that has airport

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		Thread.sleep(3000);
		
		
		//	Javascript DOM can extract hidden element
		//because Selenium can not identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it has any hidden text 
		
		//Javascript Executor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		
		String text=(String)js.executeScript(script);
		//System.out.println(text);
		
		//BENGALURU INTERNATION AIRPORT
		while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
		{
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text=(String)js.executeScript(script);
			//System.out.println(text);
			
		}
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		System.out.println(text);
		
		
		
		
		

	}

}
