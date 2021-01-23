package AutoSuggestiveDropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys("Beng");
		
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		Thread.sleep(3000);
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ENTER);
		//System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		
		//	Javascript DOM can extract hidden element
		//because Selenium can not identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it has any hidden text 
		
		//Javascript Executor
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script="return document.getElementById(\"fromPlaceName\").value;";
		
		String text=(String)js.executeScript(script);
		System.out.println(text);
		
		
		
		

	}

}
