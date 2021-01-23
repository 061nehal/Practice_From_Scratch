package ActionClassChildWindowIframe;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\ITTraining\\AllDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///D:/ITTraining/OurWebSite.html");
		driver.findElement(By.linkText("Click here for Google")).click();
		
		
		String mainWindow=driver.getWindowHandle();
		Set<String> childWindow=driver.getWindowHandles();
		
		for(String child:childWindow) 
		{
		 driver.switchTo().window(child);	
		}
		driver.findElement(By.name("q")).sendKeys("Bangladesh");
		
		driver.switchTo().window(mainWindow);
		driver.findElement(By.id("LN")).sendKeys("Hasnain");
		Thread.sleep(2000);
		
		for(String child:childWindow)
		{
			driver.switchTo().window(child);
		}
		driver.findElement(By.cssSelector("a[data-pid='2']")).click();
		
		
		
		

	}

}
